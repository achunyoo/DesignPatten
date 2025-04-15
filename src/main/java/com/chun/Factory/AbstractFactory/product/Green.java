package com.chun.Factory.AbstractFactory.product;

import com.chun.Factory.AbstractFactory.IProduct.Color;

/**
 * @description:
 * @author: chun
 **/

public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("fill green");
    }
}
