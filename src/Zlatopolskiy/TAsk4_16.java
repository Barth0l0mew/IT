package Zlatopolskiy;

public class TAsk4_16 {
    /*
    4.16. Известны площади круга и квадрата. Определить:
а) уместится ли круг в квадрате?
б) уместится ли квадрат в круге?
     */
    public static void main(String[] args) {
       double circleArea=10;
       double squareArea=19;
        double circleRadius = Math.sqrt(circleArea / Math.PI);
        double squareSide = Math.sqrt(squareArea);
        double diagonal = Math.sqrt(2)*Math.sqrt(squareArea);
        if (circleRadius==diagonal/2){
            System.out.println("квадрат умещается в круг."+circleRadius +" "+ squareSide/2);
        } else {
            System.out.println("квадрат не умещается в круг.");
        }
        if (circleRadius * 2 <= squareSide) {
            System.out.println("Круг умещается в квадрате."+circleRadius +" "+ squareSide/2);
        } else {
            System.out.println("Круг не умещается в квадрате.");
        }

    }
}
