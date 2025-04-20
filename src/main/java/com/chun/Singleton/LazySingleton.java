package com.chun.Singleton;

/**
 * @description: 懒汉式
 * @author: chun
 **/

public class LazySingleton {
    //封装创建好的对象，先不创建，啥时候用啥时候创建
    private static LazySingleton lazySingleton = null;

    //私有化构造方法，不允许外部创建对象
    private LazySingleton() {
    }

    //提供公开的获取对象的方法
    public static synchronized LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
