package com.example.nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author hzq
 * @date 2019/7/15 0015 下午 10:11
 */
public class NioTest8 {

    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream("input2.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("output2.txt");

        FileChannel inputChannel = fileInputStream.getChannel();
        FileChannel outputChannel = fileOutputStream.getChannel();

        ByteBuffer buffer = ByteBuffer.allocateDirect(512);

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
