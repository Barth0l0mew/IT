package Homework.Homework16;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class MultiCollections {
    public static void main(String[] args) {
        ArrayList<String> al1= new ArrayList<>();
        al1.add("a");
        al1.add("f");
        al1.add("c");
        ArrayList<String> al2= new ArrayList<>();
        al2.add("q");
        al2.add("f");
        al2.add("n");
        ArrayList<String> al3= new ArrayList<>();
        al3.add("d");
        al3.add("a");
        al3.add("q");
        //Comparator<ArrayList<String>> comparator = Comparator.comparing(el-> el.toString());
        Comparator<ArrayList<String>> comparator2 = Comparator.comparing(el->{
            int result=0;
            for (String str:el){

                for (Byte  b:str.getBytes()){
                    result+=b;
                }
            }
        //    System.out.println(el +" "+result);
            return result;
        });
        PriorityQueue<ArrayList<String>> pqal = new PriorityQueue<>(comparator2);
        PriorityQueue<ArrayList<String>> pqal2 = new PriorityQueue<>(comparator2);
        //Добавление элемеента в очередь
        addCollection(pqal,al1);
        addCollection(pqal,al2);
        addCollection(pqal,al3);
        pqal2.addAll(pqal);
        //Вывод очередь списком по этапу создания
        print(pqal);
        //удаляет коллеекцию по месту (По приоритету) в очереди
        deleteCollection(pqal,1);
        //вывод очереди по правилу приоритета
        outputCollection(pqal);
        //удаляет коллекцию по порядку создания очередь
        deleteCollection2(pqal2,1);
        //вывод очереди по правилу приоритета
        outputCollection(pqal2);


    }
    //Выводит очередь по правилу приоритета
static void outputCollection (PriorityQueue<ArrayList<String>> pqal ){
    System.out.println("------------ Output Collection --------");
            while (!pqal.isEmpty()){
            System.out.println(pqal.poll());
        }
}
//выврд по порядку
    static void print (PriorityQueue<ArrayList<String>> pqal ){
        PriorityQueue<ArrayList<String>> temp = new PriorityQueue<>();

        System.out.println("--------- Print Result --------");

        Iterator<ArrayList<String>> iterator = pqal.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());

    }
    static void addCollection(PriorityQueue<ArrayList<String>> pqal, ArrayList<String> pqalNew){
        pqal.add(pqalNew);
    }
    //Удаляет элемент в очереди приоритете
    static void deleteCollection(PriorityQueue<ArrayList<String>> pqal, int index ){
        PriorityQueue<ArrayList<String>> temp = new PriorityQueue<>(pqal.comparator());
        ArrayList<String> arTemp = new ArrayList<>();
        int count=0;
        while (!pqal.isEmpty()){

            if (count!=index) {
                arTemp = pqal.poll();
               // System.out.println("   "+arTemp);
                temp.add(arTemp);
            }
            else
            {
                arTemp = pqal.poll();
               // System.out.println("delete   "+arTemp);
            }
            count++;
        }
        //print(temp);
        pqal.clear();
        pqal.addAll(temp);
        //pqal=temp;

    }
    // удаляет элемент в очереди по списку
    static void deleteCollection2 (PriorityQueue<ArrayList<String>> pqal, int index){
        PriorityQueue<ArrayList<String>> temp = new PriorityQueue<>(pqal.comparator());
        Iterator<ArrayList<String>> iterator = pqal.iterator();
        ArrayList<String> arTemp = new ArrayList<>();
        int count=0;
        while (iterator.hasNext()){
            arTemp = iterator.next();
            if (count!=index) {
              //  System.out.println("   "+arTemp);
                temp.add(arTemp);
            }
            else
            {
             //   System.out.println("delete   "+arTemp);
            }
            count++;
        }
        pqal.clear();
        pqal.addAll(temp);
        //print(temp);
    }
}
