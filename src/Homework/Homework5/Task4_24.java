package Homework.Homework5;

public class Task4_24 {
    /*
    Дано двузначное число. Определить, равен ли квадрат этого числа учетверенной сумме кубов его цифр. Например, для числа 48 ответ положительный, для
числа 52 — отрицательный.

     */
    public static void main(String[] args) {
        int number=52,i=1,tempNumber=number;
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
        if ((tempNumber*tempNumber)==(4*(Math.pow(one,3)+Math.pow(ten,3))))
            System.out.println("квадрат этого числа равен учетверенной сумме кубов его цифр ");
        else
            System.out.println("квадрат этого числа не равен учетверенной сумме кубов его цифр ");

    }
}
