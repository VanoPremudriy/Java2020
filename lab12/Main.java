package ru.mirea.java2020.lab12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class Main extends JFrame{
    DecimalFormat fd = new DecimalFormat("#0.0000");

    public JTextArea text = new JTextArea("Гравитация планеты");
    public JButton buttons[] = new JButton[8];
    public JTextArea text1 = new JTextArea("");
    public Main(){
        setSize(800,800);
        text.setFont(new Font("Times new Romans", Font.PLAIN, 40));
        text.setBounds(200,50,400,50);
        buttons[0] = new JButton("Меркурий");
        buttons[1] = new JButton("Венера");
        buttons[2] = new JButton("Земля");
        buttons[3] = new JButton("Марс");
        buttons[4] = new JButton("Юпитер");
        buttons[5] = new JButton("Сатурн");
        buttons[6] = new JButton("Уран");
        buttons[7] = new JButton("Нептун");

        text1.setBounds(300,400, 200,30);

        for (int i=0;i<4;i++){
            buttons[i].setBounds(i*150+100,150,100,50);
        }

        for (int i=4;i<8;i++){
            buttons[i].setBounds((i-4)*150+100,250,100,50);
        }

        buttons[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text1.setText(String.format("%.3f", 6.672* Planet.MERCURY.weight/Math.pow(Planet.MERCURY.radius,2)*Math.pow(10,6)) +" Н");
            }
        });
        buttons[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text1.setText(String.format("%.3f", 6.672* Planet.VENUS.weight/Math.pow(Planet.VENUS.radius,2)*Math.pow(10,6)) +" Н");
            }
        });
        buttons[2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text1.setText(String.format("%.3f", 6.672* Planet.EARTH.weight/Math.pow(Planet.EARTH.radius,2)*Math.pow(10,6)) +" Н");
            }
        });
        buttons[3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text1.setText(String.format("%.3f", 6.672* Planet.MARS.weight/Math.pow(Planet.MARS.radius,2)*Math.pow(10,6)) +" Н");
            }
        });
        buttons[4].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text1.setText(String.format("%.3f", 6.672* Planet.JUPITER.weight/Math.pow(Planet.JUPITER.radius,2)*Math.pow(10,6)) +" Н");
            }
        });
        buttons[5].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text1.setText(String.format("%.3f", 6.672* Planet.SATURN.weight/Math.pow(Planet.SATURN.radius,2)*Math.pow(10,6)) +" Н");
            }
        });
        buttons[6].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text1.setText(String.format("%.3f", 6.672* Planet.URANUS.weight/Math.pow(Planet.URANUS.radius,2)*Math.pow(10,6)) +" Н");
            }
        });
        buttons[7].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text1.setText(String.format("%.3f", 6.672* Planet.NEPTUNE.weight/Math.pow(Planet.NEPTUNE.radius,2)*Math.pow(10,6)) +" Н");
            }
        });

        add(text);
        add(text1);
        for (int i=0;i<8;i++) add(buttons[i]);

        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        Main m = new Main();
    }

}
