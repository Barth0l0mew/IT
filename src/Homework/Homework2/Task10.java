package Homework2;

public class Task10 {
    /*
    Задание 10
Написать программу расчета идеального веса к росту. В
константах хранятся рост (height) и вес (weight). Вывести на
консоль сообщение, сколько килограмм нужно набрать или
сбросить (идеальный вес = рост - 110).
     */
    public static void main(String[] args) {
        final int HEIGHT=175, WEIGHT=65;
        int standart=HEIGHT-110;
        if (standart>WEIGHT){
            System.out.println("Вам нужно набрать="+(standart-WEIGHT));
        } else if (standart<WEIGHT){
            System.out.println("Вам нужно сбросить="+(WEIGHT-standart));
        } else {
            System.out.println("У Вас все хорошо");
        }
    }
}
