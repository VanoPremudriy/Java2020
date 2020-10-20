package ru.mirea.java2020.lab13;

import java.util.Arrays;

public class SortingStudentsByGPA implements Comparator{


    public int compareTo(Student one, Student two){
            if (one.getPoints() > two.getPoints()) return 1;
            else  if (one.getPoints() < two.getPoints()) return 2;
            return 3;
    }

    public void quickSort(Student[] students, int low, int high) {
        if (students.length == 0)
            return;//завершить выполнение если длина массива равна 0

        if (low >= high)
            return;//завершить выполнение если уже нечего делить

        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        Student opora = students[middle];

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            //while (students[i].getPoints() > opora.getPoints())  {
            while (compareTo(students[i], opora) == 1){
                i++;
            }

            //while(students[j].getPoints() < opora.getPoints()) {
            while (compareTo(students[j],opora) ==2 ) {
                j--;
            }

            if (i <= j) {//меняем местами
                Student temp = students[i];
                students[i] = students[j];
                students[j] = temp;
                i++;
                j--;
            }
        }

        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            quickSort(students, low, j);

        if (high > i)
            quickSort(students, i, high);
    }


}
