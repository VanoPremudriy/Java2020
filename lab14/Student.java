package ru.mirea.java2020.lab14;

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

    public boolean equals(Student another){
        if (this.Family==another.Family
                && this.id==another.id
                && this.Name == another.Name
                && this.middleName == another.middleName
                && this.points==another.points
        ) return true;
        else return false;
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
