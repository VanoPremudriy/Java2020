package ru.mirea.java2020.lab15;

public class Tester {
    public static void main(String[] args) {
        Collection col = new Collection(1,5,3,7,2,9,10,35,12);

        System.out.println(col.getMax());
        System.out.println(col.getMin());
        System.out.println(col.getMiddleArif());
        col.add(44);
        col.delete(3);
        System.out.println(col.searchValue(3));
        System.out.println(col.searchInd(2));
    }
}
