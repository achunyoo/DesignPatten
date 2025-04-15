package com.chun.Factory.FactoryMethod;

/**
 * @description:
 * @author: chun
 **/

public class RectangleFactory implements ShapeFactory{
    @Override
    public Shape creatShape() {
        return new Rectangle();
    }
}
