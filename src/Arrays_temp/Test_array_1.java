package Arrays_temp;

import java.sql.Array;
import java.util.Arrays;
import java.util.Random;

public class Test_array_1 {
    public static void main(String[] args) {
//fillArray(10);
        System.out.println(fillArray(10));
shaflArrays(10);
foundArrays(fillArray(10),fillArray(10));

        System.out.println(dellArrays(filRandom(10)).length);
    }
    static int[] filRandom (int size){
        int[] arr=new int[size];
        Random random = new Random();
        for (int i=0;i<arr.length;i++)
            arr[i]=random.nextInt(15);
        return arr;
    }
    static int[] fillArray (int size){
        /*
         Сгенерировать возрастающую последовательность.
         */
        System.out.println("Exercise -1 ");
        Random random =  new Random();
        int[] arr = new int[size];
        arr[0]=random.nextInt(5)+1;
        for (int i=1;i<arr.length;i++)
            arr[i]=arr[i-1]+random.nextInt(5)+1;
        System.out.println(Arrays.toString(arr));
        return arr;
    }
    static void shaflArrays (int size){
        /*
        Сгенерировать последовательность в интервале 1..9 и перемешать ее.
         */
        int[] arr= new int [size];
        System.out.println("Exercise - 2");
        for (int i=0;i<arr.length;i++)
            arr[i]=i+1;
        System.out.println("First - "+Arrays.toString(arr));
        Random random = new Random();
        for (int i=0; i<arr.length; i++)
            swap(arr,random.nextInt(size),random.nextInt(size));
        System.out.println("Second - "+Arrays.toString(arr));
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void foundArrays (int[] arr, int[] arr2){
        /*
        Найти общие элементы в двух целочисленных массивах.
         */
        System.out.println("Exercise - 3");
        System.out.println("Array1 - "+ Arrays.toString(arr));
        System.out.println("Array2 - "+ Arrays.toString(arr2));
        for (int elementA:arr){
            for (int elementB:arr2){
                if (elementA==elementB)
                    System.out.println("Found A to B = "+elementA);
            }
        }
    }
    static int[] dellArrays (int[] arr){
        /*
        Удалить повторяющиеся элементы из массива.
         */
        System.out.println("Exercise - 4");
        System.out.println(Arrays.toString(arr));
        int length = 1;
        for (int i=1; i<arr.length; i++){
            boolean isUnique = true;
            for (int j=0; j<i; j++)
                if (arr[i]==arr[j]) isUnique = false;
            if (isUnique) length++;
        }
        //Определить длину результирующего массива
        System.out.println(length);
        int[] res = new int[length];

        int index = 1;
        res[0] = arr[0];
        for (int i=1; i<arr.length; i++){
            boolean isUnique = true;
            for (int j=0; j<i; j++)
                if (arr[i]==arr[j]) isUnique = false;
            if (isUnique)
                res[index++] = arr[i];
        }
        System.out.println(Arrays.toString(res));

        return res;
    }

}
