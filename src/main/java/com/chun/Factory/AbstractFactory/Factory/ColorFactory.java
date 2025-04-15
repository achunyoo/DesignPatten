package com.chun.Factory.AbstractFactory.Factory;

import com.chun.Factory.AbstractFactory.AbstractFactory;
import com.chun.Factory.AbstractFactory.IProduct.Color;
import com.chun.Factory.AbstractFactory.IProduct.Shape;
import com.chun.Factory.AbstractFactory.product.Green;
import com.chun.Factory.AbstractFactory.product.Red;

/**
 * @description:
 * @author: chun
 **/

public class ColorFactory implements AbstractFactory {
    @Override
    public Shape creatShape(String shapeType) {
        return null;
    }

    @Override
    public Color creatColor(String colorType) {
        if(colorType.equalsIgnoreCase("RED")){
            return new Red();
        } else if(colorType.equalsIgnoreCase("GREEN")){
            return new Green();
        }
        return null;
    }
}
