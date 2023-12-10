package Homework.Homework6;

import java.util.Scanner;

public class Task5_47 {
    /*
Даны числа
1 2 6 a a a , , ..., .
Определить их произведение
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int multi=1;
        for (int i=0; i<6; i++) {
            System.out.print("Input a=");
            multi *= scan.nextInt();
        }
        System.out.println("Multiply="+multi);
    }
}
