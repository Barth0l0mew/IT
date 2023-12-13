package Homework.Homework7;

import java.util.Scanner;

public class Task6_32 {
    /*
    Дано натуральное число. Определить, сколько раз в нем встречается минимальная цифра (например, для числа для числа 102 200 ответ равен 3, для
числа 40 330 — 2, для числа 10 345 — 1)
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input number");
        int n = scan.nextInt();
        int temp = n;
        int min = 10;
        int count = 0;
        while (n > 0) {
            if (n % 10 < min) {
                min = n % 10;
            } else {
                while (temp > 0) {
                    if (temp % 10 == min)
                        count++;
                    temp /= 10;
                }
            }
            n /= 10;
        }
        System.out.printf("max=%d count=%d", min, count);
    }
}
