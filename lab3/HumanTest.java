package ru.mirea.java2020.lab3;

import java.util.Scanner;

public class HumanTest {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Human man = new Human();

        String color;
        double size;
        String eyeColor;
        String hairColor;
        String hairStyle;
        int fingers;
        String tatto;

        System.out.print("Введите цвет кожи головы: ");
        color = sc.next();
        man.getHead().setColor(color);
        System.out.print("Введите высоту головы: ");
        size = sc.nextDouble();
        man.getHead().setHeight(size);
        System.out.print("Введите ширину головы: ");
        size = sc.nextDouble();
        man.getHead().setWidth(size);
        System.out.print("Введите прическу: ");
        hairStyle = sc.next();
        man.getHead().setHairStyle(hairStyle);
        System.out.print("Введите цвет прически: ");
        hairColor = sc.next();
        man.getHead().setHairColor(hairColor);
        System.out.print("Введите цвет глаз: ");
        eyeColor = sc.next();
        man.getHead().setEyeColor(eyeColor);

        System.out.print("Введите цвет левой руки: ");
        color = sc.next();
        man.getLeftHand().setColor(color);
        System.out.print("Введиту длину левой руки: ");
        size = sc.nextDouble();
        man.getLeftHand().setLength(size);
        System.out.print("Введите количество пальцев на левой руке: ");
        fingers = sc.nextInt();
        man.getLeftHand().setFingersNumber(fingers);
        System.out.print("Введите татуировку на левой руке: ");
        tatto = sc.next();
        man.getLeftHand().setTatto(tatto);

        System.out.print("Введите цвет правой руки: ");
        color = sc.next();
        man.getRightHand().setColor(color);
        System.out.print("Введиту длину правой руки: ");
        size = sc.nextDouble();
        man.getRightHand().setLength(size);
        System.out.print("Введите количество пальцев на правой руке: ");
        fingers = sc.nextInt();
        man.getRightHand().setFingersNumber(fingers);
        System.out.print("Введите татуировку на правой руке: ");
        tatto = sc.next();
        man.getRightHand().setTatto(tatto);

        System.out.print("Введите цвет левой ноги: ");
        color = sc.next();
        man.getLeftLeg().setColor(color);
        System.out.print("Введиту длину левой ноги: ");
        size = sc.nextDouble();
        man.getLeftLeg().setLength(size);
        System.out.print("Введите количество пальцев на левой ноге: ");
        fingers = sc.nextInt();
        man.getLeftLeg().setFingersNumber(fingers);
        System.out.print("Введите татуировку на левой ноге: ");
        tatto = sc.next();
        man.getLeftLeg().setTatto(tatto);

        System.out.print("Введите цвет правой ноги: ");
        color = sc.next();
        man.getRightLeg().setColor(color);
        System.out.print("Введиту длину правой ноги: ");
        size = sc.nextDouble();
        man.getRightLeg().setLength(size);
        System.out.print("Введите количество пальцев на правой ноге: ");
        fingers = sc.nextInt();
        man.getRightLeg().setFingersNumber(fingers);
        System.out.print("Введите татуировку на правой ноге: ");
        tatto = sc.next();
        man.getRightLeg().setTatto(tatto);
        System.out.println();
        System.out.println(man.toString());
    }
}
