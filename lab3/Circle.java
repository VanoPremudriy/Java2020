package ru.mirea.java2020.lab3;

public class Circle {
    static final double PI = 3.1415926;
    double radius;
    double length;
    double diameter;
    double area;
    String color;

    public Circle(){
        radius =0;
        length = 0;
        diameter =0;
        area = 0;
        color = "не указан";
    }
    public void setRadius(double radius){
        this.radius=radius;
        this.diameter=radius*2;
        this.length = 2*PI*radius;
        this.area = PI*radius*radius;
    }

    public void setColor(String color){
        this.color = color;
    }

    public double getRadius(){
        return radius;
    }

    public double getDiameter(){
        return diameter;
    }

    public double getLength(){
        return length;
    }

    public double getArea(){
        return area;
    }

    public String getColor(){
        return color;
    }

    public String toString(){
        return "Радиус: "+getRadius() +"\n"
                + "Диаметр: "+ getDiameter()+"\n"
                + "Длина: "+ getLength()+"\n"
                + "Площадь: "+ getArea()+"\n"
                + "Цвет: "+ getColor();
    }
}
