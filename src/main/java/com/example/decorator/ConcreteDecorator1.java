package com.example.decorator;

/**
 * @author hzq
 * @date 2019/7/14 0014 下午 4:03
 */
public class ConcreteDecorator1 extends Decorator{

    public ConcreteDecorator1(Component component) {
        super(component);
    }

    @Override
    public void doSomething() {
        super.doSomething();
        doAnotherThing();
    }

    private void doAnotherThing() {
        System.out.println("功能B");
    }


}
