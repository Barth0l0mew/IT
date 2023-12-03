package Homework.Homework5;

public class Task4_28 {
    /*
Дано трехзначное число. Определить, какая из его цифр больше:
а) первая или последняя;
б) первая или вторая;
в) вторая или последняя
     */
    public static void main(String[] args) {
        int number=425,i=1, a=120;
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
        if (hun>one)
            System.out.println("а - первая больше последней");
        else if (hun<one)
            System.out.println("а - последняя больше первой");
        else
            System.out.println("а - равны");
        if (hun>ten)
            System.out.println("б - первая больше второй");
        else if (hun<ten)
            System.out.println("б - второй больше первой");
        else
            System.out.println("б - равны");
        if (ten>one)
            System.out.println("в - вторая больше последней");
        else if (ten<one)
            System.out.println("в - последняя больше второй");
        else
            System.out.println("в - равны");
    }
}
