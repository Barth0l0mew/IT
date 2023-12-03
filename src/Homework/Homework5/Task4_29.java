package Homework.Homework5;

public class Task4_29 {
    /*
    . Дано трехзначное число. Определить, равен ли квадрат этого числа сумме кубов его цифр.
     */
    public static void main(String[] args) {
        int number=444,i=1, a=120;
        int tempNumber=number;
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
        if (tempNumber*tempNumber==(Math.pow(one,3)+Math.pow(ten,3)+Math.pow(hun,3)))
            System.out.println("квадрат этого числа равен сумме кубов его цифр");
        else
            System.out.println("квадрат этого числа не равен сумме кубов его цифр");
    }
}
