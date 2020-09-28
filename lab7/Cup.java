package ru.mirea.java2020.lab7;

public class Cup extends Dish{
    private double depth;
    private double volume;

    public Cup(double depth, double volume, String material, String color) {
        super(material, color);
        this.depth=depth;
        this.volume=volume;
    }

    public double getDepth() {
        return depth;
    }

    public double getVolume() {
        return volume;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Cup{" +
                super.toString() +
                ", depth=" + depth +
                ", volume=" + volume +
                '}';
    }
}
