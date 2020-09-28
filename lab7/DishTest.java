package ru.mirea.java2020.lab7;

public class DishTest {
    public static void main(String args[]){
        Cup myCup = new Cup(12,13,"porcelain","blue" );
        System.out.println(myCup);
        Appliance myAppliance = new Appliance("knife", 10, "silver", "silver");
        System.out.println(myAppliance);
        Plate myPlate = new Plate(14, 14,"Glass", "none");
        System.out.println(myPlate);
    }
}
