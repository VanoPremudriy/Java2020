package ru.mirea.java2020.lab3;

public class Book {
    private String author;
    private String name;
    private int year;
    private String genre;
    private int pagesNumber;
    private double height;
    private double width;

    public Book(){
        this.author = "не указан";
        this.name ="не указано";
        this.year = 0;
        this.genre = "не указан";
        this.pagesNumber = 0;
        this.height = 0;
        this.width =0;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setPagesNumber(int pagesNumber) {
        this.pagesNumber = pagesNumber;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }

    public int getPagesNumber() {
        return pagesNumber;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return  "Автор книги: " + author + '\n' +
                "Название книги: " + name + '\n' +
                "Год выхода книги: " + year + '\n' +
                "Жанр книги: " + genre + '\n' +
                "Количество страниц в книге: " + pagesNumber +'\n' +
                "Высота книги: " + height +'\n' +
                "Длина книги: " + width;
    }
}
