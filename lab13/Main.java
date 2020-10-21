package ru.mirea.java2020.lab13;

import java.util.Random;
import java.util.Scanner;

public class Main {

   public static String[] names = {"Петр", "Николай", "Дмитрий", "Сергей", "Василий", "Алексей", "Вячеслав","Григорий","Александр","Артем"};
   public static String[] familys = {"Куприянов", "Кипелов","Смирнов","Баранов","Губарев","Маршанов","Мазур","Иванков","Горшенев","Горшков"};
   public static String[] middleNames  = {"Петрович", "Николаевич", "Дмитриевич", "Сергеевич", "Васильевич", "Алексеевич", "Вячеславович","Григорьевич","Александрович","Артемович"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] idNumber = new String[10];
        SortingStudentsByGPA st = new SortingStudentsByGPA();
        String name, family, middleName, id;
        String str;
        int points;
        Student students[] = new Student[5];
        Student students1[] = new Student[5];
        for (int i=0;i<5;i++){
            name = names[(int)(Math.random()*10)];
            family=familys[(int)(Math.random()*10)];
            middleName=middleNames[(int)(Math.random()*10)];
            id= Integer.toString((int)(Math.random()*100000 + 100000));
            points=(int)(Math.random()*30);
            students[i] = new Student(name, family, middleName, id, points);
            students1[i] = new Student(name, family, middleName, id, points);
        }

        for (int i=0;i<5;i++){
            idNumber[i] = students[i].id;
        }

        for (int i=0;i<5;i++){
            for (int j=0; j<5;j++){
                if (Integer.parseInt(idNumber[i]) < Integer.parseInt(idNumber[j])){
                   str = idNumber[i];
                   idNumber[i]=idNumber[j];
                   idNumber[j] = str;
                }
            }
        }

        System.out.println();

        System.out.println("idNumber Sort:");
        for (int i=0;i<5;i++){
            System.out.println(idNumber[i]);
        }

        System.out.println();

        System.out.println("GPA quickSort:");
        st.quickSort(students, 0, students.length-1);
        for (int i=0;i<5;i++){
            System.out.println(students[i].toString());
        }



    }
}
