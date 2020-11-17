package ru.mirea.java2020.lab19;

import java.io.File;
import java.io.FileWriter;

public class Four {
    public static void main(String[] args) {
        try {
            File file = new File("FileFour.txt");
            FileWriter fw = new FileWriter(file, true);
            fw.write("Text");
            fw.close();
        }catch (Exception e){
            System.out.println("Error");
        }
    }
}
