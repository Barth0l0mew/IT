package Homework.Homework5;

import java.util.Scanner;

public class Task4_36 {
    /*
    . Работа светофора для пешеходов запрограммирована следующим образом: в
начале каждого часа в течение трех минут горит зеленый сигнал, затем в течение двух минут — красный, в течение трех минут — опять зеленый и т. д.
Дано вещественное число t, означающее время в минутах, прошедшее с начала очередного часа. Определить, сигнал какого цвета горит для пешеходов в
этот момент.
     */
    public static void main(String[] args) {
        System.out.print("Input time:");
        Scanner scan = new Scanner(System.in);
        double t=scan.nextDouble();
        if (t%(2+3)>=3) System.out.println("Red");
        else System.out.println("Green");
        for (int i=1;i<100; i++)
            if (i%(2+3)>=3) System.out.println("Red");
            else System.out.println("Green");
    }
}
