package Homework.Homework4;
import java.util.Scanner;

public class Task11 {
    /*
Задание 11
Найти корни квадратного уравнения и вывести их на 
экран, если они есть. Если корней нет, то вывести сообщение об этом. Конкретное квадратное уравнение определяется коэффициентами a, b, c, которые вводит пользователь с 
клавиатуры.
     */
    public static void main(String[] args) {
       //2 -1 -15 == -2.5 3
        System.out.println("Input a b c");
        Scanner scan = new Scanner(System.in);
        double d;
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c= scan.nextInt();
        d = b*b-4*a*c;
        if (d>0)
            System.out.println("x1="+((-b-Math.sqrt(d))/(2*a))+" x2="+((-b+Math.sqrt(d))/(2*a)));
        else if (d==0)
            System.out.println("x1="+(-b/(2*a)));
        else
            System.out.println("нет решений");
    }
}
