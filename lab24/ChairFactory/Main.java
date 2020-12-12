package ru.mirea.java2020.lab24.ChairFactory;


public class Main {
    public static void main(String[] args) {
        ChairFactory chairFactory = new ChairFactory();
        Client client = new Client();
        client.setChair(chairFactory.createMagicChair("wood"));
        client.sit();
    }
}