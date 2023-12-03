package Homework.Homework5;

public class Task4_31 {
    /*
    4.31. Дано трехзначное число.
а) Верно ли, что все его цифры одинаковые?
б) Определить, есть ли среди его цифр одинаковые
     */
    public static void main(String[] args) {
        int number=444,i=1;
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
        if (one==ten&&one==hun)
            System.out.println("а - все цифры равны");
        else
            System.out.println("а - все цифры не равны");
        if (one==ten||one==hun||ten==hun)
            System.out.println("б - хотябы есть одинаковые");
        else
            System.out.println("б - все разные цифры");
    }
}
