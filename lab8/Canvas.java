package ru.mirea.java2020.lab8;

import javax.swing.*;
import java.awt.*;

class Canvas extends JComponent {

    Circle[] circles = new Circle[10];
    Rectangle[] rectangles = new Rectangle[5];
    Square[] squares = new Square[5];
    String[] colors={"red", "blue", "green", "yellow","pink", "black","gray"};
    public Canvas() {
        for (int i=0; i<10;i++){
            circles[i] = new Circle(colors[(int)(Math.random()*6)], 10+Math.random()*100,10+Math.random()*100, Math.random()*700, Math.random()*700);
        }

        for (int i=0;i<5;i++){
            rectangles[i] = new Rectangle(colors[(int)(Math.random()*6)], 10+Math.random()*100,10+Math.random()*100,Math.random()*700, Math.random()*700);
        }

        for (int i=0;i<5;i++){
            squares[i]=new Square(colors[(int)(Math.random()*6)], 10+Math.random()*100, Math.random()*700, Math.random()*700);
        }
    }

    public void paintComponent(Graphics g){
        Graphics2D g2d=(Graphics2D)g;

        for (int i=0;i<10;i++){
            switch (circles[i].getColor()){
                case "red":g2d.setPaint(Color.red); break;
                case "blue":g2d.setPaint(Color.blue);break;
                case "green":g2d.setPaint(Color.green);break;
                case "yellow":g2d.setPaint(Color.yellow);break;
                case "pink":g2d.setPaint(Color.pink);break;
                case "black":g2d.setPaint(Color.black);break;
                case "gray":g2d.setPaint(Color.gray);break;
                default:break;
            }
            g2d.fillOval((int)circles[i].getX(), (int)circles[i].getY(), (int)circles[i].getWidth(), (int)circles[i].getLength());
        }

        for (int i=0;i<5;i++){
            switch (rectangles[i].getColor()){
                case "red":g2d.setPaint(Color.red); break;
                case "blue":g2d.setPaint(Color.blue);break;
                case "green":g2d.setPaint(Color.green);break;
                case "yellow":g2d.setPaint(Color.yellow);break;
                case "pink":g2d.setPaint(Color.pink);break;
                case "black":g2d.setPaint(Color.black);break;
                case "gray":g2d.setPaint(Color.gray);break;
                default:break;
            }
            g2d.fillRect((int)rectangles[i].getX(), (int)rectangles[i].getY(), (int)rectangles[i].getLength(), (int)rectangles[i].getWidth());
        }

        for (int i=0;i<5;i++){
            switch (squares[i].getColor()){
                case "red":g2d.setPaint(Color.red); break;
                case "blue":g2d.setPaint(Color.blue);break;
                case "green":g2d.setPaint(Color.green);break;
                case "yellow":g2d.setPaint(Color.yellow);break;
                case "pink":g2d.setPaint(Color.pink);break;
                case "black":g2d.setPaint(Color.black);break;
                case "gray":g2d.setPaint(Color.gray);break;
                default:break;
            }
            g2d.fillRect((int)squares[i].getX(), (int)squares[i].getY(), (int)squares[i].getSize(), (int)squares[i].getSize());
        }
        super.paintComponents(g);
    }
}