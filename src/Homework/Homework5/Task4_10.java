package Homework.Homework5;

public class Task4_10 {
    /*
     Даны радиус круга и сторона квадрата. У какой фигуры площадь больше?
     */
    public static void main(String[] args) {
        double r=3,a=5;
        if ((Math.PI*r*r)>a*a)
            System.out.println("Area round");
        else
            System.out.println("Area square");
    }
}
