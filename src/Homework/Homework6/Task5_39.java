package Homework.Homework6;

import java.util.Scanner;

public class Task5_39 {
    /*
    . Даны числа
1 2 10 a a a , , ..., .
Определить их сумму
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum=0;
        for (int i=0; i<10; i++) {
            System.out.println ("Input a=");
            sum += scan.nextInt();
        }
        System.out.println("Output sum="+sum);
    }
}
