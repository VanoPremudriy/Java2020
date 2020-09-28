package ru.mirea.java2020.lab7;

public abstract class Dish {
    private String material;
    private String color;

    public Dish(String material, String color){
        this.material=material;
        this.color = color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return
                "material='" + material + '\'' +
                ", color='" + color + '\'';
    }
}
