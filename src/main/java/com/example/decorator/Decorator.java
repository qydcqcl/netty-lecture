package com.example.decorator;

/**
 * @author hzq
 * @date 2019/7/14 0014 下午 4:02
 */
public class Decorator implements Component {

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void doSomething() {
        component.doSomething();
    }
}
