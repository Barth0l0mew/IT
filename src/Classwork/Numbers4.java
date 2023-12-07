package Classwork;

import java.util.Scanner;

public class Numbers4 {
    /*
    Вводить натуральные числа с клавиатуры.
     Признаком окончания ввода будет не натуральное число
     */
    public static void main(String[] args) {
        solve1();
        solve2(1);
        solve3();

        }


    static void solve1(){
        Scanner scan= new Scanner(System.in);
        int number=1;
        while (number>0){
            System.out.print("input number ");
            number = scan.nextInt();
            System.out.printf("%d \n",number);
        }
    }
    public static void solve2(int number){
        Scanner scan= new Scanner(System.in);

        while (number>0){
            System.out.print("input number ");
            number = scan.nextInt();
            System.out.printf("%d \n",number);
        }

    }
    public static void solve3(){
        Scanner scan= new Scanner(System.in);
        int number;
        do{
            number= scan.nextInt();
            System.out.printf("%d \n",number);
        } while (number>0);
    }
}
