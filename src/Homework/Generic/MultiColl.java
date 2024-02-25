package Homework.Generic;

import java.util.*;

public class MultiColl {
    public static void main(String[] args) {
        ArrayList<String> al= new ArrayList<>();
        al.add("a");
        al.add("b");
        al.add("c");
        ArrayList<String> al2= new ArrayList<>();
        al2.add("d");
        al2.add("a");
        al2.add("f");
        ArrayList<String> al3= new ArrayList<>();
        al3.add("o");
        al3.add("m");
        al3.add("q");
        ArrayList<ArrayList<String>> aa= new ArrayList<>();
        aa.add(al);
        aa.add(al);
        aa.add(al);
        printCollection(aa);
        ArrayList<Integer> alI2= new ArrayList<>();
        alI2.add(1);
        alI2.add(2);
        alI2.add(3);
        printCollection(alI2);
        addCollection(aa,al);
        printCollection(aa);
        Comparator<ArrayList<String>> comparator2 = Comparator.comparing(el->{
            int result=0;
            for (String str:el){

                for (Byte  b:str.getBytes()){
                    result+=b;
                }
            }
                System.out.println(el +" "+result);
            return result;
        });
        System.out.println("---new collection---");
        PriorityQueue<ArrayList<String>> pa = new PriorityQueue<>(comparator2);
        addCollection(pa,al);
        addCollection(pa,al3);
        addCollection(pa,al2);
        printCollection(pa);

        removeCollection(pa,1);
        printCollection(pa);
        removeCollection(pa,1);
        printCollection(pa);

    }

    static <T> void printCollection (Collection<T> t){
        System.out.println("---------------printCollection-------");
        //System.out.println(t.getClass());
        for (T el :t){
            //System.out.println(el.getClass());
            System.out.println(el );
        }
    }
    static <T,E> void addCollection (Collection<T> t, Collection<E> e){
        t.add((T) e);
    }
    static <T> void removeCollection (Collection<T> t,int index){
        System.out.println("------RemoveCollection-----");
        //System.out.println(temp.getClass());
            //System.out.println("el "+el.getClass());
            Iterator<T> iterator = t.iterator();
            int count=0;
            while (iterator.hasNext()) {
                T temp= iterator.next();
                if (count==index) {
                    System.out.printf("Remove index=%d collection=%s\n",index,temp);
                    iterator.remove();
                }

               count++;
            }

    }

}
