package Zlatopolskiy;

import java.util.Arrays;
import java.util.Stack;

public class Task11_8 {
    /*
Заполнить массив:
а) десятью первыми членами арифметической прогрессии с известным первым членом прогрессии а и ее разностью р;
б) двадцатью первыми членами геометрической прогрессии с известным
первым членом прогрессии а и ее знаменателем z;
в) двенадцатью первыми членами последовательности Фибоначчи (последовательности, в которой первые два члена равны 1, а каждый следующий
равен сумме двух предыдущих).

     */
    public static void main(String[] args) {

    print(fillOlderA(2,4,10));
    print(fillGeometric(2,4,20));
    }
    static int[] fillOlderA(int a, int p, int size){
        int[] arr = new int[size];
        for (int i=0;i<size;i++) {
           arr[i] = a+i*p;
            //arr[i]=a+=p;
            //a+=p;
        }
    return arr;
    }
    static void print (int[] arr){
        System.out.println(Arrays.toString(arr));
    }
    static int[] fillGeometric (int a, int p, int size){
        int[] arr = new int[size];
        for (int i=0;i<size;i++) {
           // arr[i] = a*i*p;
            arr[i]=a;
            a*=p;
        }
        return arr;
    }

}
