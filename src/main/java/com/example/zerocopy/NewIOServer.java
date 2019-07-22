package com.example.zerocopy;

import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

/**
 * @author hzq
 * @date 2019/7/22 0022 下午 10:58
 */
public class NewIOServer {

    public static void main(String[] args) throws Exception {
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        ServerSocket serverSocket = serverSocketChannel.socket();
        serverSocket.setReuseAddress(true);
        serverSocket.bind(new InetSocketAddress(8080));

        ByteBuffer buffer = ByteBuffer.allocate(4096);
        while(true){
            SocketChannel socketChannel = serverSocketChannel.accept();
            socketChannel.configureBlocking(true);
            int readCount = 0;

            while(readCount != -1){
                try {
                    readCount = socketChannel.read(buffer);
                } catch (Exception e){
                    e.printStackTrace();
                }
                buffer.rewind();
            }
        }

    }
}
