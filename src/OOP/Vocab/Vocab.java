package OOP.Vocab;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Vocab {
    public static void main(String[] args) {
    int count = 'z'-'a'+1;
       // System.out.println(count);
        List<String> vocab = new LinkedList<>();
        //Заполнение из файла
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader("src/DATA/vocab.txt"))) {
            String s;
            do {
                s = br.readLine();
                if (s != null)
                    vocab.add(s);
            }
            while (s != null);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Vocab words size = "+vocab.size());
        Collections.sort(vocab);
        System.out.println(vocab);
        //вывести первые 10 слов
        ListIterator<String> it = vocab.listIterator(0);
        int i=0;
        while (it.hasNext()&&i<10){
            System.out.print (it.next()+ " ");
            i++;
        }
    }
}
