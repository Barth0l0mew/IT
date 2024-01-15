package Arrays_temp.Arrays2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Arrays2D {
    static  int[][] arr;
    static int[][] arr2;
    static int rows=7;// строки
    static int cols=5; //столбцы
    public static void main(String[] args) {
        arr=new int[rows][cols];
        fill(arr);
        for (int[] a:arr)
            System.out.println(Arrays.toString(a));
        System.out.println(Arrays.deepToString(arr));
        arr2=new int[rows][cols];
        fillSnake(arr2);
        for (int[] a:arr2)
            System.out.println(Arrays.toString(a));
        System.out.println(Arrays.deepToString(arr2));
        System.out.println(Arrays.deepToString(arr2));
        run(arr2);
        run2(arr2);
    }
    static void fill (int[][] arr){
        Random random = new Random();
        for (int i=0; i<arr.length;i++)
            for (int j=0;j<arr[i].length;j++)
                arr[i][j]=random.nextInt(10);
    }
    static void fillUp (int[][] arr){
        int temp=0;
        for(int i=0; i<arr.length;i++)
            for(int j=0;j<arr[i].length;j++) {
                arr[i][j] = (j+1)+i*arr[i].length;
            }
    }
    static void fillOrdderUpToDown (int[][] arr){
        int temp=0;
        for(int i=0; i<arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (i + 1) + j * arr.length;
            }
        }
    }
    static void fillSnake (int[][] arr){
        for(int i=0; i<arr.length;i++) {
            for(int j=0;j<arr[i].length;j++) {
                if (i%2==0)
                arr[i][j] = (j+1)+i*arr[i].length;
                else
                    arr[i][j]=i*arr[i].length+arr[i].length-j;
            }
        }
    }
    static void run (int[][] arr){
        int i=0, j=0;
        while (i<=arr.length || j<=arr[i].length){

            i++; j++;
            if (i<arr.length && j<arr[i].length)
            System.out.println(arr[i][j]);
            else break;
            i++;
            if (i<arr.length && j<arr[i].length)
            System.out.println(arr[i][j]);
            else break;
        }
    }
    static void run2 (int[][] arr){
        int i=0, j=0;
        while (i<=arr.length || j<=arr[i].length){
            if (i<arr.length && j<arr[i].length) {
                System.out.println(arr[i][j]);
                i++;
            }
            else break;

            if (i<arr.length && j<arr[i].length) {
                System.out.println(arr[i][j]);
                i--;j++;
            }
            else break;
        }
    }

}
