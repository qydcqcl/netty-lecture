package com.example.nio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author hzq
 * @date 2019/7/14 0014 下午 6:27
 */
public class NioTest4 {

    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream("input.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("output.txt");

        FileChannel inputChannel = fileInputStream.getChannel();
        FileChannel outputChannel = fileOutputStream.getChannel();

        ByteBuffer buffer = ByteBuffer.allocate(512);

        while(true){

            //去掉clear()方法
            buffer.clear();

            int read = inputChannel.read(buffer);
            if(-1 == read){
                break;
            }

            buffer.flip();
            outputChannel.write(buffer);
        }

        inputChannel.close();
        outputChannel.close();
    }
}
