package com.example.nio;

import io.netty.buffer.ByteBuf;

import java.nio.IntBuffer;
import java.security.SecureRandom;

/**
 * @author hzq
 * @date 2019/7/14 0014 下午 4:32
 */
public class NioTest1 {

    public static void main(String[] args) {
        IntBuffer buffer = IntBuffer.allocate(10);

        System.out.println("capacity: " +  buffer.capacity());

        for(int i = 0; i < 5; i++){
            int nextInt = new SecureRandom().nextInt(20);
            buffer.put(nextInt);
        }

        System.out.println("before flip limit: " + buffer.limit());

        buffer.flip();

        System.out.println("after flip limit: " + buffer.limit());
        System.out.println("enter while loop");

        while(buffer.hasRemaining()){
            System.out.println("position: " + buffer.position());
            System.out.println("limit: " + buffer.limit());
            System.out.println("capacity: " + buffer.capacity());
            System.out.println(buffer.get());
        }
    }
}
