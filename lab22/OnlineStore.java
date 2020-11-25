package ru.mirea.java2020.lab22;

import java.util.Scanner;

public class OnlineStore {
    public static  Scanner sc = new Scanner(System.in);
    public static String name, family, middleName, inn;
    public static  void setINN(String myINN) throws INNException{
        if (myINN.length() == 12 ) {
            inn = myINN;
        } else {
            throw new INNException("Недействительный ИНН: " + myINN);
        }
    }
    public static void main(String[] args) {
        System.out.print("Введите ваше имя: ");
        name = sc.next();
        System.out.print("Введите вашу фамилию: ");
        family = sc.next();
        System.out.print("Введите ваше отчество: ");
        middleName = sc.next();
        System.out.print("Введите ИНН: ");
        try{
            setINN(sc.next());
            System.out.println("Введенные данные:");
            System.out.println("Имя: "+name);
            System.out.println("Фамилия: "+ family);
            System.out.println("Отчество: " + middleName);
            System.out.println("ИНН: " + inn);
        } catch (INNException e){
            System.out.println(e);
        }
    }
}
