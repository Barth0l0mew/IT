package Patterns.Fasad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;

public class DoctorCroaky {

    public static void main(String[] args) {
    Story.tellStory();
    }
}
class Frog {
    public Frog  went (){
        System.out.println("frog - went");
        return this;
    }
    public Frog sayHello (){
        System.out.println("frog - Say Hello");
        return this;
    }
    public Frog intraduse(){
        System.out.println("frog - I am doctor");
        return this;

    }
    public Frog advertise(){
        System.out.println("frog - Advertise");
        return this;

    }
    public Frog listen (){
        System.out.println("frog - Listen frog");
        return this;
    }
}
interface Animal {
    void come();
}
class  Fox implements Animal{

    @Override
    public void come() {
        System.out.println("fox - The fox come");
    }
    public void ask (){
        System.out.println("fox - The fox ask ");
    }
}
class Dear implements Animal {

    @Override
    public void come() {
        System.out.println("dear - The dear come");
    }
}
class Tortoise implements Animal{

    @Override
    public void come() {
        System.out.println("tortoise - The tortoise come");
    }
}
class Story{
    private static List<Animal> animals = new ArrayList<>();
    public static void tellStory(){
        Frog frog = new Frog();
        animals.add(new Dear());
        animals.add(new Tortoise());
        Animal fox =new Fox();
        animals.add(fox);
        frog.went().sayHello();
        animals.forEach(Animal::come);
        frog.intraduse().advertise();
        ((Fox)fox).ask();
        frog.listen();



    }
}

