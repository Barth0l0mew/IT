package Zlatopolskiy;

import java.util.Map;
import java.util.Scanner;

public class Task5_37 {
    public static void main(String[] args) {
        int x=2;
        double sum=1.0;
        double sign = -1.0;
        for (int i=1; i<=10;i++)
        {
            double a= sign*(i+1)/(i+2)*Math.pow(x,i);
            sign*=-1;
            sum+=a;
        }
        System.out.printf("sum=%.2f",sum);
    }
}
