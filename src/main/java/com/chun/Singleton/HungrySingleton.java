package com.chun.Singleton;

/**
 * @description: 懒汉式
 * @author: chun
 **/

public class HungrySingleton {
    //私有化构造器，使外界无法new
    private HungrySingleton() {
    }
    //在类的内部创建一个类的实例
    private static HungrySingleton instance = new HungrySingleton();

    //提供公共的访问方式
    public static HungrySingleton getInstance() {
        return instance;
    }
}
