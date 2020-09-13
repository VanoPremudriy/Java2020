package ru.mirea.java2020.lab3;

import java.util.Scanner;

public class BookTest {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Book myBook = new Book();
        String authorName, authorSurname, authorMiddlename;
        String name;
        int year;
        String genre;
        int pagesNumber;
        double height;
        double width;

        System.out.print("Введите ФИО автора книги: ");
        authorSurname = sc.next();
        authorName = sc.next();
        authorMiddlename = sc.next();
        myBook.setAuthor(authorSurname+" "+authorName+" "+authorMiddlename);
        System.out.print("Введите название книги: ");
        name = sc.next();
        myBook.setName(name);
        System.out.print("Введите жанр книги: ");
        genre = sc.next();
        myBook.setGenre(genre);
        System.out.print("Введите год выхода книги: ");
        year = sc.nextInt();
        myBook.setYear(year);
        System.out.print("Введите высоту книги: ");
        height = sc.nextDouble();
        myBook.setHeight(height);
        System.out.print("Введите ширину книги: ");
        width = sc.nextDouble();
        myBook.setWidth(width);
        System.out.print("Введите количество страниц в книге: ");
        pagesNumber = sc.nextInt();
        myBook.setPagesNumber(pagesNumber);
        System.out.println();
        System.out.print(myBook.toString());

    }
}
