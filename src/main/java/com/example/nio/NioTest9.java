package com.example.nio;

import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author hzq
 * @date 2019/7/15 0015 下午 10:21
 */
public class NioTest9 {

    public static void main(String[] args) throws Exception {
        RandomAccessFile file = new RandomAccessFile("NioTest9.txt", "rw");

        FileChannel channel = file.getChannel();
        MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_WRITE, 0, 5);

        map.put(0, (byte) 'a');
        map.put(3, (byte) 'b');
        file.close();
    }
}
