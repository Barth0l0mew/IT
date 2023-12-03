package Homework.Homework5;

public class Task4_20 {
    /*
    4.20. Если целое число m делится нацело на целое число n, то вывести на экран частное от деления, в противном случае вывести сообщение "m на n нацело не
делится".
     */
    public static void main(String[] args) {
        int m=6,n=3;
        if (m%n==0)
            System.out.println("m делится нацело на целое число n");
        else
            System.out.println("m на n нацело не делится");
    }
}
