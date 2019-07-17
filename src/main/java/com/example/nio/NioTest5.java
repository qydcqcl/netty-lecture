package com.example.nio;

import java.nio.ByteBuffer;

/**
 * @author hzq
 * @date 2019/7/14 0014 下午 6:49
 */
public class NioTest5 {

    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(512);
        buffer.putInt(4);
        buffer.putLong(50000000L);
        buffer.putDouble(23.12345);
        buffer.putChar('号');
        buffer.putShort((short) 2);
        buffer.putChar('号');

        buffer.flip();

        System.out.println(buffer.getInt());
        System.out.println(buffer.getLong());
        System.out.println(buffer.getDouble());
        System.out.println(buffer.getChar());
        System.out.println(buffer.getShort());
        System.out.println(buffer.getChar());
    }
}
