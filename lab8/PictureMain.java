package ru.mirea.java2020.lab8;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class PictureMain{
    public static void main(String[] args) throws IOException {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(1100, 800);
        BufferedImage image1 = ImageIO.read(new File(args[0]));
        JPanel pane = new JPanel() {
            int i=0;
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                i++;
                g.drawImage(image1,0,0,null);;
                super.repaint();
            }
        };
        frame.add(pane);
        frame.setVisible(true);

    }
}

