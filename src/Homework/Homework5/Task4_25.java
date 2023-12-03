package Homework.Homework5;

public class Task4_25 {
    /*
    4.25. Дано двузначное число. Определить:
а) является ли сумма его цифр двузначным числом;
б) больше ли числа а сумма его цифр.

     */
    public static void main(String[] args) {
        int number=42,i=1, a=122;
        int one=0,ten=0;
        while (number!=0){
            switch (i){
                case 1: one=number%10;
                    break;
                case 2: ten=number%10;
                    break;
            }
            number/=10;
            i++;
        }
        System.out.println(ten+" "+one);
        if ((one+ten)>=10)
            System.out.println("а - сумма цифр двузначная");
        else
            System.out.println("а - сумма цифр не двузначная");
        if (a>(one+ten))
            System.out.println("б - число а больше");
        else
            System.out.println("б - число а меньше");
    }
}
