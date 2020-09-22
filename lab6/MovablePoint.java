package ru.mirea.java2020.lab6;

public class MovablePoint implements Movable{

    double x;
    double y;

    public MovablePoint(double x, double y) {
        this.x=x;
        this.y=y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" +y +
                '}';
    }

    @Override
    public void Move(double right, double up) {
        x+=right;
        y+=up;
    }
}
