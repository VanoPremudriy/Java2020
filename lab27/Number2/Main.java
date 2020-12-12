package ru.mirea.java2020.lab27.Number2;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Address("Россия, Московская область, Москва, улица Московская, 1, 1, 1"));
        System.out.println(new Address("Россия, Владимирская область, Киржач, улица Калинина, 5, 6, 4"));
        System.out.println(new Address("Россия-Московская область-Москва-Арбат-1-2-3", "-"));
        System.out.println(new Address("Россия:Республика Башкортостан:Уфа:проспект Октября:4:5:6", ":"));
    }
}