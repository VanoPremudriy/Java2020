package ru.mirea.java2020.lab18;

import java.util.Scanner;


public class Two {

    static boolean isPalRec(String word, int s, int e)
    {
        if (s == e)
            return true;
        if ((word.charAt(s)) != (word.charAt(e)))
            return false;
        if (s < e + 1)
            return isPalRec(word, s + 1, e - 1);
        return true;
    }

    static boolean isPalindrome(String word)
    {
        if (word.length() == 0)
            return true;
        return isPalRec(word, 0, word.length() - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        if (isPalindrome(word)) System.out.println("YES");
        else System.out.println("NO");
    }

}
