package com.chun.Factory;



/*
* 优点：
简单工厂模式实现简单，易于理解和使用；
可以对对象的创建进行集中管理，客户端和具体实现解耦。
缺点：

工厂类负责创建所有对象，如果需要添加新类型的产品，则需要修改工厂类的代码，这违反了开闭原则；
工厂类职责过重，导致单一职责原则被破坏。
适用场景：

工厂类负责创建的对象较少，客户端不需要知道对象的创建过程；
客户端需要根据传递的参数来获取对应的对象。


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
