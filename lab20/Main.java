package ru.mirea.java2020.lab20;

import java.io.File;
import java.io.FileWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int count=0;
        boolean isThis = false;
        ArrayList<Mas> words = new ArrayList<Mas>();
        String str;
        try{
            File file = new File("WAR AND PEACE.txt");
            File fileTwo = new File("WAR AND PEACE (changed).txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNext()){
                str = sc.next();
                str = str.replaceAll(",","");
                str = str.replaceAll("\\.","");
                str = str.replaceAll("\"","");
                str = str.replaceAll(";","");
                for (Mas word : words) {
                    if (word.getWord().equals(str)) {
                        word.setCount(word.getCount() + 1);
                        isThis = true;
                    }
                }
                if (!isThis) {
                    words.add(new Mas(str,1));
                    count++;
                }
                isThis = false;
            }
            Mas mas = new Mas("",0);
            for (Mas word : words) {
                if (word.getCount() > mas.getCount()) {
                    mas = word;
                }
            }
            Collections.sort(words, new Comparator<Mas>(){
                @Override
                public int compare(Mas o1, Mas o2) {
                    if (o1.getCount() < o2.getCount()) return 1;
                    if (o1.getCount() > o2.getCount()) return -1;
                    return 0;
                }
            });
            for (int i=0;i<10;i++){
                System.out.println(words.get(i).getWord()+ " "+words.get(i).getCount());
            }

            Scanner sc2 = new Scanner(file);
            FileWriter fw = new FileWriter(fileTwo);
            while (sc2.hasNextLine()){
                str = sc2.nextLine();
                str = str.replaceAll(" ", "#");
                fw.write(str+"#");
            }
            fw.close();

        }catch (Exception e){
            System.out.println("Error");
        }
    }
}
