package Homework.Homework4;

import java.util.Scanner;

public class Task4 {
    /*
    Задание 4
Дана точка на плоскости заданная координатами x и y,
определить и вывести в консоль, в какой четверти находится точка, в прямоугольной (декартовой) системе координат.
Четверти обозначены римскими цифрами.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print ("Input X= ");
        int x=scan.nextInt();
        System.out.print("Input Y= ");
        int y=scan.nextInt();
        if (x>0&&y>0)
            System.out.println("\nCoordinata I");
        else if (x<0&&y>0)
            System.out.println("Coordinata II");
        else if (x<0&&y<0)
            System.out.println("Coordinata III");
        else if (x>0&&y<0)
            System.out.println("Coordinata IV");


    }
}
