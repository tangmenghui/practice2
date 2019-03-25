package com.soft1841.pra.seven;

import javax.swing.*;
import java.awt.*;

public class Bird extends JFrame {
    public Bird(){
    setTitle("射雕英雄传");
    Container container = getContentPane();
    setLayout(new BorderLayout());
    JButton centerBtn = new JButton("中通神");
    JButton northBtn = new JButton("北丐");
    JButton southBtn = new JButton("南帝");
    JButton westBtn = new JButton("西毒");
    JButton eastBtn = new JButton("东邪");
        container.add(centerBtn,BorderLayout.CENTER);
        container.add(northBtn,BorderLayout.NORTH);
        container.add(southBtn,BorderLayout.SOUTH);
        container.add(westBtn,BorderLayout.WEST);
        container.add(eastBtn,BorderLayout.EAST);
    setSize(350,200);
    setVisible(true);
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
}

    public static void main(String[] args) {
        new Bird();
    }
}
