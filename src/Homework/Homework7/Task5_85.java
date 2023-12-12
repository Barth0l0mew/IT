package Homework.Homework7;

import java.util.Scanner;

public class Task5_85 {
    /*
      Дано пятизначное число. Найти число, получаемое при прочтении его цифр
справа налево.
     */
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int x=0;
        while (Integer.toString(x).length()!=5){
            System.out.println("Input number XXXXX =");
            x= scan.nextInt();
        }

        for (int i=Integer.toString(x).length();i>0;i--)
            System.out.print(Integer.toString(x).charAt(i-1));


    }
}
