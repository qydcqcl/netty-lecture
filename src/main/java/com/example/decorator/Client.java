package com.example.decorator;

/**
 * @author hzq
 * @date 2019/7/14 0014 下午 4:07
 */
public class Client {

    public static void main(String[] args) {
        Component component1 = new ConcreteDecorator2(new ConcreteDecorator1(new ConcreteComponent()));
        component1.doSomething();
    }
}
