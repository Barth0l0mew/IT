package Classwork;

public class Row {
    public static void main(String[] args) {
        double a=2./3, sum=a;
        double eps=1e-1;
        int i=2;
        while (a>eps){
            a*=1.0*(2*i)/(2*i+1);
            sum+=a;
            i++;
        }
        System.out.printf("RESULT sum=%.2f i=%d\n",sum,i);
        a=2./3; sum=a;
        for (i=2;;i++){
            if (a<eps)
                break;
            a*=1.0*(2*i)/(2*i+1);
            sum+=a;
            System.out.printf("sum=%.2f a=%.2f i=%d\n",sum,a,i);
        }
        System.out.printf("RESULT sum=%.2f",sum);
    }
}
