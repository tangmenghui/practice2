package com.soft1841.pra.eight;

public class ThreadTestOne extends Object implements Runnable {
    private  int count = 10;

    @Override
    public void run() {
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
        ThreadTestOne one = new ThreadTestOne();
        one.run();
    }
}
