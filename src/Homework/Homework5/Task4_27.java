package Homework.Homework5;

public class Task4_27 {
    /*
    Дано трехзначное число. Выяснить, является ли оно палиндромом ("перевертышем"), т. е. таким числом, десятичная запись которого читается одинаково
слева направо и справа налево.

     */
    public static void main(String[] args) {
        int number=424,i=1, a=120;
        int one=0,ten=0,hun=0;
        while (number!=0){
            switch (i){
                case 1: one=number%10;
                    break;
                case 2: ten=number%10;
                    break;
                case 3: hun=number%10;
                    break;
            }
            number/=10;
            i++;
        }
        System.out.println(hun+" "+ten+" "+one);
        if (one==hun)
            System.out.println("Число палиндром");
        else
            System.out.println("Число не палиндром");
    }
}
