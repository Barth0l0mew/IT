package Homework2;

public class Task1 {
    /*
    Задание 1
В переменных х и y хранятся два натуральных числа. Создайте программу, выводящую на консоль:
■ результат целочисленного деления x на y;
■ остаток от деления x на y;
■ квадратный корень x.
     */
    public static void main(String[] args) {
        int x= 16, y=3;
        System.out.println("Целочисленного деления x на y ="+(x/y));
        System.out.println("Остаток от деления x на y = "+(x%y));
        System.out.printf("Квадратный корень x=%.2f",(Math.sqrt(x)));
    }
}
