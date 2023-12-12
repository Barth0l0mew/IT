package Homework.Homework7;

public class Task5_93 {
    public static void main(String[] args) {
        int n=5;

        System.out.printf("SQRT=%.2f",row(5,1));
    }
     static double row (int x,int i){

        if(x==i) {
            return Math.sqrt(3 * i);
        }else
         return Math.sqrt(3 * i+row(x,++i));
    }
}
