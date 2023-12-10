package Homework.Homework6;

import java.util.Random;

public class Task5_43_44_45_46 {
    /*
    В ведомости указана зарплата, выплаченная каждому из сотрудников фирмы
за месяц. Определить общую сумму выплаченных по ведомости денег.
     */
    /*
    Задача 5,43-5,47 подобные

     */
    public static void main(String[] args) {
        Random random = new Random();
        int[] list = new int [random.nextInt(10)+1];
        int sum=0;
        //формирование зарплаты даботнику
        for (int i=0; i<list.length;i++){
            list[i]= random.nextInt(1000);
        }
        //выводим лист зарплаты
        for (int i=0; i<list.length;i++)
            System.out.printf("%d - %d\n",(i+1),list[i]);
        for (int worker: list)
            sum+=worker;
        System.out.println("Sum="+sum);
    }
}
