package ru.mirea.java2020.lab13;

import java.util.Arrays;
import java.util.Comparator;


public class SortingStudentsByGPA implements Comparator<Student> {


    public int compare(Student one, Student two){
        return Integer.compare(one.getPoints(), two.getPoints());
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
            while (compare(students[i], opora) >0){
                i++;
            }
            while (compare(students[j],opora) <0 ) {
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
