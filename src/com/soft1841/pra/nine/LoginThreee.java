package com.soft1841.pra.nine;

public class LoginThreee {
    public static void main(String[] args) {
        D d = new D();
        /*自定义线程执行绿灯*/
        new Thread() {
            @Override
            public void run() {
                /*一直可以执行绿灯*/
                while(true) {
                    d.g();
                }
            }
        }.start();
        while (true) {
            d.r();
        }
    }
}
class D {
    private boolean flag = true;
    public synchronized void r() {
        while (!flag) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("红灯亮" + "->" + i);
        }

        flag = false;
        this.notify();
    }
    public synchronized void g() {
        while (flag) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("绿灯亮" + "->" + i);
        }
        flag = true;
        this.notify();
    }
}
