package com.chun.Factory.FactoryMethod;

/**
 * @description: 具体产品
 * @author: chun
 **/

public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Draw Circle");
    }
}
