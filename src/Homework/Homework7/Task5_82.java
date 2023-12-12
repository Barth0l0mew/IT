package Homework.Homework7;

public class Task5_82 {
    /*
    Составить программу для расчета факториала натурального числа n (факториал числа n равен
1 2 ... n
).
     */
    public static void main(String[] args) {
        int n=10,fact=1;
        for (int i=1; i<=5; i++)
            fact*=i;
        System.out.println("fact="+fact);

    }
}
