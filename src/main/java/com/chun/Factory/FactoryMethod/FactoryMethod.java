package com.chun.Factory.FactoryMethod;

/**
 * @description:
 * @author: chun
 **/

/*优点：
1.方法工厂模式具有良好的可扩展性，如果需要添加新类型的产品，只需要添加对应的工厂方法即可；
2.与简单工厂模式相比，方法工厂模式更符合开闭原则和单一职责原则。
  缺点：
1.需要客户端自行选择使用哪个工厂方法，不能像简单工厂模式那样直接传参获取对应对象，因此对客户端的编写有一定要求。
适用场景：

应用中需要创建的对象较少，但是需要具备良好的可扩展性；
客户端可以自行选择创建哪种对象。
*/


    /*2.2.1 结构
产品接口（Product Interface）：定义产品的公共接口。
具体产品（Concrete Product）：实现产品接口的具体类。
工厂接口（Factory Interface）：声明创建产品的方法。
具体工厂（Concrete Factory）：实现工厂接口，创建具体的产品实例。
*/

public class FactoryMethod {
    public static void main(String[] args) {
        ShapeFactory circleFactory = new CircleFactory();
        Shape circle = circleFactory.creatShape();
        circle.draw();

        ShapeFactory rectangleFactory = new RectangleFactory();
        Shape rectangle = rectangleFactory.creatShape();
        rectangle.draw();
    }
}
