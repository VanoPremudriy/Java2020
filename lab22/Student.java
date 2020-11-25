package ru.mirea.java2020.lab22;

public class Student implements Comparable{
    String Name;
    String Family;
    String middleName;
    String id;
    int points;

    public Student(String name, String family, String middleName, String id, int points) {
        Name = name;
        Family = family;
        this.middleName = middleName;
        this.id = id;
        this.points = points;
    }


    public void setName(String name) {
        Name = name;
    }

    public void setFamily(String family) {
        Family = family;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public String getFamily() {
        return Family;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getPoints() {
        return points;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return Family+" "+Name +" "+ middleName+ " " + points + " "+ id;
    }

    @Override
    public boolean equals(Object o){
        return Family.equals(((Student)o).Family) && Name.equals(((Student)o).Name) && middleName.equals(((Student)o).middleName);
    }

    @Override
    public int compareTo(Object o) {
        if (points>((Student)o).getPoints()) return 1;
        else
        if (points<((Student) o).getPoints()) return -1;
        else
        return 0;
    }
}
