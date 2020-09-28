package ru.mirea.java2020.lab7;

import java.util.ArrayList;

public class Person {
   private ArrayList<Furniture> basket = new ArrayList<Furniture>();

    public Person() {
    }

    public void byFurniture(Furniture obj){
        basket.add(obj);
    }

    String getMyPurchase(){
        return basket.toString();
    }
}
