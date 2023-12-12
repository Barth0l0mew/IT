package Homework.Homework7;

public class Task5_83 {
    /*
     некоторых языках программирования (например, в Паскале) не предусмотрена операция возведения в степень.
      Составить программу для расчета степени n вещественного числа a (n — натуральное число).
     */
    public static void main(String[] args) {
        int n=5;
        double x=2.2, power=1;
        for (int i=1;i<=n;i++)
            power*=x;
        System.out.printf("x^n=%.2f",power);
    }
}
