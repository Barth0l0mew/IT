package Homework.Homework5;

public class Task4_23 {
    /*
    Дано двузначное число. Определить:
а) какая из его цифр больше: первая или вторая;
б) одинаковы ли его цифры.
     */
    public static void main(String[] args) {
        int number=55,i=1,tempNumber=number;
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
        if (ten>one)
            System.out.println("а - первое число больше второго");
        else if (one>ten)
            System.out.println("а - второе больше первого");
        else
            System.out.println("б - равны");
    }
}
