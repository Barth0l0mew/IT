package OOP.Simple;

import java.security.PrivilegedAction;

public class Demo {
    public static void main(String[] args) {
        Pen pen = new Pen(Color.BLACK);
        Pen pen2 = new Pen(Color.GRAY);
        System.out.println(pen.getColor());
        System.out.println(pen);
        System.out.println(pen2);
        pen2.setColor(Color.BLUE);
        System.out.println(pen2);
        Car car = new Car(Color.BLUE);
        System.out.println(car.getColor());
        System.out.println(car);
        //car.color=Color.BLACK; //так нежелательно, поля в классе нужно вместо public Color - private Color
        System.out.println(car);
        Variety variety = Variety.FUJI;
        System.out.println(variety);
        Apple apple = new Apple(Variety.FUJI,0.2);
        System.out.println(apple);
        System.out.println(apple.getWeight());
    }
}
