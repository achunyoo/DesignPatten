package com.chun.Factory.AbstractFactory;

import com.chun.Factory.AbstractFactory.IProduct.Color;
import com.chun.Factory.AbstractFactory.IProduct.Shape;

//抽象工厂接口
public interface AbstractFactory {
    Shape creatShape(String shapeType);
    Color creatColor(String colorType);
}
