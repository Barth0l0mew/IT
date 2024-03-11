package Patterns.Flyweight;


import java.util.HashMap;
import java.util.Map;

public class Flyweight {
    /*
Flyweight, легковес, приспособленец
Плодовые тела грибов соединены друг с другом грибницей.
 Грибы являются самыми большими организмами
 */
    public static void main(String[] args) {
    Miceliun miceliun = new Miceliun();
        System.out.println(miceliun.getMusroom(MushroomType.Chanterella,1,1).toDetailString());
        System.out.println(miceliun.getMusroom(MushroomType.Honey,2,2).toDetailString());
        System.out.println(miceliun.getMusroom(MushroomType.Chanterella,3,3).toDetailString());

    }

}
//Белый, сыроежка, лисичка, опенок
enum MushroomType {PennyBun, Russula, Chanterella, Honey};

class Mushroom {
    private MushroomType type;
    private int x;
    private int y;

    public Mushroom(MushroomType type) {
        this.type = type;
    }

    public MushroomType getType() {
        return type;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String toDetailString() {
        return this+" "+this.type.toString()+" "+x+" "+y;
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Miceliun{
    Map<MushroomType, Mushroom> mushroomMap = new HashMap<>();
    public Mushroom getMusroom (MushroomType mushroomType,int x, int y){
        Mushroom mushroom = mushroomMap.get(mushroomType);
        if (mushroom==null){
            mushroom = new Mushroom(mushroomType);
            mushroomMap.put(mushroomType,mushroom);
        }
        mushroom.setPosition(x,y);
        return mushroom;
    }
}
