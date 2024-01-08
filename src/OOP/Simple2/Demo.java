package OOP.Simple2;

public class Demo {
    public static void main(String[] args) {
        Pen pen = new Pen(Color.GRAY);
        System.out.println(pen.getColor());
        System.out.println(pen.toString());
    }
}
enum Color{ //enumeration
    BLACK, RED, GREEN, BLUE, YELLOW, WHITE, GRAY;
}

class Pen {
    // int color; //0 - черный, 1 - красный
    private Color color; //Класс (перечисление), объект
    //private (в пределах класса),
    // protected (в пределах этого и дочерних классов),
    // (default) (в пределах файла)
    //public (в пределах пакета)

    //Конструктор
    Pen(Color color){
        this.color = color;
    }

    public Color getColor() {
        return this.color;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "color=" + this.color +
                '}';
    }
}