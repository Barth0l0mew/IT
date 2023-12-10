package Homework.Homework6;

import java.util.Scanner;

public class Task5_55 {
    /*
    Известна масса каждого предмета из некоторого набора предметов. Определить среднюю массу.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input count object =");
        int count= scan.nextInt();
        double sum=0.0;
        for (int i=0; i<count; i++){
            System.out.print("Input weight =");
            sum+=scan.nextInt();
        }
        System.out.printf("average weight =%.2f",(sum/count));
    }
}
