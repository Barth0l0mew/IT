package OOP.Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Collections {
    public static void main(String[] args) {
    Emperor emperor = new Emperor("Akbar");
    List<Courtier> courtiers = new LinkedList<>();
        courtiers.add(new Courtier("First Courtiers"));
        courtiers.add(new Courtier("Second Courtiers"));
        courtiers.add(new Courtier("3th Courtiers"));
        courtiers.add(new Courtier("4th Courtiers"));
        Birbal birbal = new Birbal("Birbal");
        emperor.ask(0);
        //1 способ
        System.out.println("----1 th----- ");
        for (Courtier el : courtiers)
            el.think();
        System.out.println("-----2 th -----------");
        //2 способ
        for (int i=0; i<courtiers.size();i++)
            courtiers.get(i).think();
        System.out.println(" ---------- 3 th ----------");
        //3 способ
        courtiers.forEach(Courtier::think);
        System.out.println("----------- 4th ----------");
        //4 способ
        courtiers.forEach(courtier -> courtier.think());
        System.out.println("---- birbal  enter--------------");
        birbal.enter();
        birbal.ask();
        emperor.ask(0);
        birbal.reply();
        emperor.ask(0);
        birbal.say();
    }
}
class Person{
    private final String name;
    public Person(String name){
        this.name = name;
    }
    public String getName  (){
        return this.name;
    }
}
class Emperor extends Person{
    private final List<String> question = new ArrayList<>();
    public Emperor(String name){
        super(name);
        question.add("\"How many crows are there in this city?\"");
        question.add("\"How can you be so sure?\"");
    }
    public void ask (int number ){
        if (number>question.size()) {
            System.out.println("not qustion");
            return;
        }
        System.out.println(getName()+" asks "+question.get(number));
    }
    public void looks(){
        System.out.println(getName()+" glanced at his courtiers");
    }
}

class Courtier extends Person{
    public Courtier(String name){
        super(name);
    }
    public void think (){
        System.out.println("Head of the  "+ getName()+" began to hang low");
    }

}

class Birbal extends Person{
    Birbal(String name){
        super(name);
    }

    public void enter(){
        System.out.println(getName()+" enters the courtyard");
    }

    public void ask(){
        System.out.println(getName()+" asks: \"May I know the question so that I can try for an answer?\"");
    }

    public void reply(){
        System.out.println(getName()+" replies: \"There are fifty thousand five hundred and eighty nine crows, my lord\"");
    }

    public void say(){
        System.out.println(getName()+" says: \"Make you men count, My lord. \n"+
                "If you find more crows it means some have come to visit their relatives here.\n"+
                "If you find less number of crows it means some have gone to visit their relatives elsewhere\"");
    }
}
