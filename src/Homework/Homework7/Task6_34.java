package Homework.Homework7;

public class Task6_34 {
    /*
    . Найти 15 первых натуральных чисел, делящихся нацело на 19 и находящихся
в интервале, левая граница которого равна 100.
     */
    public static void main(String[] args) {
        int start=100;
        int count=0;
        while (count<15){
            start=start/19*19+19;
            count++;
            System.out.print(start+" ");
        }
        System.out.println();
        for (int i=100; i<400;i++)
        if (i%19==0)
            System.out.print(i+" ");
    }
}
