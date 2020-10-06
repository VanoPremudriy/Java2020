package ru.mirea.java2020.lab10;

import java.util.Scanner;

public class First {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int k,s,d, count =0, sum=0, ch;
        k = sc.nextInt();
        s= sc.nextInt();


        for (int i=(int)Math.pow(10,(double)(k-1)); i<(int)Math.pow(10,(double)k);i++ ){
            ch=i;
            while (ch!=0){
                sum+=ch%10;
                ch=ch/10;
            }
            if (sum==s) count++;
            sum=0;
        }
        System.out.println(count);
    }
}
