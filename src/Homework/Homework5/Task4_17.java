package Homework.Homework5;

public class Task4_17 {
    /*
     Известны площади круга и равностороннего треугольника. Определить:
а) уместится ли круг в треугольнике?
б) уместится ли треугольник в круге?

     */
    public static void main(String[] args) {
        double circleArea=10;
        double triangArea=19;
        double circleRadius = Math.sqrt(circleArea / Math.PI);
        double triangSide = Math.sqrt(4*triangArea/Math.sqrt(3)) ;
        double rOut=triangSide/Math.sqrt(3);
        double rIn=triangSide/(2*Math.sqrt(3));

        if (circleRadius<=rIn){
            System.out.println("круг умещается в треугольник.");
        } else {
            System.out.println("круг не умещается в треугольник.");
        }
        if (circleRadius >=rOut ) {
            System.out.println("Треугольник умещается в круг.");
        } else {
            System.out.println("Треугольник не умещается в круг.");
        }

    }
}
