package Homework.Homework17;

import org.w3c.dom.stylesheets.LinkStyle;

import java.io.*;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Homework17 {
    public static void main(String[] args) {
        System.out.println("Homework 17");
        String fileName="src/DATA/Homework17.txt";
        ArrayList<String> listText = new ArrayList<>();
        listText.addAll(list(fileName));
        print(listText);
        exercise_1(listText,"Д");
        exercise_2(listText,30);
        exrcise_3(listText,10);
        exercise_4(listText,"баба");
        exercise_5(listText,"А");
        exercise_7(listText);
        exercise_8(listText);

    }
    static ArrayList<String> list (String fileName){
        ArrayList<String> list = new ArrayList<>();
        File file = new File (fileName);
        System.out.println("-----read file -------");

        int index=1;
        try ( FileInputStream imput = new FileInputStream(fileName);
              InputStreamReader reader = new InputStreamReader(imput);
              BufferedReader buf = new BufferedReader(reader)) {
            System.out.println(file.getName());
            while(buf.ready()){
                //System.out.print(buf.readLine()+"\n");
                list.add(buf.readLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
    static  void print (ArrayList<String> list){
        System.out.println("-------print ArrayList------");
        list.forEach(el-> System.out.println(el));
    }
    static void exercise_1 (ArrayList<String> list, String prefix){
        System.out.println("---------Exercise_1---------");
        System.out.printf("Вывести строки начинающиеся на =%s\n",prefix);
        list.forEach(el-> {
            if (el.startsWith(prefix)){
                System.out.println(el);
            }
        });
    }
    static void exercise_2 (ArrayList<String> list,int count){
        System.out.println("---------Exercise_2---------");
        System.out.printf("Вывести все его строки, содержащие более 30 символов;\n");
        list.stream().filter(str->str.length()>count).forEach(str-> System.out.println(str+" length = "+str.length()));
    }
    static void exrcise_3 (ArrayList<String> list,int col){
        System.out.println("---------Exercise_3---------");
        System.out.println("Выыести все его строки, в которых имеется более трех пробелов;\n");
        list.stream().filter(str-> {
            int count = 0;
            for (char el : str.toCharArray()) {
                if (el == ' ') {
                    count++;
                }
                if (count > col) return true;

            } return false;
        }).forEach(str-> System.out.println(str));
    }
    static void exercise_4 (ArrayList<String> list,String regex){
        System.out.println("---------Exercise_4---------");
        System.out.println("Выыести  все его строки, содержащие в качестве фрагмента заданный текст.\n");
        list.stream().filter(str->{
            if (str.indexOf(regex)!=-1)
                return true;
            else
                return false;
        }).forEach(str-> System.out.println(str));
    }
    static void exercise_5 (ArrayList<String> list, String regex){
        System.out.println("---------Exercise_5---------");
        System.out.println("Выыести  количество строк, начинающихся с букв указывающих в параметре;\n");
        System.out.printf("Буква =%S \n",regex);
        System.out.println("Колличество строк = "+list.stream().filter(str->str.startsWith(regex)).count());
    }
    static void exercise_7 (ArrayList<String> list){
        System.out.println("---------Exercise_7---------");
        System.out.println("Найти длину самой длинной строки.\n");
        System.out.println("Cаммая длинная строка = "+list.stream().map(str->str.length()).max(Integer::compareTo).get());

    }
    static void exercise_8 (ArrayList<String> list){
        System.out.println("---------Exercise_8---------");
        System.out.println("Вывести номер и самую длинную строку.\n");

        ArrayList<Integer> listNum = new ArrayList<>();
        for (String str: list){
            listNum.add(str.length());
        }
        int temp=0;
        int index=0;
        for (int i=0; i<listNum.size()-1;i++){
            if (temp<listNum.get(i)){
                temp=listNum.get(i);
                index=i;
            }
        }
        System.out.println("Длина самой длинной строки = "+temp);
        System.out.println("Номер саммой длинной строки = "+(index+1));
        System.out.println(list.get(index));
    }

}
