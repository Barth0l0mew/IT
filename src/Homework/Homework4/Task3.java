package Homework.Homework4;

import java.util.Scanner;

public class Task3 {
    /*
    Задание 3
Написать программу, которая предлагает пользователю
выбрать животное из списка (1 – кошка, 2 – собака и т.д.), и в
ответ показывает, какие звуки издает выбранное животное.
В списке должно быть не менее 10 животных
     */
    public static void main(String[] args) {
        String[] animals = {"cat","dog","dug","pig","lion","sheep","frog","horse","bear","cow"};
        System.out.println("Animals:");
        for (int i=0; i<animals.length;i++){
            System.out.println((i+1)+" "+animals[i]);
        }
        System.out.println("Input number animals: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        switch (number){
            case 1:{
                System.out.println("may-may");
                break;
            }
            case 2:{
                System.out.println("gav-gav");
                break;
            }
            case 3:{
                System.out.println("cry-cry");
                break;
            }
            case 4:{
                System.out.println("hru-hru");
                break;
            }
            case 5:{
                System.out.println("R-R-R-R-R-R-R");
                break;
            }
            case 6:{
                System.out.println("Be-be-be");
                break;
            }
            case 7:{
                System.out.println("kva-kva");
                break;
            }
            case 8:{
                System.out.println("IGO-IGO-GO");
                break;
            }
            case 9:{
                System.out.println("ar-ar-ar");
                break;
            }
            case 10:{
                System.out.println("mu-mu-mu");
                break;
            }
            default:
                System.out.println("input correct number");
        }

    }
}
