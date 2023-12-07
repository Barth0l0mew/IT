package Zlatopolskiy;

import java.util.Scanner;

public class Task5_27 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Input a=");
        int a= scan.nextInt();
        System.out.println("Input b=");
        int b=scan.nextInt();
        int sum=0;
        for (int i=a; i<=b;i++)
            sum+=i;
        System.out.println("sum="+sum);
        System.out.printf("sum=%d",sum);
    }
}
