package ru.mirea.java2020.lab26;

import java.util.*;

public class Main {
    public static void removeDuplicates(HashMap<String, String> map) {
        HashMap<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> e : copy.entrySet()) {
            for (Map.Entry<String, String> e1 : copy.entrySet()) {
                if (e.getValue().equals(e1.getValue()) && !e.getKey().equals(e1.getKey()))
                    map.values().remove(e.getValue());
            }
        }
    }

    public static void addValue(Map<String, ArrayList<String>> map, City city){
        map.computeIfAbsent(city.getCountry(), k -> new ArrayList<>());
        map.get(city.getCountry()).add(city.getCity());
    }

    public static void main(String[] args) {
        // 1
        HashMap<String, String> map = new HashMap<>();
        map.put("Иванов", "Дмитрий");
        map.put("Олегов", "Олег");
        map.put("Петров", "Василий");
        map.put("Смирнов", "Иван");
        map.put("Николаев", "Егор");
        map.put("Сергеев", "Егор");
        map.put("Попов", "Иван");
        map.put("Карпов", "Андрей");
        map.put("Федоров", "Евгений");
        map.put("Павлов", "Олег");
        removeDuplicates(map);
        System.out.println(map);

        // 2
        Map<String, ArrayList<String>> countries = new HashMap<>();
        ArrayList<City> cities = new ArrayList<>(Arrays.asList(
                new City("Москва", "Россия"),
                new City("Киржач", "Россия"),
                new City("Владимир", "Россия"),
                new City("Париж", "Франция"),
                new City("Берлин", "Германия"),
                new City("Минск", "Беларусь"),
                new City("Нью-Йорк", "США")));

        for (City c: cities){
            addValue(countries, c);
        }
        System.out.println(countries);
    }
}