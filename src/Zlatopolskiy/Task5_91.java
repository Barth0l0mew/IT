package Zlatopolskiy;

import java.util.Scanner;

public class Task5_91 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Input n=");
        int n=scan.nextInt();
        int x=2;
        double sum=1.0;
        for (int i=1;i<=n;i++){
            int fac=1;
            for (int j=1;j<=i;j++) {
                fac *= j;

            }
            System.out.printf("i=%d fac=%d\n",i,fac);
            sum+=Math.pow(x,i)/fac;
        }
        System.out.println("Sum="+sum);
        System.out.println();
        System.out.println();
        sum=1.0;
        double a=1,b=1;

        for (int i=1;i<=n;i++){
            sum+=(b*=x)/(a*=i);
        }
        System.out.println("sum="+sum);

    }
}
