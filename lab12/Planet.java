package ru.mirea.java2020.lab12;

public enum Planet {

    MERCURY(3.33, 2440),
    VENUS(48.7, 6051.8),
    EARTH(59.7, 6371),
    MARS(6.42, 3396.9),
    JUPITER(18986, 69911),
    SATURN(5680, 58232),
    URANUS (868, 25559),
    NEPTUNE(1020, 24622);

    public double weight, radius;

    Planet(double weight, double radius){
        this.weight = weight;
        this.radius = radius;
    }
}
