package com.chun.Singleton;

/**
 * @description: 双重检查锁
 * @author: chun
 **/

public class DoubleCheckLocking {
    private DoubleCheckLocking() {
    }
    //使用volatile关键字
    private static volatile DoubleCheckLocking instance;

    public static DoubleCheckLocking getInstance() {
        //第一次检查是否为null
        if (instance == null) {
            //使用synchronized加锁
            synchronized (DoubleCheckLocking.class) {
                //第二次检查是否为null
                if (instance == null) {
                    //new关键字创建对象不是原子操作
                    instance = new DoubleCheckLocking();
                }
            }
        }
        return instance;
    }
}
