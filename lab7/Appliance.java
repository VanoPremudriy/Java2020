package ru.mirea.java2020.lab7;

public class Appliance extends Dish{
    private String type;
    private double length;
    public Appliance(String type, double length, String material, String color) {
        super(material, color);
        this.type=type;
        this.length=length;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getType() {
        return type;
    }

    public double getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Appliance{" +
                super.toString() +
                ", type='" + type + '\'' +
                ", length=" + length +
                '}';
    }
}
