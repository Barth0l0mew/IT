package Homework.Homework6;

import java.util.Scanner;

public class Task5_51 {
    /*
    Даны натуральное число n и вещественные числа
1 2 , , ..., . n a a a
Определить
среднее арифметическое вещественных чисел.

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input n=");
        int n= scan.nextInt();
        double ari=0.0;
        for (int i=0; i<n; i++){
            System.out.print("Input a=");
            ari+=scan.nextDouble();
        }
        System.out.printf("Output arithmetic=%.2f",(ari/n));
    }
}
