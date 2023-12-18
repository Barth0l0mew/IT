package Arrays_temp;

import java.util.Arrays;
import java.util.Random;

public class Array_26 {
    public static void main(String[] args) {
        /*
         Дан целочисленный массив размера N. Проверить, чередуются ли в
нем четные и нечетные числа. Если чередуются, то вывести 0, если нет,
то вывести порядковый номер первого элемента, нарушающего закономерность.

         */
        int[] test = {3,2,1,2,7,6};
        System.out.println(Arrays.toString(fillRandom(10)));
        foundEven(test);
        foundEven(fillRandom(5));
    }
    static int[] fillRandom (int size){
        Random random =new Random();
        int[] arr = new int[size];
        for (int i=0;i<size;i++)
            arr[i]=random.nextInt(50);
        return arr;
    }
    static void foundEven( int[] arr){
        boolean prev=arr[0]%2==0?true:false;
        boolean even=false;
        int key=0;
        System.out.println(Arrays.toString(arr));
        for (int i=1;i<arr.length;i++){
            even=arr[i]%2==0?true:false;
            if (prev==even) {
                key = i+1;
            break;
            }
             prev=even;
        }
        System.out.println(key);
    }
}
