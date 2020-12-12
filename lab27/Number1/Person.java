package ru.mirea.java2020.lab27.Number1;

public class Person {
    final private String name;
    final private String middleName;
    final private String family;

    public Person(String family, String name, String middleName) {
        this.name = name;
        this.middleName = middleName;
        this.family = family;
    }

    @Override
    public String toString() {
        return new StringBuffer(family).append(" ")
                .append(!name.isEmpty() ? name.charAt(0) + "." : "")
                .append(!middleName.isEmpty() ? middleName.charAt(0) + ".": "").toString();
    }
}