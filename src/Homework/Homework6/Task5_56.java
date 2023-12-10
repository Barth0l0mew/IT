package Homework.Homework6;

import java.util.Scanner;

public class Task5_56 {
    /*
    Даны натуральное число n и числа
1 2 , , ..., . n a a a
Определить:
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input n=");
        int n=scan.nextInt();
        int[] array = new int[n];
        double sum=0.0;
        for (int i=0; i < array.length;i++){
            System.out.print("Input a=");
            array[i]=scan.nextInt();
        }
        System.out.println("Task A ");
        for (int element: array)
            sum+=Math.abs(element);
        System.out.printf("Output a=%.2f\n",(sum/array.length));
        System.out.println("Task B");
        sum=1.0;
        for (int element:array)
            sum*=Math.abs(element);
        System.out.printf("Output a=%.2f\n",(sum/array.length));
        System.out.println("Task C");
        for (int i=0 ; i<array.length-1;i++){
            System.out.print((array[i]+array[i+1])+" ");
        }

        System.out.println("\nTask D");
        int part=1;
        sum=0;
        for (int element: array){
            sum+=element*part;
            part*=-1;
        }
        System.out.println("Output a="+sum);
    }
}
