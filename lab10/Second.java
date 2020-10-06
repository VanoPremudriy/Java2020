package ru.mirea.java2020.lab10;

import java.util.Scanner;

public class Second {
    public  static int c=0;
    public static void fun(int a, int b, int a1, int b1, int c1, String s){
       if (a1==a && b1==b) {
           c++;
           System.out.println(s);
       }
       if (a1!=a && c1!=0)  fun(a,b,a1+1,b1,0,s+0);
       if (b1!=b)  fun(a,b,a1,b1+1,1,s+1);

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();
        fun (a,b,0,0,10,"");
        System.out.println(c);
    }
}
