package Homework.Homework4;
import java.util.Scanner;

public class Task1 {
    /*
    Задание 1
Написать программу, которая предлагает пользователю
ввести c клавиатуры номер дня недели, и в ответ показывает название этого дня (например, 6 – это суббота). Решить с
использованием switch
     */
    public static void main(String[] args) {
        System.out.print("Input number day ");
        Scanner scan = new Scanner(System.in);
        int numberDay = scan.nextInt();
        switch (numberDay){
            case 1:{
                System.out.println("Monday");
                break;
            }
            case 2:{
                System.out.println("Tuesday");
                break;
            }
            case 3:{
                System.out.println("Wednesday");
                break;
            }
            case 4:{
                System.out.println("Thursday");
                break;
            }
            case 5:{
                System.out.println("Friday");
                break;
            }
            case 6:{
                System.out.println("Saturday");
                break;
            }
            case 7:{
                System.out.println("Sunday");
            }
            default:
                System.out.println("Input number day: ");
        }

    }
}
