package ru.mirea.java2020.lab19;

import java.io.File;
import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        try {
            File file = new File("FileTwo.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNext()){
                System.out.println(sc.nextLine());
            }
        } catch (Exception e){
            System.out.println("Error");
        }
    }
}
