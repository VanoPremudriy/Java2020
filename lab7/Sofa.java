package ru.mirea.java2020.lab7;

public class Sofa extends Furniture{
    private double length;
    private double width;
    private double height;
    public Sofa(double price, String size, String manufacturer, String color, double length, double width, double height, String material) {
        super(price, color, size, manufacturer,material);
        this.length = length;
        this.width = width;
        this.height = height;
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
        return "Sofa{" +
                super.toString() +
                ", length=" + length +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}

