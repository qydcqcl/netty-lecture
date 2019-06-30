package com.example.protobuf;

import com.google.protobuf.InvalidProtocolBufferException;

/**
 * @author hzq
 * @date 2019/6/30 0030 上午 11:26
 */
public class ProtobufTest {

    public static void main(String[] args) throws InvalidProtocolBufferException {
        DataInfo.Student student = DataInfo.Student.newBuilder()
                .setName("张三").setAge(18).setAddress("北京").build();
        byte[] bytes = student.toByteArray();
        DataInfo.Student student1 = DataInfo.Student.parseFrom(bytes);
        System.out.println(student1.getName());
        System.out.println(student1.getAge());
        System.out.println(student1.getAddress());

    }
}
