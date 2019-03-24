package com.soft1841.pra.seven;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutPositionTset extends JFrame {
    public FlowLayoutPositionTset() {
        setTitle("本窗体使用流布局管理器");
        Container c = getContentPane();
        //设置窗体使用网格布局管理器，设置了5行1列的网格
        setLayout(new GridLayout(5,1,5,5));
        c.add(new JButton("下列四句诗，哪一句是描写夏天的？"));
        c.add(new JButton("A.秋风萧瑟天气凉，草木摇荡露为霜。"));
        c.add(new JButton("B.白雪纷纷何所似，撒盐空中差可拟。"));
        c.add(new JButton("C.接天莲叶无穷碧，映日荷花别样红。"));
        c.add(new JButton("D.竹外桃花三两枝，春江水暖鸭先知。"));
        //设置窗体大小不可变
        setResizable(false);
        setSize(600, 500);
        //设置窗体关闭方式
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new FlowLayoutPositionTset();
    }
}
