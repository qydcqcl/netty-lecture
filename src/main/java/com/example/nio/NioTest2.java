package com.example.nio;

import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author hzq
 * @date 2019/7/14 0014 下午 4:57
 */
public class NioTest2 {

    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream("NioTest2.txt");
        FileChannel channel = fileInputStream.getChannel();

        ByteBuffer byteBuffer = ByteBuffer.allocate(512);
        channel.read(byteBuffer);
        byteBuffer.flip();

        while(byteBuffer.remaining() > 0){
            byte b = byteBuffer.get();
            System.out.println("character: " + (char)b);
        }
        fileInputStream.close();

    }
}
