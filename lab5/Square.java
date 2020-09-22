package ru.mirea.java2020.lab5;

public class Square extends Shape {

    public Square(String color, boolean filled, double size) {
        super(color, filled);
        this.size = size;
    }

    private double size;

    public void setSize(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    @Override
    public double getArea() {
        return size*size;
    }

    @Override
    public double getPerimeter() {
        return size*4;
    }

    @Override
    public String toString() {
        return "Square{" +
                super.toString()+
                ", size=" + size +
                ", Area=" + getArea() +
                ", Perimeter=" + getPerimeter() +
                '}';
    }
}
