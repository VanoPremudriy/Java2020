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
            return;

        if (low >= high)
            return;


        int middle = low + (high - low) / 2;
        Student opora = students[middle];


        int i = low, j = high;
        while (i <= j) {

            while (compareTo(students[i], opora) == 1){
                i++;
            }


            while (compareTo(students[j],opora) ==2 ) {
                j--;
            }

            if (i <= j) {
                Student temp = students[i];
                students[i] = students[j];
                students[j] = temp;
                i++;
                j--;
            }
        }


        if (low < j)
            quickSort(students, low, j);

        if (high > i)
            quickSort(students, i, high);
    }


}
