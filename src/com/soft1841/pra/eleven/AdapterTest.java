package com.soft1841.pra.eleven;

public class AdapterTest {
    public static void main(String[] args) {
        System.out.println("特长生招募中....");
        Student student1 = new Student() {
            @Override
            public void javaStudy() {
                System.out.println("我是一名Java大神");
            }
        };
        student1.javaStudy();
        Student student2 = new Student() {
            @Override
            public void PlayBasketball() {
                System.out.print("我篮球打得好.");
            }
            @Override
            public void PlayFootball() {
                System.out.println("足球也踢得好");
            }
        };
        student2.PlayBasketball();
        student2.PlayFootball();
    }
}
