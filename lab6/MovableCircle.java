package ru.mirea.java2020.lab6;

import ru.mirea.java2020.lab5.Circle;

public class MovableCircle extends Circle{

    MovablePoint mp;
    public MovableCircle(String color, boolean filled, double x, double y, double radius) {
        super(color, filled, radius);
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
        return "MovableCircle{" +
                super.toString() +
                ", xCenter=" + mp.getX() +
                ", yCenter=" +  mp.getY() +
                '}';
    }

}
