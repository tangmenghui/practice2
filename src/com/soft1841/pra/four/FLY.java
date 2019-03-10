package com.soft1841.pra.four;

public class FLY  implements Move,Sing{
    @Override
    public String move() {
        return "可移动";
    }

    @Override
    public String sing() {
        return "可唱歌";
    }
    public static void main(String[] args) {
       FLY fly = new FLY();
        System.out.println("小精灵们"+fly.move()+fly.sing());
    }
}
