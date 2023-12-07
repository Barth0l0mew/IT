package Zlatopolskiy;

import java.util.Scanner;

public class Task5_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input course=");
        double course =scan.nextDouble();

        for (int i=1; i<=20 ; i++) {
            System.out.printf("%d usd = %.2f \n",i,i*course);
        }
    }
}
