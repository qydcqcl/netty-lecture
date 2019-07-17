package com.example.nio;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/**
 * @author hzq
 * @date 2019/7/15 0015 下午 10:27
 */
public class NioTest10 {

    public static void main(String[] args) throws Exception {
        RandomAccessFile file = new RandomAccessFile("NioTest10.txt","rw");
        FileChannel channel = file.getChannel();
        FileLock lock = channel.lock(3, 6, true);

        System.out.println("vaild: " + lock.isValid());
        System.out.println("lock type: " + lock.isShared());

        lock.release();
        file.close();
    }
}
