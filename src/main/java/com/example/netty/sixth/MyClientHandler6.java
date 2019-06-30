package com.example.netty.sixth;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

import java.util.Random;

/**
 * @author hzq
 * @date 2019/6/30 0030 上午 11:57
 */
public class MyClientHandler6 extends SimpleChannelInboundHandler<MyDataInfo.MyMessage> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, MyDataInfo.MyMessage msg) throws Exception {

    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        int nextInt = new Random().nextInt(3);
        MyDataInfo.MyMessage message = null;
        if(0 == nextInt){
            message = MyDataInfo.MyMessage.newBuilder()
                    .setDataType(MyDataInfo.MyMessage.DataType.PersonType)
                    .setPerson(MyDataInfo.Person.newBuilder()
                            .setName("李四")
                            .setAge(18)
                            .setAddress("北京")
                            .build())
                    .build();

        }else if(1 == nextInt){
            message = MyDataInfo.MyMessage.newBuilder()
                    .setDataType(MyDataInfo.MyMessage.DataType.DogType)
                    .setDog(MyDataInfo.Dog.newBuilder()
                            .setName("旺财")
                            .setAge(6)
                            .build())
                    .build();
        }else{
            message = MyDataInfo.MyMessage.newBuilder()
                    .setDataType(MyDataInfo.MyMessage.DataType.CatType)
                    .setCat(MyDataInfo.Cat.newBuilder()
                            .setName("喵喵")
                            .setSex("女")
                            .build())
                    .build();
        }
        ctx.channel().writeAndFlush(message);
    }
}
