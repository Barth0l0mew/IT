package Homework.Homework5;

public class Task4_22 {
    /*
    4.22. Дано натуральное число. Определить:
а) является ли оно четным;
б) оканчивается ли оно цифрой 7.

     */
    public static void main(String[] args) {
        int number=28;
        if (number%2==0)
            System.out.println("а - число четное");
        else
            System.out.println("а - число не четное");
        if (number%10==7)
            System.out.println("б - число оканчиваетсмя на 7");
        else
            System.out.println("б - число не оканчивается на 7");
    }
}
