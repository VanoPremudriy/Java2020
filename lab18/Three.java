package ru.mirea.java2020.lab18;

import java.util.Scanner;

public class Three {

    public static int max(){
        Scanner scan=new Scanner(System.in);
        int x= scan.nextInt();
        if(x!=0){
            return Math.max(x,max());
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        System.out.println(max());
    }
}
