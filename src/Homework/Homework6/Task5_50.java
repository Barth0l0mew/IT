package Homework.Homework6;

import java.util.Scanner;

public class Task5_50 {
    /*
    . Даны числа
1 2 10 a a a , , ..., .
Определить их среднее арифметическое
     */
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        System.out.print("Input n=");
        double ari = 0.0;

        for (int i=0; i<10; i++){
            System.out.print("Input a=");
            ari+=scan.nextDouble();
        }
        System.out.printf("Output arithmetic=%.2f",(ari/10));
    }
}
