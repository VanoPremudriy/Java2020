package ru.mirea.java2020.lab24.ChairFactory;

public class Client {
    private Chair chair;

    public void sit() {
        System.out.println("Сидит на " + chair);
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }
}
