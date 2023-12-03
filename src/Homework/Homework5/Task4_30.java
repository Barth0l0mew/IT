package Homework.Homework5;

public class Task4_30 {
    /*
    Дано трехзначное число. Определить:
а) является ли сумма его цифр двузначным числом;
б) является ли произведение его цифр трехзначным числом;
в) больше ли числа а произведение его цифр;
г) кратна ли пяти сумма его цифр;
д) кратна ли сумма его цифр числу а.
     */
    public static void main(String[] args) {
        int number=444,i=1, a=120;
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
        if ((one+ten+hun)>=10)
            System.out.println("a - двузначное");
        else
            System.out.println("a - не двузначное");
        if ((one*ten*hun)>=100)
            System.out.println("б - трехзначяное");
        else
            System.out.println("б - не трехзначное");
        if ((one*ten*hun)>a)
            System.out.println("в - произведение больше числа "+a);
        else
            System.out.println("в - произведение меньше числа "+a);
        if ((one+ten+hun)%5==0)
            System.out.println("г - кратны 5");
        else
            System.out.println("г - не кратны 5");
        if (a%(one+ten+hun)==0)
            System.out.println("г - число "+a+" кратна сумме");
        else
            System.out.println("г - число "+a+" не кратна сумме");
    }
}
