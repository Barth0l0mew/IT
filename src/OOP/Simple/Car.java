package OOP.Simple;

public class Car {
    private Color color;
    public Car (Color color){
        this.color=color;
    }

    public Color getColor() {
        return this.color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color=" + color +
                '}';
    }
}
