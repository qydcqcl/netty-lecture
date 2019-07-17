package com.example.decorator;

/**
 * @author hzq
 * @date 2019/7/14 0014 下午 4:01
 */
public class ConcreteComponent implements Component {

    @Override
    public void doSomething() {
        System.out.println("功能A");
    }
}
