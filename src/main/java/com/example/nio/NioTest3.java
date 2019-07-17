package com.example.nio;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author hzq
 * @date 2019/7/14 0014 下午 5:04
 */
public class NioTest3 {

    public static void main(String[] args) throws IOException {
        FileOutputStream outputStream = new FileOutputStream("NioTest3.txt");
        FileChannel channel = outputStream.getChannel();

        byte[] message = "hello world, welcome".getBytes();
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        for(int i = 0; i < message.length; i++){
            buffer.put(message[i]);
        }

        buffer.flip();
        channel.write(buffer);
        outputStream.close();
    }
}
