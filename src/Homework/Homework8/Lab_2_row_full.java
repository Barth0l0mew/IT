package Homework.Homework8;

import java.util.Scanner;

public class Lab_2_row_full {
    static final double EXP=1e-5;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x=1;
        double total=0.0;
        while (x>=1){
            System.out.print("Input x<1 x=");
            x=scan.nextDouble();
        }
        System.out.printf("Exercise -1 sum=%.5f\n",Exercise_1(x));
         total = 3*Math.pow(1+x,1./3)-3;
        System.out.printf("Total = %f\n",total);
        System.out.printf("Exercise -2 sum=%.5f\n",Exercise_2(x));
         total = Math.sin(x)-Math.cos(x)+1;
        System.out.printf("Total = %f\n",total);
        System.out.printf("Exercise -3 sum=%.5f\n",Exercise_3(x));
         total = 1-1./Math.pow(1+x,1./4);
        System.out.printf("Total = %f\n",total);
        System.out.printf("Exercise -4 sum=%.5f\n",Exercise_4(x));
        total = (1-Math.cos(x)-x*Math.sin(x))/(x*x)+0.5;
        System.out.printf("Total = %f\n",total);
        System.out.printf("Exercise -5 sum=%.5f\n",Exercise_5(x));
        total = 1-1./Math.pow(1+x,1./3);
        System.out.printf("Total = %f\n",total);
        System.out.printf("Exercise -6 sum=%.5f\n",Exercise_6(x));
        total = Math.cos(x)/x/x+1./2;
        System.out.printf("Total = %f\n",total);
        System.out.printf("Exercise -7 sum=%.5f\n",Exercise_7(x));
        total = 1./Math.sqrt(Math.pow(1+x,3));
        System.out.printf("Total = %f\n",total);
        System.out.printf("Exercise -8 sum=%.5f\n",Exercise_8(x));
        total = 2*Math.sin(x)*Math.sin(x);
        System.out.printf("Total = %f\n",total);
        System.out.printf("Exercise -9 sum=%.5f\n",Exercise_9(x));
        total = 1-1./Math.sqrt(1+x);
        System.out.printf("Total = %f\n",total);
        System.out.printf("Exercise -10 sum=%.5f\n",Exercise_10(x));
        total = (x-Math.sin(x))/x/x;
        System.out.printf("Total = %f\n",total);
        System.out.printf("Exercise -11 sum=%.5f\n",Exercise_11(x));
        total = 1./Math.sqrt(Math.pow(1+x,5));
        System.out.printf("Total = %f\n",total);
        System.out.printf("Exercise -12 sum=%.5f\n",Exercise_12(x));
        total = x*Math.exp(-x)-Math.exp(-x)+1;
        System.out.printf("Total = %f\n",total);
    }
    static double Exercise_1 (double x){
        double a=x,sum=x;
        int i=2;
        while (Math.abs(a)>EXP){
            a*=-x*(3*i-4)/(3*i);
            sum+=a;

            //System.out.printf("%d %.7f %.5f\n",i,a,sum);
            i++;
        }
        return sum;
    }
    static double Exercise_2 (double x){
        double a=1.*x/2;
        int i=2;
        double sum=a*(2+x);
        while (Math.abs(a)>EXP){
            a*=-x*x/(2*i*(2*i-1));
            sum+=a*(2*i+x);
          //  System.out.printf("%d %.7f %.5f\n",i,a,sum);
            i++;
        }
        return sum;
    }
    static double Exercise_3(double x){
        double a=1./4*x;
        double sum=a;
        int i=2;
        while (Math.abs(a)>EXP){
            a*=-x*(4*i-3)/(4*i);
            sum+=a;
            //System.out.printf("%d %.7f %.5f\n",i,a,sum);
            i++;
        }
        return sum;
    }
    static double Exercise_4(double x){
        double a=3.*x*x/24;
        double sum=a;
        int i=2;
        while (Math.abs(a)>EXP){
            a*=-x*x/(2*i+2)/(2*i+1);
            sum+=a*(2*i+1);
            //System.out.printf("%d %.7f %.5f\n",i,a,sum);
            i++;
        }
        return sum;
    }
    static double Exercise_5 (double x){
        double a=1./3*x;
        double sum=a;
        int i=2;
        while (Math.abs(a)>EXP){
            a*=-x*(3*i-2)/(3*i);
            sum+=a;
            //System.out.printf("%d %.7f %.5f\n",i,a,sum);
            i++;
        }
        return sum;
    }
    static double Exercise_6 (double x){
        double a=-1./2;
        double sum=1./x/x;
        int i=1;
        while (Math.abs(a)>EXP){
            a*=-x*x/(2*i+2)/(2*i+1);
            sum+=a;
            //System.out.printf("%d %.7f %.5f\n",i,a,sum);
            i++;
        }
        return sum;
    }
    static double Exercise_7(double x){
        double a=1;
        double sum=1;
        int i=1;
        while (Math.abs(a)>EXP){
            a*=-x*(2*i+1)/(2*i);
            sum+=a;
           // System.out.printf("%d %.7f %.5f\n",i,a,sum);
            i++;
        }
        return sum;
    }
    static double Exercise_8(double x){
        double a=2*x*2*x/2;
        double sum=a;
        int i=2;
        while (Math.abs(a)>EXP){
            a*=-2*x*2*x/(2*i)/(2*i-1);
            sum+=a;
            // System.out.printf("%d %.7f %.5f\n",i,a,sum);
            i++;
        }
        return sum;
    }
    static double Exercise_9(double x){
        double a=1./2*x;
        double sum=a;
        int i=2;
        while (Math.abs(a)>EXP){
            a*=-x*(2*i-1)/(2*i);
            sum+=a;
            // System.out.printf("%d %.7f %.5f\n",i,a,sum);
            i++;
        }
        return sum;
    }
    static double Exercise_10 (double x){
        double a=x/6;
        double sum=a;
        int i=2;
        while (Math.abs(a)>EXP){
            a*=-x*x/(2*i)/(2*i+1);
            sum+=a;
            // System.out.printf("%d %.7f %.5f\n",i,a,sum);
            i++;
        }
        return sum;
    }
    static double Exercise_11(double x){
        double a=1;
        double sum=a;
        int i=1;
        while (Math.abs(a)>EXP){
            a*=-x*(2*i+3)/(2*i);
            sum+=a;
            // System.out.printf("%d %.7f %.5f\n",i,a,sum);
            i++;
        }
        return sum;
    }
    static double Exercise_12(double x){
        double a=x;
        double sum=2*a;
        int i=2;
        while (Math.abs(a)>EXP){
            a*=-x/(i);
            sum+=(i+1)*a;
            // System.out.printf("%d %.7f %.5f\n",i,a,sum);
            i++;
        }
        return sum;
    }


}
