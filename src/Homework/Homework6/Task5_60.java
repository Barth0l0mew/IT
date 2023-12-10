package Homework.Homework6;

import java.util.Random;

public class Task5_60 {
    /*
    Известно количество осадков, выпавших за каждый день января и марта.
     Определить среднедневное количество осадков за каждый месяц.
     */
    public static void main(String[] args) {
        Random random = new Random();
        int[][] weather = new int[2][31];
         for (int i=0; i<weather.length;i++){
             for (int j=0;j<weather[i].length;j++){
                 weather[i][j]=random.nextInt(50);
             }
         }
         for (int[] mounth: weather){
             double sum=0.0;
             int i=0;
             for (int day: mounth){
                 sum+=day;
             }
             System.out.printf("Average rainfall = %.2f\n",(sum/weather[i].length));
             i++;
         }
    }
}
