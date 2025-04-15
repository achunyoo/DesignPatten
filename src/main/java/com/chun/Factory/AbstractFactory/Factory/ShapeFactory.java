package com.chun.Factory.AbstractFactory.Factory;

import com.chun.Factory.AbstractFactory.AbstractFactory;
import com.chun.Factory.AbstractFactory.IProduct.Color;
import com.chun.Factory.AbstractFactory.IProduct.Shape;
import com.chun.Factory.AbstractFactory.product.Circle;
import com.chun.Factory.AbstractFactory.product.Rectangle;


/**
 * @description:
 * @author: chun
 **/

public class ShapeFactory implements AbstractFactory {


    @Override
    public Shape creatShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        return null;
    }

    @Override
    public Color creatColor(String colorType) {
        return null;
    }
}
