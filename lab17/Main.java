package ru.mirea.java2020.lab17;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    public JTextField sX = new JTextField("");
    public Main(){
        super("TicTacToe");
        TicTacToe game = new TicTacToe();
        setSize(600,400);
        setLayout(new BorderLayout());
        setVisible(true);
        add(game);

    }


    public static void main(String[] args) {
        Main m = new Main();
    }
}
