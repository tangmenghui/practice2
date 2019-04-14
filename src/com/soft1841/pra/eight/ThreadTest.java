package com.soft1841.pra.eight;

public class ThreadTest extends java.lang.Thread {     //指定类继承Thread类
    private  int count = 10;
    //重写run方法
    public void run(){
        while ((true)){
            //打印count变量
            System.out.print(count+" ");
            //使count变量自减，当减为0时，退出循环
            if (--count ==0){
                break;
            }
        }
    }

    public static void main(String[] args) {
        //创建线程对象
        ThreadTest test = new ThreadTest();
        //启动线程
        test.start();

    }
}
