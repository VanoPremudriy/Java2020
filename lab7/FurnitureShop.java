package ru.mirea.java2020.lab7;

import java.util.ArrayList;

public class FurnitureShop {
    private ArrayList<Furniture> furnitures = new ArrayList<Furniture>();

    public FurnitureShop() {
    }

    void addChairInShop(Chair ... args) {
        for (int i=0;i<args.length;i++) furnitures.add(args[i]);
    }

    void addSofaInShop(Sofa ... args){
        for (int i=0;i<args.length;i++) furnitures.add(args[i]);
    }

    void addTableInShop(Table ... args){
        for (int i=0;i<args.length;i++) furnitures.add(args[i]);
    }

    ArrayList<Furniture> getFurniture(){
        return furnitures;
    }



}
