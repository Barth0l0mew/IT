package Homework.Homework4;

import java.util.Scanner;

public class Task2 {
    /*
    Задание 2
С клавиатуры вводится время (количество часов от 0 до
24) – программа выводит приветствие, соответствующее
введенному времени (например, ввели 15 часов – выводится
приветствие «Добрый день»)
     */
    public static void main(String[] args) {
        System.out.print("Input hour");
        Scanner scan = new Scanner(System.in);
        int hour = scan.nextInt();
        if (hour>5&&hour<=12)
            System.out.println("Good Morning");
        else if (hour>12&&hour<=16)
            System.out.println("Good afternoon");
        else if (hour>16&&hour<=24)
            System.out.println("Good evening");
        else if (hour>0&&hour<=5)
            System.out.println("Good noon");
        else System.out.println("Input correct hour");

    }
}
