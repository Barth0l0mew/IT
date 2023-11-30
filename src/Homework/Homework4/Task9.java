package Homework.Homework4;
public class Task9 {
    /*
Задание 9
Даны координаты начала и координаты конца отрезка. 
Если считать отрезок обозначением горки, то в одном случае он обозначает спуск, в другом – подъем. Определить и 
вывести на экран – спуск это или подъем, ровная дорога или 
вообще отвесная
     */
    public static void main(String[] args) {
        int x1=3,y1=5,x2=7,y2=10;
        if (x1<x2&&y1>y2)
            System.out.println("спуск");
        else if (x1<x2&&y1<y2)
            System.out.println("подъем");
        else if (x1==x2)
            System.out.println("Отвесная");
        else if (y1==y2)
            System.out.println("Ровная");
    }
}
