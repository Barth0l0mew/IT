package Homework.Homework6;

import java.util.Scanner;

public class Task5_53 {
    /*
    Известны оценки ученика по 10 предметам. Определить среднюю оценку
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sum=0.0;
        for (int i=0; i<10 ; i++){
            System.out.print("Input mark =");
            sum+=scan.nextInt();
        }
        System.out.println("Average mark="+(sum/10));
    }
}
