package OOP.Vocab;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

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
        //Выыести последни 10 слов
        it = vocab.listIterator(vocab.size());
        i=0;
        System.out.println();
        while (it.hasPrevious()&&i<10){
            System.out.print(it.previous()+" ");
        i++;
        }
        //вывести статистик по словам, сколько 1 - буквенных, 2- буквенных, 3 - буквенных
        int maxLength = 0;
        for (String word:vocab)
            if (maxLength<word.length())
                maxLength = word.length();
        System.out.println(maxLength);
        int[] hist = new int[maxLength];
        //
        for (String word:vocab)
            hist[word.length()-1]++;
        for (int j=0;j<maxLength;j++)
            System.out.printf("Букв %d, слов %d\n ",j+1,hist[j]);
        //вывести слова полиндом
        System.out.println("Слово полиндром");
        for (String word:vocab)
            if (word.equals(new StringBuilder(word).reverse().toString()))
                System.out.println(word);
        //слова анограммы
        System.out.println("Слова анограмы");
        Multimap<String, String> anagrama = ArrayListMultimap.create();
        for (String word:vocab) {
            char[] arr = word.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            anagrama.put(key,word);
        }
        String key="", key2="";
        Map.Entry<String, String> entry2 = null;
        for (Map.Entry<String, String> entry:anagrama.entries())
        {
            key=entry.getKey();
            if (key.equals(key2))
                System.out.println(entry2.getValue()+" "+entry.getValue());
            key2=key;
                entry2=entry;
        }
        //слова с 3 одинаковыми буквами
        System.out.println("Слова с 3 одинаковыми буквами");
        ListIterator<String> ti = vocab.listIterator(0);
        while (ti.hasNext()) {
            String s = ti.next();
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            count = 1;
            char c = ' ';
            for (i = 0; i < arr.length; i++) {
                char c2 = arr[i];
                if (c == c2) count++;
                else count = 1;
                if (count == 3) { //Проверить с 4-мя буквами
                    System.out.print(s+" ");
                    break;
                }
                c = c2;
            }
        }
        System.out.println();
        //три буквы последнии в алфовитном порядке
        System.out.println("три буквы последнии в алфовитном порядке");
        it = vocab.listIterator(0);
        while (it.hasNext()) {
            String s =
                    it.next
                            ();
            char[] arr = s.toCharArray();
            count = 1;
            char c = ' ';
            for (i = 0; i < arr.length; i++) {
                char c2 = arr[i];
                if (c2-c==1) count++;
                else count = 1;
                if (count == 3) { //Проверить с 4-мя буквами
                    System.out.print(s+" ");
                    break;
                }
                c = c2;
            }
        }
    }
}
