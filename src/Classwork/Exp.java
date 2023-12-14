package Classwork;

public class Exp {
    public static void main(String[] args) {

        int n = 10; //Найти 5! = 1*2*3*4*5
        double sum = 1;
        double a = 1.;
        double eps = 1e-5;
        int i=0;
        while (a>eps){
            System.out.println(1./a);
            a/=i+1;
            sum+=a;
            i++;
        }
        System.out.println(sum);
        System.out.println(Math.exp(1));
//        for (int i=0; i<n-1; i++){
//            a*=(i+1);
//            sum+=1./a;
//        }
//        System.out.println(sum);


        /*
        int fact = 1;
        for (int i = 1; i <=n ; i++)
            fact*=i;
        System.out.println(fact);
*/
    }
}
