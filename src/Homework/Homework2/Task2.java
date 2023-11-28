package Homework2;

public class Task2 {

    /*
    Задание 2
В переменной n хранится натуральное (целое) трехзначное число. Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n.
     */
    public static void main(String[] args) {
        int n=563,sum=0;
        sum+=n%10;
        sum+=(n/10)%10;
        sum+=n/100;
        System.out.println("Sum="+sum);

    }
}
