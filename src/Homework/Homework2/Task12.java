package Homework2;

public class Task12 {
    /*
    Задание 12
Ученикам первого класса дают 1 пирожок. Если вес первоклассника менее 30 кг, дополнительно дают 1 стакан молока и ещё 1 пирожок. В первых классах школы учится n
учеников. Стакан молока имеет емкость 200 мл, а упаковка
молока – 0,9 л.
Написать программу, которая определит количество пакетов молока и пирожков, необходимых каждый день для
условий:
■ если в школе 100% всех учеников, у которых вес меньше
30 кг;
■ если в школе 60% учеников имеют вес меньше 30 кг.
■ если в школе 1% учеников имеют вес меньше 30 кг.
(!!!) Учесть, что нельзя купить два с половиной пакета
молока; можно купить два или три.
     */
    public static void main(String[] args) {
        int countPie=0, countMilk=0, countStudent=100;
        countPie=countStudent*1+countStudent*1;
        countMilk=(int)Math.ceil(countStudent*0.2/0.9);
        System.out.printf("В школе 100%% учеников меньше 30кг-колличество пирожков=%d количество молока=%d\n",countPie,countMilk );
        countPie=(int)(countStudent*1+countStudent*0.6);
        countMilk=(int)Math.ceil(countStudent*0.6*0.2/0.9);
        System.out.printf("В школе 60%% учеников меньше 30кг-колличество пирожков=%d количество молока=%d\n",countPie,countMilk );
        countPie=(int)(countStudent*1+countStudent*0.01);
        countMilk=(int)Math.ceil(countStudent*0.01*0.2/0.9);
        System.out.printf("В школе 1%% учеников меньше 30кг-колличество пирожков=%d количество молока=%d\n",countPie,countMilk );


    }
}
