package ru.mirea.java2020.lab14;

import java.util.Scanner;

public class Tester {
    public static String[] names = {"Петр", "Николай", "Дмитрий", "Сергей", "Василий", "Алексей", "Вячеслав","Григорий","Александр","Артем"};
    public static String[] familys = {"Куприянов", "Кипелов","Смирнов","Баранов","Губарев","Маршанов","Мазур","Иванков","Горшенев","Горшков"};
    public static String[] middleNames  = {"Петрович", "Николаевич", "Дмитриевич", "Сергеевич", "Васильевич", "Алексеевич", "Вячеславович","Григорьевич","Александрович","Артемович"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SortingStudentsByGPA st = new SortingStudentsByGPA();
        Search sch = new Search();
        String name, family, middleName, id;
        String str;
        int diff=0;
        int points;
        Student students[] = new Student[5];
        for (int i=0;i<5;i++){
            name = names[(int)(Math.random()*10)];
            family=familys[(int)(Math.random()*10)];
            middleName=middleNames[(int)(Math.random()*10)];
            id= Integer.toString((int)(Math.random()*100000 + 100000));
            points=(int)(Math.random()*30);
            students[i] = new Student(name, family, middleName, id, points);
        }

        Student myStudent = students[3];

        diff =0;
        long start = System.nanoTime();
        System.out.println(sch.lineSearch(students,myStudent));
        long finish = System.nanoTime();
        long elapsed = finish - start;
        System.out.println(elapsed + " - время");
        System.out.println(sch.getDiff()+ " - сложность");

        start = System.nanoTime();
        System.out.println(sch.reqLineSearch(students, myStudent, students.length, diff));
        finish = System.nanoTime();
        elapsed = finish - start;
        System.out.println(elapsed + " - время");
        System.out.println(sch.getDiff()+ " - сложность");

        st.quickSort(students,0,students.length-1);

        for (int i=0;i<5;i++){
            System.out.println(students[i].toString());
        }

        myStudent = students[3];

        start =System.nanoTime();
        System.out.println(sch.binarySearch(students, myStudent));
        finish =System.nanoTime();
        elapsed = finish - start;
        System.out.println(elapsed + " - время");
        System.out.println(sch.getDiff()+ " - сложность");

        diff=0;
        start = System.nanoTime();
        System.out.println(sch.reqBinarySearch(students,myStudent,0,students.length, diff));
        finish = System.nanoTime();
        elapsed = finish - start;
        System.out.println(elapsed + " - время");
        System.out.println(sch.getDiff()+ " - сложность");
    }
}
