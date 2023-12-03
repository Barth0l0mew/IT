package Homework.Homework5;

public class Task4_32 {
    /*
    4.32. Дано четырехзначное число. Определить:
а) равна ли сумма двух первых его цифр сумме двух его последних цифр;
б) кратна ли трем сумма его цифр;
в) кратно ли четырем произведение его цифр;
г) кратно ли произведение его цифр числу а.

     */
    public static void main(String[] args) {
        int number=1435,i=1, a=567;
        int one=0,ten=0,hun=0,thousand=0;
        while (number!=0){
            switch (i){
                case 1: one=number%10;
                    break;
                case 2: ten=number%10;
                    break;
                case 3: hun=number%10;
                    break;
                case 4: thousand=number%10;
                    break;
            }
            number/=10;
            i++;
        }
        System.out.println(thousand+" "+hun+" "+ten+" "+one);
        if ((one+ten)==(hun+thousand))
            System.out.println("a - равны");
        else
            System.out.println("a - не равны");
        if ((one+ten+hun+thousand)%3==0)
            System.out.println("б - кратны 3");
        else
            System.out.println("б - не кратны 3");
        if ((one*ten*hun*thousand)%4==0)
            System.out.println("в - кратны 4");
        else
            System.out.println("в - не кратны 4");
        if (a%(one*ten*hun*thousand)==0)
            System.out.println("г - кратны числу "+a);
        else
            System.out.println("г - не кратны числу "+a);
    }
}
