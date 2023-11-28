package Homework2;

public class Task5 {
    /*
    Задание 5
Подсчитать площадь и длину окружности для круга с радиусом R. Радиус должен быть задан константой в программе. Вывести результат на консоль.

     */
    public static void main(String[] args) {
        final double R=3.0;
        double area, l;
        area=Math.PI*R*R;
        l=2*Math.PI*R;
        System.out.printf("Area round=%.2f, L round=%.2f",area,l);

    }
}
