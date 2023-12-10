package Homework.Homework6;

import java.util.Scanner;

public class Task5_54 {
    /*
    . Известны оценки по алгебре каждого ученика класса. Определить среднюю
оценку.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input count people =");
        int count= scan.nextInt();
        double sum=0.0;
        for (int i=0; i<count; i++){
            System.out.print("Input mark =");
            sum+=scan.nextInt();
        }
        System.out.printf("average mark =%.2f",(sum/count));
    }
}
