package ru.mirea.java2020.lab7;

public class Chair extends Furniture {
    private int legNumber;
    private String seat;

    public Chair(double price, String color, String size, String manufacturer, String material, int legNumber, String seat) {
        super(price, color, size, manufacturer, material);
        this.legNumber = legNumber;
        this.seat = seat;
    }

    public void setLegNumber(int legNumber) {
        this.legNumber = legNumber;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public int getLegNumber() {
        return legNumber;
    }

    public String getSeat() {
        return seat;
    }

    @Override
    public String toString() {
        return "Chair{" +
                super.toString() +
                ", legNumber=" + legNumber +
                ", seat='" + seat + '\'' +
                '}';
    }
}
