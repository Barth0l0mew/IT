package Patterns.Decorator;

import java.util.List;

public class Shoping {
    public static void main(String[] args) {
    Pedestrian people = new Pedestrian();
    people.walk();
    Man man =new Shoemaker(new Dressmaker( new Pedestrian()));
    man.walk();

    }
}
interface Man {
    void walk();

}
class Pedestrian implements Man{

    @Override
    public void walk() {
        System.out.println("I go down the street");
    }
}
abstract  class Decorator implements Man{
    protected Man man;
    public Decorator (Man man){
        this.man= man;
    }
    @Override
    public void walk() {

        man.walk();

    }
}
class Shoemaker extends Decorator {

    public Shoemaker (Man man){
        super(man);
    }
    @Override
    public void walk() {
        System.out.println("I made shoes for man");
        super.walk();
    }
}

class Dressmaker extends Decorator {

    public Dressmaker (Man man){
        super(man);
    }
    @Override
    public void walk() {
        System.out.println("I made dress for man");
        super.walk();
    }
}