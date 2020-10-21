package ru.mirea.java2020.lab14;

public class Search {
    SortingStudentsByGPA st = new SortingStudentsByGPA();
    int diff;
    int getDiff(){
        return diff;
    }
    int lineSearch(Student[] students, Student myStudent){
        diff=0;
        for (int i=0;i<students.length;i++){
            diff++;
            if (students[i].equals(myStudent)) return i;
        }
        return -1;
    }

    int binarySearch(Student[] students, Student myStudent){
        diff=0;
        int first =0;
        int last = students.length-1;
        int position = (first+last)/2;

        while ((!students[position].equals(myStudent)) && (first <= last)) {
            diff++;
              if (st.compare(students[position], myStudent) >0 ) {
                last = position - 1;
            } else {
                first = position + 1;
            }
            position = (first + last) / 2;
        }
       // if (st.compare(students[position], myStudent) <=0) {
        if (students[position].equals(myStudent)){
            return position;

        } else {
            return -1;
        }
    }


    int reqBinarySearch( Student[] students, Student myStudent, int low, int high, int diff1)
    {
        diff1++;
        if( low > high )
            return -1;
        int mid = ( low + high ) / 2;
        if (st.compare(students[mid], myStudent) <0)
            return reqBinarySearch(students , myStudent, mid + 1, high, diff1 );
        else if( st.compare(students[mid], myStudent) >0 )
            return reqBinarySearch( students,myStudent, low, mid - 1, diff1 );
        else {
            this.diff=diff1;
            return mid;
        }
    }

    int reqLineSearch(Student[] students, Student myStudent, int size, int diff1){
        diff1++;
        size--;
        if (students[size].equals(myStudent)) {
            diff = diff1;
            return (size);
        }
        if (size==-1) return -1;
        return reqLineSearch(students, myStudent, size, diff1);
    }

}
