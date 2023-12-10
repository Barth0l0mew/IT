package Homework.Homework6;

import java.util.Random;

public class Task5_52 {
    /*
    Известны оценки по физике каждого из 20 учеников класса. Определить среднюю оценку.

     */
    public static void main(String[] args) {
        Random random = new Random();
        int[] journal = new int[20];
        double  sum=0.0;
        for (int i=0; i<journal.length;i++)
            journal[i]=random.nextInt(10);
        for (int mark: journal) {
            System.out.printf("%d\n", mark);
            sum+=mark;
        }
        System.out.println("Average mark = "+(sum/journal.length));
    }
}
