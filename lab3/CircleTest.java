package ru.mirea.java2020.lab3;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double radius;
        String color;
        Circle newCircle = new Circle();

        System.out.print("Введите радиус окружности: ");
        radius = sc.nextDouble();
        System.out.print("Введите цвет окружности: ");
        color = sc.next();
        newCircle.setRadius(radius);
        newCircle.setColor(color);
        System.out.print(newCircle.toString());

    }
}
