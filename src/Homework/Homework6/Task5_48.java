package Homework.Homework6;

import java.util.Scanner;

public class Task5_48 {
    /*
    сумма квадратов
     */
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int sum=0;
            for (int i=0; i<10;i++){
                System.out.print("Input a=");
                sum+=Math.pow(scan.nextInt(), 2);
            }
        System.out.println("Output sum="+sum);
    }
}
