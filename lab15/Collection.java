package ru.mirea.java2020.lab15;

import java.util.ArrayList;

public class Collection {
    ArrayList<Integer> mas = new ArrayList<Integer>();

    public Collection(int ... args){
        for (int i=0;i<args.length;i++){
            mas.add(args[i]);
        }
    }

    void add(int element){
        mas.add(element);
    }

    void delete(int element){
        int ind;
        for (int i=0;i<mas.size();i++){
            if (mas.get(i) == element) {mas.remove(i);
            break;}
        }

    }

    int searchValue(int value){
        for (int i=0;i<mas.size();i++){
            if (mas.get(i) == value ) return mas.get(i);
        }
        return -1;
    }

    int searchInd(int index){
        return mas.get(index);
    }

    int getMax(){
        int now = mas.get(0);
        for (int i=0;i<mas.size();i++){
            if (mas.get(i) > now) now = mas.get(i);
        }
        return now;
    }

    int getMin(){
        int now = mas.get(0);
        for (int i=0;i<mas.size();i++){
            if (mas.get(i) < now) now = mas.get(i);
        }
        return now;
    }

    double getMiddleArif(){
        double sum=0;
        for (int i=0;i<mas.size();i++){
            sum+=mas.get(i);
        }
        return sum/mas.size();
    }

}
