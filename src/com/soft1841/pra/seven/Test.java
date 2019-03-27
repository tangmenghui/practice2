package com.soft1841.pra.seven;

import javax.swing.*;
import java.awt.*;

public class Test extends JFrame {
    public Test(){
        Container c = getContentPane();
        //设置容器使用网格布局管理器设置7行3列的网格
        //组建间水平间距为5像素，垂直间距为5像素
        setLayout(new GridLayout(4,6,5,5));
        String name;
        for (int i = 1; i <= 26; i++) {
            name = String.valueOf((char) (96 + i)).toUpperCase();
            System.out.println(name);
            c.add(new JButton((name)));
        }
        setSize(600,600);
        setTitle("英文字母表");
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Test();
    }
}
