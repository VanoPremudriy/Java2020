package ru.mirea.java2020.lab7;

public class Table extends Furniture{
    private int legNumber;
    private double length;
    private double width;
    private double height;

    public Table(double price, String color, String size, String manufacturer, String material, int legNumber, double length, double width, double height) {
        super(price, color, size, manufacturer, material);
        this.legNumber = legNumber;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public void setLegNumber(int legNumber) {
        this.legNumber = legNumber;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getLegNumber() {
        return legNumber;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Table{" +
                super.toString() +
                ", legNumber=" + legNumber +
                ", length=" + length +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
