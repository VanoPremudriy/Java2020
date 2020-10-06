package ru.mirea.java2020.lab10;

import java.util.Scanner;

public class Third {
    public static void ch(int n){
        if (n/10>0) ch(n/10);
        System.out.print(n%10+" ");
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ch(n);
    }
}
