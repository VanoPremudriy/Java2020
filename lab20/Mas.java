package ru.mirea.java2020.lab20;

public class Mas {
    String word;

    public Mas(String word, int count) {
        this.word = word;
        this.count = count;
    }

    int count;

    public String getWord() {
        return word;
    }

    public int getCount() {
        return count;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
