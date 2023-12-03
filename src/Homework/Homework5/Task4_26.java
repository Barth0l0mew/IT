package Homework.Homework5;

public class Task4_26 {
    /*
    . Дано двузначное число. Определить:
а) кратна ли трем сумма его цифр;
б) кратна ли сумма его цифр числу а
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
        if ((one+ten)%3==0)
            System.out.println("а - кратна");
        else
            System.out.println("а - не кратна");
        if (a%(one+ten)==0)
            System.out.println("б - кратна");
        else
            System.out.println("б - не кратна");
    }
}
