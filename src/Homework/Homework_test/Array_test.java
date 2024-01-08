package Homework.Homework_test;

import java.util.Arrays;
import java.util.Random;

public class Array_test {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fillrandom(10)));
        foundSecondMax(fillrandom(10));
        foundNumber(fillrandom(10),24);
        //equalsTwoArray(fillrandom(10),fillrandom(10));
        int[] arr= {1,2,3,7,5,6};
        int[] arr2={2,4,3,1,6,5};
        equalsTwoArray(arr,arr2);
    }
    static int[] fillrandom (int size){
        int[] arr = new int[size];
        Random random = new Random();
        for (int i=0; i<size; i++)
            arr[i]=random.nextInt(50);
        return arr;
    }
    static void foundSecondMax(int[] arr){
        System.out.println("Exercise - 4 found second max ");
        System.out.println(Arrays.toString(arr));
        int max=arr[0];
        for (int element:arr)
            if (max<=element) max=element;
        System.out.println("max="+max);
        int max2;
        if (max==arr[0])
             max2=arr[1];
        else
             max2=arr[0];
        for (int element:arr) {
            if (element<max && max2 <= element )
                max2 = element;
        }
        System.out.println("Second index max number = "+max2);
    }
    static void foundNumber( int[] arr, int number){
        System.out.println("Exercise -5 Found number");
        System.out.println("Найти все пары элементов массива, чья сумма равна заданному числу.");
        System.out.println(Arrays.toString(arr));
        for (int i=0; i<arr.length;i++)
            for (int j=i+1;j<arr.length;j++) {
               // System.out.printf("Number1=%d + Number2=%d = %d sum=%d\n", arr[i], arr[j], number,(arr[i]+arr[j]));
                if ((arr[i] + arr[j]) == number )
                    System.out.printf("Number1=%d + Number2=%d = %d\n", arr[i], arr[j], number);
            }
    }
    static void equalsTwoArray (int[] arr, int[] arr2){
        System.out.println("Exercise - 6");
        System.out.println("Дано два массива, элементы которых неупорядочены. Сравнить эти два массива.");
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println("Equals array1 and array2 = "+Arrays.equals(arr,arr2));
        boolean flag=true;
        for (int i=0;i<arr.length;i++) {
            flag=true;
            for (int j = 0; j < arr.length; j++)
                if (arr[j] == arr2[i]) {
                    flag = false;

                }
            if (flag)
                System.out.println("Array1 add number="+arr2[i]);
        }
    }

}
