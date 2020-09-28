package ru.mirea.java2020.lab7;

public class Plate extends Dish {
    private double radius;
    private double depth;
    public Plate(double radius, double depth, String material, String color) {
        super(material, color);
        this.radius=radius;
        this.depth=depth;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public double getRadius() {
        return radius;
    }

    public double getDepth() {
        return depth;
    }

    @Override
    public String toString() {
        return "Plate{" +
                super.toString() +
                ", radius=" + radius +
                ", depth=" + depth +
                '}';
    }
}
