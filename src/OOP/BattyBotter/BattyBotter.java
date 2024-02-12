package OOP.BattyBotter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class BattyBotter {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>(); // есть сортировка в натуральном порядка
        StringBuilder db = new StringBuilder();
        String s=null;
        try (BufferedReader br = new BufferedReader(new FileReader("src/DATA/Baty.txt"))) {
            do {
                s=br.readLine();
                db.append(s);
                db.append(System.lineSeparator());
            }while (s!=null);
        }
        catch (FileNotFoundException e) {
            //throw new RuntimeException(e);
            System.err.println("Файл не найден");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(db);
        String content = db.toString();
        content = content.replaceAll("[^A-Za-z]"," ");
        String[] words = content.split(" ");
        System.out.println(Arrays.toString(words));
        for (String el:words){
            if ((el.length()!=0)&&((el.charAt(0)=='b')||(el.charAt(0)=='B')))
                set.add(el);
        }
//        for (String s2 : words) {
//            if ((s2.length() != 0) && ((s2.charAt(0) == 'b') || (s2.charAt(0) == 'B')))
//                set.add(s2);
//        }
        System.out.println("--------set-------");
        System.out.println(set.toString());
    }
}
