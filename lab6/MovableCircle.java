package ru.mirea.java2020.lab6;

import ru.mirea.java2020.lab5.Circle;

public class MovableCircle extends Circle{

    MovablePoint mp;
    public MovableCircle(String color, boolean filled, double x, double y, double radius) {
        super(color, filled, radius);
        mp = new MovablePoint(x,y);

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
