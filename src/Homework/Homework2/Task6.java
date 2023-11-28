package Homework2;

public class Task6 {
    /*
    Задание 6
Есть прямоугольник, у которого известна ширина w и
высота h. Найти и вывести на консоль периметр и площадь
заданного прямоугольника. Высота и ширина прямоугольника должна задаваться константными переменными в коде
программы.
     */
    public static void main(String[] args) {
        final double WIDTH=2.0;
        final double HEIGHT=3.0;
        double s,l;
        s=WIDTH*HEIGHT;
        l=(WIDTH+HEIGHT)*2;
        System.out.printf("Area rectangle=%.2f, L rectangle=%.2f",s,l);
    }
}
