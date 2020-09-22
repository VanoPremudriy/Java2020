package ru.mirea.java2020.lab6;

import ru.mirea.java2020.lab5.Rectangle;

public class MovableRectangle extends Rectangle{
    MovablePoint mp;
    public MovableRectangle(String color, boolean filled, double width, double length, double x, double y) {
        super(color, filled, width, length);
        mp = new MovablePoint(x,y);
    }

    public void setMp(double x, double y) {
        this.mp.setX(x);
        this.mp.setY(y);
    }

    public MovablePoint getMp() {
        return mp;
    }
    
    @Override
    public String toString() {
        return "Rectangle{" +
                super.toString()+
                ", xCenter=" + mp.getX() +
                ", yCenter=" +  mp.getY() +
                '}';
    }

}
