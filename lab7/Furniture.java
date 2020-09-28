package ru.mirea.java2020.lab7;

public abstract class Furniture {
    private double price;
    private String color;
    private String size;
    private String manufacturer;
    private String material;

    public Furniture(double price, String color, String size, String manufacturer,String material) {
        this.price = price;
        this.color = color;
        this.size = size;
        this.manufacturer = manufacturer;
        this.material = material;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString() {
        return "price=" + price +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", manufacturer='" + manufacturer + '\''+
                ", material='"+material+'\'';
    }

}
