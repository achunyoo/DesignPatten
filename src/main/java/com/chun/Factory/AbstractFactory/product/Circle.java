package com.chun.Factory.AbstractFactory.product;

import com.chun.Factory.AbstractFactory.IProduct.Shape;

/**
 * @description: 具体产品
 * @author: chun
 **/

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw Circle");
    }
}
