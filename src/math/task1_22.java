package math;

public class task1_22 {
    public static void main(String[] args) {
        double x=1.2,a=2.3;
        double y= 7*Math.pow(x,2)-3*x+6;
        double z= (Math.pow(a,2)+10)/(Math.sqrt(Math.pow(a,2)+1));
        double h=1.8;
        double  r=6350000, l= Math.sqrt(Math.pow((r+h),2)-r*r);
        System.out.printf("y=%f  z=%f l=%f",y,z,l);
    }
}
