package ru.mirea.java2020.lab27.Number1;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Тузов", "Иван", "Владимирович");
        Person person2 = new Person("", "", "Иванов");
        Person person3 = new Person("Сергей", "", "Смирнов");
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
    }
}