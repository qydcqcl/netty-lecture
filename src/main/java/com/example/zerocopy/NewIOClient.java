package com.example.zerocopy;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.FileChannel;
import java.nio.channels.SocketChannel;

/**
 * @author hzq
 * @date 2019/7/22 0022 下午 10:46
 */
public class NewIOClient {

    public static void main(String[] args) throws IOException {
        SocketChannel socketChannel = SocketChannel.open();
        socketChannel.connect(new InetSocketAddress("localhost", 8080));
        socketChannel.configureBlocking(true);

        String fileName = "F:\\迅雷下载\\阳光电影www.ygdy8.com.沼泽怪物第一季第06集中英双字.mkv";

        FileChannel fileChannel = new FileInputStream(fileName).getChannel();
        long statTime = System.currentTimeMillis();
        long transferTo = fileChannel.transferTo(0, fileChannel.size(), socketChannel);
        System.out.println("发送总字节数: " + transferTo + ",耗时: " + (System.currentTimeMillis() - statTime));
        fileChannel.close();
    }
}
