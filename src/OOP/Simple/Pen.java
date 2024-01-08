package OOP.Simple;

public class Pen {
    private Color color; //Класс (перечисление), объект этого класса
    /*
    private - в приделах классах
    protected  -в приделах этого и дочерних класов
    default -в приделах файла
    public - в приделах пакетах
     */
    {//блок кода для примера
        System.out.println("1");
    }
    public Pen(Color color){
        //Конструктор класса вызывается один раз при созданиия объекта
        this.color=color;
        System.out.println("2");
    }
    public Color getColor() {
        return this.color;
    }
    public void setColor(Color color){
        this.color=color;
    }
    @Override
    public String toString() {
        return "Pen{" +
                "color=" + this.color +
                '}';
    }
}
