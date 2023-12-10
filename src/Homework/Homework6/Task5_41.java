package Homework.Homework6;

import java.util.Scanner;

public class Task5_41 {
    /*
    Известна масса каждого из 12 предметов.
    Определить общую массу всего набора предметов
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        double sum=0.0;
        for (int i=0; i<12; i++){
            System.out.print("Input a=");
            sum+=scan.nextDouble();
        }
        System.out.printf("Output %.2f",sum);
    }
}
