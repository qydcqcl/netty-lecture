package com.example.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/**
 * @author hzq
 * @date 2019/7/17 0017 下午 10:40
 */
public class NioServer {

    private static Map<String, SocketChannel> clientMap = new HashMap<>();

    public static void main(String[] args) throws IOException {

        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.configureBlocking(false);
        ServerSocket serverSocket = serverSocketChannel.socket();
        serverSocket.bind(new InetSocketAddress(8080));

        Selector selector = Selector.open();
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);

        while(true){
            try {
                selector.select();
                Set<SelectionKey> selectionKeys = selector.selectedKeys();
                selectionKeys.forEach(selectionKey -> {
                    final SocketChannel client;
                    try {
                        if(selectionKey.isAcceptable()){
                            ServerSocketChannel serverChannel = (ServerSocketChannel) selectionKey.channel();
                            client = serverChannel.accept();
                            client.configureBlocking(false);
                            client.register(selector, SelectionKey.OP_READ);

                            String key = "[" + UUID.randomUUID().toString() + "]";
                            clientMap.put(key, client);

                        }else if(selectionKey.isReadable()){
                            client = (SocketChannel) selectionKey.channel();
                            ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
                            int read = client.read(byteBuffer);
                            if(read > 0){
                                byteBuffer.flip();

                                Charset charset = Charset.forName("utf-8");
                                String s = String.valueOf(charset.decode(byteBuffer));
                                System.out.println(client + ": " + s);

                                String sendKey = null;
                                Set<Map.Entry<String, SocketChannel>> entrySet = clientMap.entrySet();
                                for(Map.Entry<String, SocketChannel> entry : entrySet){
                                    if(client == entry.getValue()){
                                        sendKey = entry.getKey();
                                        break;
                                    }
                                }

                                for(Map.Entry<String, SocketChannel> entry : entrySet){
                                    SocketChannel channel = entry.getValue();
                                    ByteBuffer writeBuffer = ByteBuffer.allocate(1024);
                                    writeBuffer.put((sendKey + ":" + s).getBytes());

                                    writeBuffer.flip();
                                    channel.write(writeBuffer);
                                }
                            }
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
                selectionKeys.clear();
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
