package Homework.Homework4;
public class Task10 {
    /*
Задание 10
Определить номер подъезда девятиэтажного дома, по 
указанному номеру квартиры N. Считать, что на каждом 
этаже находится M квартир. Вывести в консоль номер подъезда. 
     */
    public static void main(String[] args) {
        int stage=9, numberFlat=23,countFlat=4;
        System.out.println("Подъезд №="+((numberFlat-1)/(stage*countFlat)+1));
    }
}
