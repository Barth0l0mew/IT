package Homework.Homework5;

public class Task4_14 {
    /*
    даны вещественные числа a, b, c (a 0). Выяснить, имеет ли уравнение
2
ax bx c 0
вещественные корни.
4.14. Для условий предыдущей задачи в случае наличия вещественных корней найти их, в противном случае — вывести на экран соответствующее сообщение.
Вариант равенства корней отдельно не рассматривать.

     */
    public static void main(String[] args) {
        double a=1,b=-3,c=4;
        double d=b*b-4*a*c ;
        if (d>0)
            System.out.println("x1="+((-b+Math.sqrt(d))/(2*a))+" x2="+((-b-Math.sqrt(d))/(2*a)));
        else
            System.out.println("Корней нет");
    }
}
