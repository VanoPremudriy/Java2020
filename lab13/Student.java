package ru.mirea.java2020.lab13;

public class Student {
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
        return "Student{" +
                "Name='" + Name + '\'' +
                ", Family='" + Family + '\'' +
                ", middleName='" + middleName + '\'' +
                ", id='" + id + '\'' +
                ", points=" + points +
                '}';
    }
}
