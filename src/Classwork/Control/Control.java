package Classwork.Control;
/*
Найти последнюю цифру выражения a^b, где a и b - целые числа.
Результат может быть очень большим.

Для каждого числа от 0 до 9 вычислить все возможные последние цифры при возведении их в заданную степень.
Записать их в коллекцию ArrayList<ArrayList<Integer>>.
Найти закономерность при получении последней цифры.*/

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class Control {
    public static void main(String[] args) {
        //
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            res.add(new ArrayList<>());
            for (int j = 0; j < 10; j++) {
                int digit = (int) Math.pow(i,j)%10;
                if (!res.get(i).contains(digit))
                    res.get(i).add(digit);
                //res.get(i).add(((int)Math.pow(i,j))%10);
            }
            System.out.println(res.get(i));
            System.out.println();
        }
        int a=1;
        int b=7;
        int lasta= a%10;
        System.out.println(Math.pow(lasta,b%4));
       // System.out.println(b%4);
    }
    public static void step (int i){
        System.out.println("------start---"+i);
        for (int a=0;a<20;a++){
            System.out.println(a+" "+(long)Math.pow(i,a));
        }
    }
    public static int getResult(int a, int b){
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            res.add(new ArrayList<>());

            for (int j = 1; j < 10; j++) {
                int digit = (int) Math.pow(i, j) % 10;
                if (!res.get(i).contains(digit))
                    res.get(i).add(digit);
            }

//System.out.println(res.get(i));
        }

        int lasta = a%10;
        //int lastb = b%4==0?res.get(lasta).size()-1:b % res.get(lasta).size()-1;
        int lastb= b%4;
        //int last =  res.get(lasta).get(lastb);
        int last = (int) Math.pow(lasta,lastb)%10;
        if (a==0 && b==0)
            return 1;
        return last;

    }
}



