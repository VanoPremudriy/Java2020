package ru.mirea.java2020.lab3;

public class Head {

    private double height;
    private double width;
    private String color;
    private String hairStyle;
    private String hairColor;
    private String eyeColor;

    public Head() {
        this.height = 0;
        this.width = 0;
        this.color = "не указан";
        this.hairStyle = "не указан";
        this.eyeColor = "не указан";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHairStyle(String hairStyle) {
        this.hairStyle = hairStyle;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public String getColor() {
        return color;
    }

    public String getHairStyle() {
        return hairStyle;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    @Override
    public String toString() {
        return "Длина головы: " + height + "\n"
                +"Ширина головы: " + width + "\n"
                +"Цвет головы: " + color + "\n"
                +"Прическа: " + hairStyle + "\n"
                +"Цвет прически: " + hairStyle + "\n"
                +"Цвет глаз: " + eyeColor;
    }
}
