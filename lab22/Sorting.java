package ru.mirea.java2020.lab22;

public class Sorting {
    public static void selectionSort(Comparable[] list){
        int min;
        Comparable temp;

        for (int i=0;i<list.length;i++){
            min=i;
            for (int scan = i+1;scan<list.length;scan++){
                if (list[scan].compareTo(list[min])<0)
                    min = scan;
            }
            temp=list[min];
            list[min]=list[i];
            list[i]=temp;
        }
    }

    public static Object Search(Comparable[] list, Comparable object){
        for (int i=0;i<list.length;i++){
            if (list[i].equals(object)) return list[i];
        }

        return new Student("","Не найдено","","",0);
    }
}
