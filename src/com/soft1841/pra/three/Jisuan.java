package com.soft1841.pra.three;

/**
 * 计算矩形和圆的面积
 * @author Moe
 * 2019.3.10
 */

public class Jisuan {
    public static void main(String[] args) {
        Shape shape = new Round();
        shape.radius = 4;
        shape.area();
        shape = new Rectangle();
        shape.high = 5;
        shape.width = 8;
        shape.area();
    }
}
