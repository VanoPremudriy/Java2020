package ru.mirea.java2020.lab5;


public class Rectangle extends Shape {

    private double width;
    private double length;

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
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

    @Override
    public double getArea() {
        return width*length;
    }

    @Override
    public double getPerimeter() {
        return width*2+length*2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                super.toString()+
                ", width=" + width +
                ", length=" + length +
                ", Area=" + getArea() +
                ", Perimeter=" + getPerimeter() +
                '}';
    }
}
