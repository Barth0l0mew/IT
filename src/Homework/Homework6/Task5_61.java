package Homework.Homework6;

import java.util.Random;

public class Task5_61 {
    /*
    звестен рост каждого ученика двух классов. 
    Определить средний рост учеников каждого класса. Численность обоих классов одинаковая.
     */
    public static void main(String[] args) {
        Random random = new Random();
        int[][] height = new int[2][20];
        for (int i=0; i<height.length;i++){
            for (int j=0;j<height[i].length;j++){
                height[i][j]=random.nextInt(20)+150;
            }
        }
        for (int[] classes: height){
            double sum=0.0;
            int i=0;
            for (int people: classes){
                sum+=people;
            }
            System.out.printf("Average height class = %.2f\n",(sum/height[i].length));
            i++;
        }
    }
}
