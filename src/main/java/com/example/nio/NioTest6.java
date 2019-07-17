package com.example.nio;

import java.nio.ByteBuffer;

/**
 * @author hzq
 * @date 2019/7/14 0014 下午 6:58
 */
public class NioTest6 {

    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(10);

        for(int i = 0; i < 10; i++){
            buffer.put((byte) i);
        }

        buffer.position(2);
        buffer.limit(6);
        ByteBuffer buffer1 = buffer.slice();

        for(int i = 0; i < buffer1.capacity(); i++){
            byte b = buffer1.get(i);
            b *= 2;
            buffer1.put(b);
        }

        buffer.position(0);
        buffer.limit(buffer.capacity());
        while(buffer.hasRemaining()){
            System.out.println(buffer.get());
        }
    }
}
