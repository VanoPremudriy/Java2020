package ru.mirea.java2020.lab8;

import javax.swing.*;
import java.awt.*;

public class Picture extends JPanel {
    public void paintComponent (String pic, Graphics g) {
        Image image = new ImageIcon(pic).getImage();
        g.drawImage(image, 0, 0, null);
    }
}
