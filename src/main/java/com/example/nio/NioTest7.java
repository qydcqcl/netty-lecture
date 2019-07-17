package com.example.nio;

import java.nio.ByteBuffer;

/**
 * @author hzq
 * @date 2019/7/14 0014 下午 7:06
 */
public class NioTest7 {

    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(10);
        for(int i = 0; i < 10; i++){
            buffer.put((byte) i);
        }

        ByteBuffer readOnlyBuffer = buffer.asReadOnlyBuffer();
        System.out.println(readOnlyBuffer.getClass().getName());

        readOnlyBuffer.position(0);
        readOnlyBuffer.put((byte) 2);
    }
}
