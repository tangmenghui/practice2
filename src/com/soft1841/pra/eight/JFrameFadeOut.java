package com.soft1841.pra.eight;

import com.sun.awt.AWTUtilities;



import javax.swing.*;
import java.awt.*;

public class JFrameFadeOut extends JPanel {
    public JFrameFadeOut() {
        this.setLayout(null);
//        this.setOpaque(false);
//        JButton button = new JButton("xxxxxxxx");
//        button.setBounds(0, 0, 100, 100);
//        this.add(button);
//        setBackground(Color.red);
    }

    private GradientPaint paint;

    public Color color = Color.CYAN;

    public Color color1 = Color.WHITE;


    @Override
    public void paint(Graphics g) {
        // TODO 自动生成方法存根
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER,
                0.5f));
        super.paint(g2);
        int height = getHeight();
        int width = getWidth();
        setColor(color, color1, width, height);
        g2.setPaint(paint);
        g2.fillRoundRect(0, 0, this.getWidth() - 100, this.getHeight() - 100,
                25, 25);
        int[] x1 = {this.getWidth() - 200, this.getWidth() - 200 + 30, this.getWidth() - 200 + 60};
        int[] y1 = {this.getHeight() - 100, this.getHeight() - 100, this.getHeight() - 100 + 60};
        g2.drawPolyline(x1, y1, 3);
        g2.fillPolygon(x1, y1, 3);
    }

    private void setColor(Color color, Color color1, int width, int height) {
        paint = new GradientPaint(0, 0, color, width, height, color1, false);
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame() {

        };
        frame.setUndecorated(true);
        frame.add(new JFrameFadeOut());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(800, 600));
        AWTUtilities.setWindowOpaque(frame, false);
        frame.setVisible(true);
    }
}
