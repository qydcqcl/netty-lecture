package com.example.zerocopy;

import java.io.*;
import java.net.Socket;

/**
 * @author hzq
 * @date 2019/7/22 0022 下午 10:31
 */
public class OldIOClient {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 8080);
        String fileName = "F:\\迅雷下载\\阳光电影www.ygdy8.com.沼泽怪物第一季第06集中英双字.mkv";
        InputStream inputStream = new FileInputStream(fileName);

        OutputStream outputStream = new DataOutputStream(socket.getOutputStream());

        byte[] buffer = new byte[4096];
        long readCount;
        long total = 0;

        long statTime = System.currentTimeMillis();

        while((readCount = inputStream.read(buffer)) >= 0){
            total += readCount;
            outputStream.write(buffer);
        }

        System.out.println("发送总字节数: " + total + ",耗时: " + (System.currentTimeMillis() - statTime));
        outputStream.close();
        socket.close();
        inputStream.close();
    }
}
