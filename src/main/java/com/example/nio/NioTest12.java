package com.example.nio;


import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.util.Iterator;
import java.util.Set;

/**
 * @author hzq
 * @date 2019/7/15 0015 下午 11:19
 */
public class NioTest12 {

    public static void main(String[] args) throws Exception {
        int[] ports = new int[5];
        ports[0] = 8080;
        ports[1] = 8081;
        ports[2] = 8082;
        ports[3] = 8083;
        ports[4] = 8084;

        Selector selector = Selector.open();

        for(int i = 0; i < 5; i++){
            ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
            serverSocketChannel.configureBlocking(false);
            ServerSocket serverSocket = serverSocketChannel.socket();
            InetSocketAddress address = new InetSocketAddress(ports[i]);
            serverSocket.bind(address);

            serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
            System.out.println("监听端口: " + ports[i]);
        }

        while(true){
            int numbers = selector.select();
            System.out.println("numbers: " + numbers);

            Set<SelectionKey> selectionKeys = selector.selectedKeys();
            System.out.println("selectionKeys: " + selectionKeys);

            Iterator<SelectionKey> iterator = selectionKeys.iterator();
            while(iterator.hasNext()){
                SelectionKey selectionKey = iterator.next();

                if(selectionKey.isAcceptable()){
                    ServerSocketChannel serverSocketChannel = (ServerSocketChannel) selectionKey.channel();
                    SocketChannel socketChannel = serverSocketChannel.accept();
                    socketChannel.configureBlocking(false);

                    socketChannel.register(selector, SelectionKey.OP_READ);
                    iterator.remove();

                    System.out.println("获取的客户端连接: " + socketChannel);

                }else if(selectionKey.isReadable()){
                    SocketChannel socketChannel = (SocketChannel) selectionKey.channel();
                    int bytesRead = 0;
                    while(true){
                        ByteBuffer byteBuffer = ByteBuffer.allocate(512);
                        byteBuffer.clear();
                        int read = socketChannel.read(byteBuffer);
                        if(read <= 0){
                            break;
                        }

                        byteBuffer.flip();
                        socketChannel.write(byteBuffer);
                        bytesRead += read;
                    }

                    System.out.println("读取: " + bytesRead + ", 来自于: " + socketChannel);

                    iterator.remove();
                }
            }

        }


    }
}
