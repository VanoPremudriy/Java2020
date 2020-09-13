package ru.mirea.java2020.lab3;

public class Leg{
    private  String color;
    private  double length;
    private  int fingersNumber;
    private  String tatto;

    public Leg() {
        color = "не указан";
        length = 0;
        fingersNumber = 0;
        tatto = "не указано";
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setFingersNumber(int fingersNumber) {
        this.fingersNumber = fingersNumber;
    }

    public void setTatto(String tatto) {
        this.tatto = tatto;
    }

    public String getColor() {
        return color;
    }

    public double getLength() {
        return length;
    }

    public int getFingersNumber() {
        return fingersNumber;
    }

    public String getTatto() {
        return tatto;
    }

    @Override
    public String toString() {
        return "Цвет ноги: " + color + '\n'
                + "Длина ноги: " + length + '\n'
                + "Количество пальцев:" + fingersNumber + '\n'
                + "Татуировка: " + tatto;
    }


}
