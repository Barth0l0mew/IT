package Classwork;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Arrays_new {
    /*
    https://ru.wikipedia.org/wiki/%D0%9C%D0%BE%D0%BD%D0%BE%D1%82%D0%BE%D0%BD%D0%BD%D0%B0%D1%8F_%D0%BF%D0%BE%D1%81%D0%BB%D0%B5%D0%B4%D0%BE%D0%B2%D0%B0%D1%82%D0%B5%D0%BB%D1%8C%D0%BD%D0%BE%D1%81%D1%82%D1%8C#:~:text=%D0%BD%D0%B0%D0%B7%D1%8B%D0%B2%D0%B0%D0%B5%D1%82%D1%81%D1%8F%20%D0%BD%D0%B5%D0%B2%D0%BE%D0%B7%D1%80%D0%B0%D1%81%D1%82%D0%B0%D1%8E%D1%89%D0%B5%D0%B9%2C%20%D0%B5%D1%81%D0%BB%D0%B8%20%D0%BA%D0%B0%D0%B6%D0%B4%D1%8B%D0%B9%20%D1%81%D0%BB%D0%B5%D0%B4%D1%83%D1%8E%D1%89%D0%B8%D0%B9%20%D1%8D%D0%BB%D0%B5%D0%BC%D0%B5%D0%BD%D1%82%20%D1%8D%D1%82%D0%BE%D0%B9%20%D0%BF%D0%BE%D1%81%D0%BB%D0%B5%D0%B4%D0%BE%D0%B2%D0%B0%D1%82%D0%B5%D0%BB%D1%8C%D0%BD%D0%BE%D1%81%D1%82%D0%B8%20%D0%BD%D0%B5%20%D0%BF%D1%80%D0%B5%D0%B2%D0%BE%D1%81%D1%85%D0%BE%D0%B4%D0%B8%D1%82%20%D0%BF%D1%80%D0%B5%D0%B4%D1%8B%D0%B4%D1%83%D1%89%D0%B5%D0%B3%D0%BE.&text=%D0%BD%D0%B0%D0%B7%D1%8B%D0%B2%D0%B0%D0%B5%D1%82%D1%81%D1%8F%20%D0%B2%D0%BE%D0%B7%D1%80%D0%B0%D1%81%D1%82%D0%B0%D1%8E%D1%89%D0%B5%D0%B9%2C%20%D0%B5%D1%81%D0%BB%D0%B8%20%D0%BA%D0%B0%D0%B6%D0%B4%D1%8B%D0%B9%20%D1%81%D0%BB%D0%B5%D0%B4%D1%83%D1%8E%D1%89%D0%B8%D0%B9%20%D1%8D%D0%BB%D0%B5%D0%BC%D0%B5%D0%BD%D1%82%20%D1%8D%D1%82%D0%BE%D0%B9%20%D0%BF%D0%BE%D1%81%D0%BB%D0%B5%D0%B4%D0%BE%D0%B2%D0%B0%D1%82%D0%B5%D0%BB%D1%8C%D0%BD%D0%BE%D1%81%D1%82%D0%B8%20%D0%BF%D1%80%D0%B5%D0%B2%D1%8B%D1%88%D0%B0%D0%B5%D1%82%20%D0%BF%D1%80%D0%B5%D0%B4%D1%8B%D0%B4%D1%83%D1%89%D0%B8%D0%B9.&text=%D0%BD%D0%B0%D0%B7%D1%8B%D0%B2%D0%B0%D0%B5%D1%82%D1%81%D1%8F%20%D1%83%D0%B1%D1%8B%D0%B2%D0%B0%D1%8E%D1%89%D0%B5%D0%B9%2C%20%D0%B5%D1%81%D0%BB%D0%B8%20%D0%BA%D0%B0%D0%B6%D0%B4%D1%8B%D0%B9%20%D1%8D%D0%BB%D0%B5%D0%BC%D0%B5%D0%BD%D1%82%20%D1%8D%D1%82%D0%BE%D0%B9%20%D0%BF%D0%BE%D1%81%D0%BB%D0%B5%D0%B4%D0%BE%D0%B2%D0%B0%D1%82%D0%B5%D0%BB%D1%8C%D0%BD%D0%BE%D1%81%D1%82%D0%B8%20%D0%BF%D1%80%D0%B5%D0%B2%D1%8B%D1%88%D0%B0%D0%B5%D1%82%20%D1%81%D0%BB%D0%B5%D0%B4%D1%83%D1%8E%D1%89%D0%B8%D0%B9%20%D0%B7%D0%B0%20%D0%BD%D0%B8%D0%BC
    Дана последовательность целых чисел.
        1. Проверить, является ли она возрастающей
        2. Проверить, является ли она неубывающей.
        3. Найти максимальный из локальных минимумов.
        4. Проверить, является ли она арифметической прогрессией.
        5. Проверить, содержит ли массив два заданных числа.
     */
    public static void main(String[] args) {
        int[] arr = {-1, 1, 0, 3, 2, -4, -5, 6, 8, 9};
        Exercise_1(arr);
        Exercise_2(arr);
        int[] arr1 = {1,3,5,7,9};
        Exercise_4(arr1);
        Exercise_4(arr);
        int[] arr2={2,3,1,4,5,4};
        Exercise_3(arr2);
        Exercise_5(arr1,2,3);
    }
    static void Exercise_1 (int[] arr){
        boolean flag=true;
        System.out.println("Exercise - 1");
        System.out.println(Arrays.toString(arr));
        for (int i=0; i<arr.length-1;i++)
            if (arr[i]>=arr[i+1]) flag=false;
        System.out.println(flag);
    }
    static void Exercise_2 (int[] arr){
        boolean flag=true;
        System.out.println("Exercise - 2");
        System.out.println(Arrays.toString(arr));
        for (int i=0; i<arr.length-1;i++)
            if (arr[i]<=arr[i+1]) flag=false;
        System.out.println(flag);
    }
    static void Exercise_3 (int[] arr){
        int min=arr[0];
        System.out.println("Exercise - 3");
        System.out.println(Arrays.toString(arr));
        int max = arr[0];
        for (int elem:arr)
            if (max>elem) max = elem;

       //Является ли 1-я точка локальным минимумом
        if (arr[0]<arr[1] && arr[0]>max)
            max = arr[0];

        //Является ли последняя точка локальным минимумом
        int n = arr.length;
        if (arr[n-1]<arr[n-2] && arr[n-1]>max)
            max = arr[n-1];

        //Проверка остальных локальных минимумов
        for (int i = 1; i<n-1; i++)
            if (arr[i]<arr[i-1] && arr[i]<arr[i+1] && arr[i]>max)
                max = arr[i];
        System.out.println(max);
    }

    static void Exercise_4 (int[] arr){
        int temp=arr[1]-arr[0];
        boolean flag=true;
        System.out.println("Exercise - 4");
        System.out.println(Arrays.toString(arr));
        for (int i=1; i<arr.length-1;i++)
            if ((arr[i]+temp)!=arr[i+1]) flag=false;
        System.out.println(flag);
    }
    static void Exercise_5 (int[] arr, int a,int b){
        System.out.println("Exercise - 5");
        System.out.println(Arrays.toString(arr));
        boolean flagA=false,flagB=false;
        for (int i=0; i<arr.length;i++){
            if (arr[i]==a) flagA=true;
            if (arr[i]==b) flagB=true;
        }
        if (flagB && flagA)
            System.out.println("Good");
        else
            System.out.println("Bad");
    }
}
