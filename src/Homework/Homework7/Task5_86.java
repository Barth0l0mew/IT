package Homework.Homework7;

public class Task5_86 {
    /*
     Составить программу возведения натурального числа в квадрат, учитывая
следующую закономерность:
2
2
2
2
2
1 1
2 1 3
3 1 3 5
4 1 3 5 7
...
n n 1 3 5 7 9 ... 2 1
     */
    public static void main(String[] args) {
        int n=5;
        int sum=0;
        for (int i=0; i<n;i++){
            sum+=2*(i+1)-1;
        }
        System.out.printf("n^2=%d",sum);
    }
}
