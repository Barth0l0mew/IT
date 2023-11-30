package Homework.Homework4;
import java.util.Scanner;

public class Task12 {
    /*
Задание 12
Программа запрашивает шестизначное число. После ввода определяет, будет ли являться «счастливым» билет с таким номером (сумма первых трех цифр совпадает с суммой 
трех последних).
Пример входных данных: 
423027
954832
Вывод:
Да
Нет

     */
    public static void main(String[] args) {
        System.out.println("Input : ");
        Scanner scan = new Scanner(System.in);
        int sum1=0,sum2=0;
        String str=scan.nextLine();
        if (str.length()>6)
            System.out.println("number not correct");
        else {
            for (int i=0;i<str.length();i++)
            {
                if (i<3){
                    sum1+=Integer.valueOf(str.charAt(i));
                }else {
                    sum2+=Integer.valueOf(str.charAt(i));
                }

            }
        }
        if (sum1==sum2)
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}
