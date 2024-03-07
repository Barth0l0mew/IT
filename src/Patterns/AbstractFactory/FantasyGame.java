package Patterns.AbstractFactory;

public class FantasyGame {
    public static void main(String[] args) {
        //Race - рассы: human, elf, ork
        // Personages: warrior, archer, mage
        //Barracks
        System.out.println("-------------Fantasy Game-----------");
        Barracks humanBaracks = new HumanBarracks();
        Warrior warrior1 = humanBaracks.createWarrior();
        Archer archer1 = humanBaracks.createArcher();
        Mage mage1 = humanBaracks.createmage();
        warrior1.attack();
        archer1.shoot();
        mage1.cast();
    }
}
abstract class Barracks{
    abstract  Warrior createWarrior ();
    abstract Archer createArcher ();
    abstract  Mage createmage ();
}
interface Warrior {
    void attack();
}
interface  Mage{
    void cast();

}
interface Archer {
    void shoot();
}
class HumanWarrior implements Warrior{

    @Override
    public void attack() {
        System.out.println("Human Warrior attack");
    }
}
class HumanMage implements Mage {
    @Override
    public void cast() {
        System.out.println("The human mage is casting a spell");
    }
}

class HumanArcher implements Archer {
    @Override
    public void shoot() {
        System.out.println("The human archer is shooting");
    }
}
class HumanBarracks extends Barracks{

    @Override
    Warrior createWarrior() {
        return new HumanWarrior();
    }

    @Override
    Archer createArcher() {
        return new HumanArcher();
    }

    @Override
    Mage createmage() {
        return new HumanMage();
    }
}

