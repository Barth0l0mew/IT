package OOP.SircleDemo;

public class CircleDemo {
    public static void main(String[] args) {
    //Вычислить длину окружности и площадь круга
        double r1 = 1;
        double r2 = 2;
        double r3 = 3;
        //императивный
        double l1 = 2*Math.PI*r1;
        double s1 = Math.PI*r1*r1;
        double l2 = 2*Math.PI*r2;
        double s2 = Math.PI*r2*r2;
        double l3 = 2*Math.PI*r3;
        double s3 = Math.PI*r3*r3;
        System.out.printf("Радиус: %.2f, длина окружности: %.2f, площадь круга: %.2f%n",r1,l1,s1);
        System.out.printf("Радиус: %.2f, длина окружности: %.2f, площадь круга: %.2f%n",r2,l2,s2);
        System.out.printf("Радиус: %.2f, длина окружности: %.2f, площадь круга: %.2f%n",r3,l3,s3);

        System.out.printf("Радиус: %.2f, длина окружности: %.2f, площадь круга: %.2f%n",r1,calcL(r1),calcS(r1));
        System.out.printf("Радиус: %.2f, длина окружности: %.2f, площадь круга: %.2f%n",r1,calcL(r2),calcS(r2));
        System.out.printf("Радиус: %.2f, длина окружности: %.2f, площадь круга: %.2f%n",r1,calcL(r3),calcL(r3));

        Circle circle1 = new Circle(r1);
        circle1.print();
        System.out.println(circle1);
        new Circle(r2).print();
        System.out.println(Circle.description);
        System.out.println(Circle.calcL(r1));
        System.out.println(Circle.calcL(r2));
    }
    //процедурный
    static double calcL (double r){
        return 2*Math.PI*r;
    }
    static double calcS (double r){
        return Math.PI*r*r;
    }

}
class Circle {
    private    double r;
    private  double l;
    private double s;
    public static final String description="This is circle";
    public Circle (double r){
        this.r=r;
        calcL(r);
        calcS(r);
    }
    public double getR (double r){
        return this.r;
    }
     public static double calcL ( double r){
        return 2*Math.PI*r;

    }
    public static double calcS ( double r){
         return Math.PI*r*r;
    }
    public double getL (){
        return l;
    }
    public  double getS (){
        return s;
    }
    public void print (){

        System.out.printf("Радиус: %.2f, длина окружности: %.2f, площадь круга: %.2f%n",r,l,s);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                ", l=" + l +
                ", s=" + s +
                '}';
    }
}
