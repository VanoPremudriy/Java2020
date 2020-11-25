package ru.mirea.java2020.lab22;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    public Main(){
        super("Students");
        StudentsFunctions sf = new StudentsFunctions();
        setSize(1000,600);
        setLayout(new BorderLayout());
        setVisible(true);
        add(sf);

    }

    public static void main(String[] args) {
        Main m = new Main();
    }
}
