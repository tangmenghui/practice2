package com.soft1841.pra.seven;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutPosition extends JFrame {
    public FlowLayoutPosition(){
        setTitle("本窗体使用流布局管理器");
        Container c = getContentPane();
        //设置窗体使用流布局管理器，使组件右对齐，组件之间的平均间隔为10像素，垂直间隔10像素
        setLayout(new FlowLayout(FlowLayout.RIGHT,10,10));
        for (int i = 0; i <10; i++){
            c.add(new JButton("button"+i));
        }
        setResizable(false);
        setSize(300,200);
//        setResizable(false);
        //设置窗体关闭方式
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FlowLayoutPosition();
    }
}
