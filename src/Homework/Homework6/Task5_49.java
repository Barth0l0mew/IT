package Homework.Homework6;

import java.util.Scanner;

public class Task5_49 {
    /*
    Даны натуральное число n и вещественные числа
1 2 , , ..., . n a a a
Определить
сумму квадратов вещественных чисел.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input n=");
        int n=scan.nextInt();
        double sum=0.0;
        for (int i=0; i<n; i++ ){
            System.out.print("Input a=");
            sum+=Math.pow(scan.nextDouble(),2);
        }
        System.out.printf("Output sum=%.2f",sum);
    }
}
