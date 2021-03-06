package ru.mirea.java2020.lab8;


public class Circle extends Shape {

    private  double width, length;

    public Circle(String color, double width, double length, double x, double y) {
        super(color, x, y);
        this.width = width;
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

}
