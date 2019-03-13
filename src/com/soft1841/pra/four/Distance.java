package com.soft1841.pra.four;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.text.DecimalFormat;
import java.util.Random;

/**
 * 屏幕上两点间的距离
 * @author Moe
 * 2019.3.13
 */

public class Distance {
    public static void main(String[] args) throws IOException {
        //指定图片的大小和类型
        BufferedImage bufferedImage = new BufferedImage(1024,768,BufferedImage.TYPE_INT_RGB);
        //设置字体
        Font font = new Font("华文行楷",Font.BOLD,20);
        //获取画笔
        Graphics g = bufferedImage.getGraphics();
        //画笔，字体获取颜色
        g.setFont(font);
        g.setColor(Color.orange);
        //绘制一个矩形
        g.fillRect(0,0,1024,768);
        //随机种子
        Random random = new Random();
        int x1 = random.nextInt(1024);
        int x2 = random.nextInt(1024);
        int y1 = random.nextInt(769);
        int y2 = random.nextInt(768);
        System.out.println("M:(" +x1+","+y1+")");
        System.out.println("N:(" +x2+","+y1+")");
        //计算两点间的距离
        double distance = Math.sqrt(( x1+x2)*(x1+x2)+(y1+y2)*(y1+y2));
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        String s = decimalFormat.format(distance);
        System.out.println("两点间的距离为："+s);
        g.setColor(Color.BLUE);
        g.drawLine(x1,x2,y1,y2);
        g.drawString(s,(x1+x2)/2,(y1+y2)/2);
        //输出图片
        File file = new File("D:/distance.jpg");
        OutputStream outputStream = new FileOutputStream(file);
        //将图片从缓冲区通过字节写到文件
        ImageIO.write(bufferedImage,"jpg",outputStream);
        outputStream.close();
    }
}
