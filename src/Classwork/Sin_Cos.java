package Classwork;

public class Sin_Cos {
    public static void main(String[] args) {
        double x=Math.PI/6;
        double eps=1e-5;
        double sum=x;
        int i=0;
        double a=x;
        double b=1.0;
        while (Math.abs(a)>eps){
            a*=-x*x/(i+2)/(i+3);
            sum+=a;
            i+=2;
        }
        System.out.println(sum);
        System.out.println(Math.sin(x));
    }
}
