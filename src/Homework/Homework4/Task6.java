package Homework.Homework4;

import java.util.Scanner;

public class Task6 {
    /*
    Задание 6
Определить количество дней в году, который вводит
пользователь, и вывести их в консоль. В високосном году –
366 дней, тогда как в обычном – 365. Високосными годами
являются все годы, делящиеся нацело на 4, за исключением
столетий, которые не делятся нацело на 400.

     */
    public static void main(String[] args) {
        System.out.print("Input eyers = ");
        Scanner scan = new Scanner(System.in);
        int eyers=scan.nextInt();

        if (eyers%4==0&&eyers%100!=0)
            System.out.println(eyers+" - day - "+366);
        else System.out.println(eyers+" - day - "+365);
    }
}
