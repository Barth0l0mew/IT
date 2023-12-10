package Homework.Homework6;

import java.util.Scanner;

public class Task5_42 {
    /*
    Известны оценки абитуриента на четырех экзаменах.
     Определить сумму набранных им баллов.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int sum=0;
        for (int i=0; i<4; i++){
            System.out.printf("Input mark test %d =",(i+1));
            sum+=scan.nextInt();
        }
        System.out.printf("Sum mark %d",sum);
    }
}
