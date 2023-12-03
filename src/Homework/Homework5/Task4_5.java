package Homework.Homework5;

public class Task4_5 {
    /*
    Для функций, заданных графически (рис. 4.3), определить значение у при заданном значении х
     */
    public static void main(String[] args) {
        double x=2.5,y;
        y=x>=2?2:x;
        System.out.println("a - y="+y);
        x=2;
        y=x>=3?-3:-x;
        System.out.println("б - у="+y);

    }
}
