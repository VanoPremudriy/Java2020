package ru.mirea.java2020.lab22;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class StudentsFunctions extends JComponent {
    ArrayList<Student> students = new ArrayList<>();

    JTextArea studentsList = new JTextArea ("");
    JTextField[] forAdd = new JTextField[5];
    JTextArea[] addStnd = new JTextArea[5];
    JTextField[] forSearch = new JTextField[4];
    JTextArea[] search = new JTextArea[3];
    JScrollPane scrollList = new JScrollPane (studentsList);

    JButton[] buttons = new JButton[3];

    public StudentsFunctions() {
        studentsList.setEditable ( false );
        scrollList.setBounds(10,50,300,400);
        scrollList.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        forAdd[0] = new JTextField("Фамилия");
        forAdd[0].setEditable ( false );
        forAdd[0].setBounds(350,50,90,20);
        forAdd[1] = new JTextField("Имя");
        forAdd[1].setEditable ( false );
        forAdd[1].setBounds(350,80,90,20);
        forAdd[2] = new JTextField("Отчество");
        forAdd[2].setEditable ( false );
        forAdd[2].setBounds(350,110,90,20);
        forAdd[3] = new JTextField("ID");
        forAdd[3].setEditable ( false );
        forAdd[3].setBounds(350,140,90,20);
        forAdd[4] = new JTextField("Средний балл");
        forAdd[4].setEditable ( false );
        forAdd[4].setBounds(350,170,90,20);


        addStnd[0] = new JTextArea("");
        addStnd[0].setBounds(500,50,100,20);
        addStnd[1] = new JTextArea("");
        addStnd[1].setBounds(500,80,100,20);
        addStnd[2] = new JTextArea("");
        addStnd[2].setBounds(500,110,100,20);
        addStnd[3] = new JTextArea("");
        addStnd[3].setBounds(500,140,100,20);
        addStnd[4] = new JTextArea("");
        addStnd[4].setBounds(500,170,100,20);

        forSearch[0] = new JTextField("Фамилия");
        forSearch[0].setEditable(false);
        forSearch[0].setBounds(350,250,90,20);
        forSearch[1] = new JTextField("Имя");
        forSearch[1].setEditable(false);
        forSearch[1].setBounds(350,280,90,20);
        forSearch[2] = new JTextField("Отчество");
        forSearch[2].setEditable(false);
        forSearch[2].setBounds(350,310,90,20);
        forSearch[3] = new JTextField("");
        forSearch[3].setEditable(false);
        forSearch[3].setBounds(620,310,300,20);

        search[0] = new JTextArea("");
        search[0].setBounds(500,250,100,20);
        search[1] = new JTextArea("");
        search[1].setBounds(500,280,100,20);
        search[2] = new JTextArea("");
        search[2].setBounds(500,310,100,20);

        buttons[0] = new JButton("Вставить");
        buttons[0].setBounds(700,50,90,30);
        buttons[1] = new JButton("Сортировать");
        buttons[1].setBounds(100,470,120,40);
        buttons[2] = new JButton("Найти");
        buttons[2].setBounds(700,250,90,30);
        addStudent();
        sort();
        search();
        add ( scrollList );

        for (int i=0;i<5; i++){
            add(forAdd[i]);
            add(addStnd[i]);
        }

        for (int i=0;i<4;i++){
            add(forSearch[i]);
        }
        for (int i=0;i<3;i++){
            add(search[i]);
        }
        add(buttons[0]);
        add(buttons[1]);
        add(buttons[2]);
    }

    public void addStudent(){
        buttons[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!addStnd[0].getText().equals("") && !addStnd[1].getText().equals("") && !addStnd[2].getText().equals("") && !addStnd[3].getText().equals("") && !addStnd[4].getText().equals("")){
                    students.add(new Student(addStnd[0].getText(), addStnd[1].getText(), addStnd[2].getText(), addStnd[3].getText(),Integer.parseInt(addStnd[4].getText())));
                    studentsList.append(students.get(students.size()-1).toString()+"\n");
                    for (int i=0;i<5;i++){
                        addStnd[i].setText("");
                    }
                }
            }
        });
    }

    public void sort(){
        buttons[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Student[] sortStdn = new Student[students.size()];
                for (int i=0;i<students.size();i++){
                    sortStdn[i] = students.get(i);
                }
                Sorting.selectionSort(sortStdn);
                int n = students.size();
                students.clear();
                studentsList.setText("");
                for (int i=0;i<n;i++){
                    students.add(sortStdn[i]);
                    studentsList.append(sortStdn[i].toString()+"\n");
                }


            }
        });
    }

    public void search(){
        buttons[2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!search[0].getText().equals("") && !search[1].getText().equals("") && !search[2].getText().equals("")) {
                    Student[] searchStdn = new Student[students.size()];
                    for (int i=0;i<students.size();i++){
                        searchStdn[i] = students.get(i);
                    }
                    Student ns = (Student) Sorting.Search(searchStdn,new Student(search[0].getText(),search[1].getText(),search[2].getText(),"",0));
                    if (ns.getFamily().equals("Не найдено")) {
                        forSearch[3].setText("Не найдено");
                    } else
                    forSearch[3].setText(Sorting.Search(searchStdn,new Student(search[0].getText(),search[1].getText(),search[2].getText(),"",0)).toString());
                    for (int i=0;i<3;i++){
                        search[i].setText("");
                    }
                }
            }
        });
    }
}
