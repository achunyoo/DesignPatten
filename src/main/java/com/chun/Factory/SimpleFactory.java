package com.chun.Factory;

/*结构
 1. 产品接口（Product Interface）：定义产品的公共接口。
 2. 具体产品（Concrete Product）：实现产品接口的具体类。
 3. 工厂类（Factory Class）：包含创建产品的方法，根据传入的参数返回相应的产品实例。
*/

//产品接口
interface Shape{
    void draw();
}

//具体产品
class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("draw circle");
    }
}

class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("draw rectangle");
    }
}

//工厂类
class ShapeFactory{
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        return null;
    }
}
public class SimpleFactory {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();
    }

}
