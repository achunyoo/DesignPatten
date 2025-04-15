package com.chun.Factory.AbstractFactory.product;

import com.chun.Factory.AbstractFactory.IProduct.Shape;

/**
 * @description:
 * @author: chun
 **/

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw Rectangle");
    }
}
