package ru.mirea.java2020.lab9;

import javax.swing.*;
import java.awt.*;



public class ShapeMain extends JComponent {
    public static void main(String args[]){

        JFrame w = new JFrame("Окно с изображением");
        w.setSize(800, 800);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w.setLayout(new BorderLayout(1, 1));
        Canvas canvas=new Canvas();
        w.add(new Canvas());
        w.setVisible(true);

    }
}
