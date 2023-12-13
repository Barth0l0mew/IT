package Homework.Homework7;

import java.util.Scanner;

public class Task6_31 {
    /*
    Дано натуральное число. Определить, сколько раз в нем встречается максимальная цифра (например, для числа 132 233 ответ равен 3, для числа
46 336 — 2, для числа 12 345 — 1).
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input number");
        int n = scan.nextInt();
        int temp = n;
        int max = 0;
        int count = 0;
        while (n > 0) {
            if (n % 10 > max) {
                max = n % 10;
            } else {
                while (temp > 0) {
                    if (temp % 10 == max)
                        count++;
                    temp /= 10;
                }
            }
            n /= 10;
        }
        System.out.printf("max=%d count=%d", max, count);
    }
}
