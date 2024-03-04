package Patterns.OutBuider;

public class OutBuilder {
    /*
    Builder
    внешний строитель
    ThreeLittlePigs
     */
    public static void main(String[] args) {
    Builder nifnif = new NifNif();
    Builder nafnaf = new NafNaf();
    Builder nufnuf = new NufNuf();
    Director wolf = new Director();
        //wolf.setBuilder(nifnif);
        wolf.buildBase(nifnif);
        wolf.buildWalls(nafnaf);
        wolf.buildRoof(nufnuf);
    }
}
interface Builder {
    void buildBase();
    void buildWalls();
    void buildRoof();

}
class NifNif implements Builder{

    @Override
    public void buildBase() {
        System.out.println("I build the soil base - почва основание");
    }

    @Override
    public void buildWalls() {
        System.out.println("I build the clay walls - глиняная стена");
    }

    @Override
    public void buildRoof() {
        System.out.println("I build the straw roof - соломенная крыша");
    }
}
class NafNaf implements Builder{

    @Override
    public void buildBase() {
        System.out.println("I build the sand base - песок основание");
    }

    @Override
    public void buildWalls() {
        System.out.println("I build the sticks walls - бамбуковая стена");
    }

    @Override
    public void buildRoof() {
        System.out.println("I build the leaves roof - лиственная крыша");
    }
}
class  NufNuf implements Builder{

    @Override
    public void buildBase() {
        System.out.println("I build the concrete base - беттоное основание ");
    }

    @Override
    public void buildWalls() {
        System.out.println("I build the bricks walls - кирпичная стена");
    }

    @Override
    public void buildRoof() {
        System.out.println("I build the tile roof - крыша из черепицы");
    }
}
class Director{
    private Builder builder;
    public void setBuilder (Builder builder){
        this.builder = builder;
    }
    public void buildHouse(){
        builder.buildBase();
        builder.buildWalls();
        builder.buildRoof();
    }
    public void buildBase(Builder builder) {
        builder.buildBase();
    }

    public void buildWalls(Builder builder) {
        builder.buildWalls();
    }

    public void buildRoof(Builder builder) {
        builder.buildRoof();
    }

}

