package ru.mirea.java2020.lab19;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        try {
            File file = new File("FileOne.txt");
            FileWriter fw = new FileWriter(file);
            str = sc.next();
            fw.write(str);
            fw.close();
        } catch (Exception e){
            System.out.println("Error");
        }
    }
}
