package com.example.decorator;

/**
 * @author hzq
 * @date 2019/7/14 0014 下午 4:05
 */
public class ConcreteDecorator2 extends Decorator {

    public ConcreteDecorator2(Component component) {
        super(component);
    }

    @Override
    public void doSomething() {
        super.doSomething();
        doAnotherThing();
    }

    private void doAnotherThing() {
        System.out.println("功能C");
    }
}
