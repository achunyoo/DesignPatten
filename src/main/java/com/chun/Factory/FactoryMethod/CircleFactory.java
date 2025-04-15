package com.chun.Factory.FactoryMethod;

/**
 * @description: 具体工厂
 * @author: chun
 **/

public class CircleFactory implements ShapeFactory{
    @Override
    public Shape creatShape() {
        return new Circle();
    }
}
