package Arrays_temp.Jagged;

import java.util.Arrays;
import java.util.Random;

public class JaggedSort {
    /*
    отсортировать по количеству элементов подмассива
     */
    public static void main(String[] args) {
        int[][] arr;
        Random random = new Random();
        //Задаем случайное количество строк - 3..12
        int rows = random.nextInt(10)+3;
        arr= new int[rows][];
        for (int i=0;i<arr.length;i++) {
            int colm = random.nextInt(7)+1;
            arr[i] = new int[colm];
        }
        System.out.println(Arrays.deepToString(arr));
        print(arr);
    }
    static void print (int[][] arr) {
        for (int i=0; i<arr.length; i++)
            System.out.println(Arrays.toString(arr[i]));
    }
}
