package ru.mirea.java2020.lab8;



public class Square extends Shape {

    private double size;

    public Square(String color, double size, double x, double y) {
        super(color, x, y);
        this.size = size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }


}
