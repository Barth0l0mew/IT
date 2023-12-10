package Homework.Homework6;

import java.util.Random;

public class Task5_62 {
    /*
     Известны оценки по физике каждого ученика двух классов. Определить
среднюю оценку в каждом классе. Количество учащихся в каждом классе
одинаковое.
     */
    public static void main(String[] args) {
        Random random = new Random();
        int[][] journal = new int[2][20];
        for (int i=0; i<journal.length;i++){
            for (int j=0;j<journal[i].length;j++){
                journal[i][j]=random.nextInt(10);
            }
        }
        for (int[] classes: journal){
            double sum=0.0;
            int i=0;
            for (int people: classes){
                sum+=people;
            }
            System.out.printf("Average journal class = %.2f\n",(sum/journal[i].length));
            i++;
        }
    }
}
