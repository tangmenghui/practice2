package com.soft1841.pra.one;

public class Rectangle extends Shape {
    @Override
    public void area() {
        System.out.println("矩形的面积是：" + high * width );
    }
}
