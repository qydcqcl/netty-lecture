package com.example.nio;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.time.LocalDateTime;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author hzq
 * @date 2019/7/17 0017 下午 11:14
 */
public class NioClient {

    public static void main(String[] args) {
        try {
            SocketChannel socketChannel = SocketChannel.open();
            socketChannel.configureBlocking(false);
            socketChannel.connect(new InetSocketAddress("localhost", 8080));

            Selector selector = Selector.open();
            socketChannel.register(selector, SelectionKey.OP_CONNECT);

            while (true){
                selector.select();
                Set<SelectionKey> selectionKeys = selector.selectedKeys();
                for(SelectionKey selectionKey : selectionKeys){
                    if(selectionKey.isConnectable()){
                        SocketChannel client = (SocketChannel) selectionKey.channel();
                        if(client.isConnectionPending()){
                            client.finishConnect();
                            ByteBuffer writeBuffer = ByteBuffer.allocate(1024);
                            writeBuffer.put((LocalDateTime.now() + " 连接成功").getBytes());
                            writeBuffer.flip();
                            client.write(writeBuffer);

                            ExecutorService executorService = Executors.newSingleThreadExecutor(Executors.defaultThreadFactory());
                            executorService.submit(() -> {
                                while(true){
                                    try {
                                        writeBuffer.clear();
                                        InputStreamReader input = new InputStreamReader(System.in);
                                        BufferedReader reader = new BufferedReader(input);
                                        String readLine = reader.readLine();

                                        writeBuffer.put(readLine.getBytes());
                                        writeBuffer.flip();
                                        client.write(writeBuffer);

                                    } catch (Exception e){
                                        e.printStackTrace();
                                    }
                                }
                            });
                        }
                        client.register(selector, SelectionKey.OP_READ);
                    }else if(selectionKey.isReadable()){
                        SocketChannel client = (SocketChannel) selectionKey.channel();
                        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
                        int read = client.read(byteBuffer);
                        if(read > 0){
                            String message = new String(byteBuffer.array(), 0, read);
                            System.out.println(message);
                        }

                    }
                }
                selectionKeys.clear();
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
