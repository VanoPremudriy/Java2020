package ru.mirea.java2020.lab18;

import java.util.Scanner;

public class One {
    public static int[] E;

    public static void Sieve(int k)
    {
        int i,j;
        for (i=1; i<=k; i++) E[i]=i;
        for (j=2; j<=k; j++)
            if (E[j] != 0) for (i=2; i*j<=k; i++) E[i*j]=0;
    }

    public static void Factor(int n, int k)
    {
        if (n == 1)
            return;
        else
        if ((E[k]==0) || ((n%k) != 0))
            Factor(n,k+1);
        else
        {
            System.out.println(k);
            Factor(n/k,k);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        E = new int[n/2+1];

        Sieve(n/2);
        Factor(n,2);
    }
}
