package com.chun.Singleton;

/**
 * @description: 登记式/静态内部类
 * @author: chun
 **/

public class StaticSingleton {
    private StaticSingleton(){}

    private static class SingletonHolder{
        private static final StaticSingleton INSTANCE = new StaticSingleton();
    }

    public static  StaticSingleton getInstance(){
        return SingletonHolder.INSTANCE;
    }

}
