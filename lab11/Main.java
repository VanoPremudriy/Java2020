package ru.mirea.java2020.lab11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    public JTextField field = new JTextField("");
    public JTextArea text = new JTextArea("Введите число от 0 до 20");
    public JButton button = new JButton("Проверить");
    public JTextArea text1 = new JTextArea("");
    public int ch=-1;
    public int ourCh = (int)(Math.random()*20);
    public int count = 0;
    Main(){
        super("Window");
        setSize(800, 800);
        field.setBounds(300,200,200,100);
        text.setBounds(300,50,150,30);
        button.setBounds(350,600,100,30);
        text1.setBounds(300,350,210,30);


        add(text);
        add(text1);
        add(field);
        add(button);

        setLayout(null);
        setVisible(true);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ch = Integer.parseInt(field.getText());
                if (ch>ourCh) {

                    text1.setText("Заданное число меньше введенного");

                }
                else if (ch<ourCh){
;
                    text1.setText("Заданное число больше введенного");
                }

                else if (ch==ourCh){
                    text1.setBounds(100,100,500,500);
                    text1.setFont(new Font("Times new Romans", Font.PLAIN, 40));
                    text1.setText("Верно");
                    button.removeAll();
                }
                count++;
                if (count==3) {
                    text1.setBounds(100,100,600,600);
                    text1.setFont(new Font("Times new Romans", Font.PLAIN, 40));
                    text1.setText("Попытки кончились");
                    button.removeAll();
                }

            }
        });
    }

    public static void main(String[] args) {
        Main m = new Main();
    }
}
