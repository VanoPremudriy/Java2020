package ru.mirea.java2020.lab23;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Solution <T,K> {
    public ArrayList <T> newArraList(T...elements){
        ArrayList <T> list = new ArrayList<>();
        for (T elm:elements){
            list.add(elm);
        }
        return list;
    }
    public HashSet<T> newHashSet(T...elements){
        HashSet<T> hash = new HashSet<>();
        for(T elm: elements){
            hash.add(elm);
        }
        return hash;
    }
    public HashMap <K,T> newHasMap(List<?extends K> keys,List<? extends T> values){
        if(keys.size() != values.size()){
            throw new IllegalArgumentException();
        }
        HashMap <K,T> map = new HashMap<>();
        for (int i = 0;i < keys.size();i++){
            map.put(keys.get(i),values.get(i));
        }
        return map;
    }
}