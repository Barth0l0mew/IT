package OOP.InterdeisClass;

import java.util.ArrayList;
import java.util.List;

public class InterfeisClass {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.run();
        duck.swim();
        Squirrel squirrel= new Squirrel();
        squirrel.climb();
        squirrel.run();
        List<Running> animals = new ArrayList<>();
        animals.add(duck);
        animals.add(squirrel);
        for (Running el:animals)
            el.run();
    }
}
class Animals {

}
//интерфейс содержит в себе неарелизованные но запланированные в будущем действие
interface Running{
    public void run();

}
interface Swimming{
    public void swim();
}
interface Climbing{
    public void climb();
}
class Duck extends Animals implements Running,Swimming{
    @Override
    public void run() {
        System.out.println("Duck run");
    }

    @Override
    public void swim() {
        System.out.println("Duck swim");
    }
}
class Squirrel extends Animals implements Running,Climbing{

    @Override
    public void run() {
        System.out.println("Squirrel run" );
    }

    @Override
    public void climb() {
        System.out.println("Squirrel climb");
    }
}
