package ru.mirea.java2020.lab8;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class AnimationMain {
    public static void main(String[] args) throws IOException {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(200, 150);
        BufferedImage image1 = ImageIO.read(new File(args[0]));
        JPanel pane = new JPanel() {
            int i=0;
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                i-=200;
                g.drawImage(image1,i,0,null);;
                if (i<-1200) i=0;
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                super.repaint();
            }
        };
        frame.add(pane);
        frame.setVisible(true);

    }
}
