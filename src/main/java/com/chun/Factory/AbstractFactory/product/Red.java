package com.chun.Factory.AbstractFactory.product;

import com.chun.Factory.AbstractFactory.IProduct.Color;

/**
 * @description:
 * @author: chun
 **/

public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("fill red");
    }
}
