package com.soft1841.pra.ten;

/**
 * 单例模式测试程序
 */

public class SingletonTest {
    public static void main(String[] args) {
        //编译错误：因为构造方法是不可见的，只能在singleton类内部使用
        //Singleton object= 呢哇Singleton（）；
        //通过Singleton的类方法Singleton。getInstance（）获取唯一可用的对象
        Singleton object = Singleton.getInstance();
        //显示消息
        object.showMessage();
    }
}
