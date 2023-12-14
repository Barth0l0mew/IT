package Arrays_temp;

import java.util.Arrays;
import java.util.Random;

public class Arrays_1 {
    //Поля (переменные-члены класса)
    private static final int SIZE = 6;
    static int[] arr = new int[SIZE];

    //Методы
    public static void main(String[] args) {
        //demo();
        //fillOrder();
        //fillReverse();
        fillRandom();
        print();
        revers2();
        //swop(0,4);
        //revers();
        print();
        //System.out.println(sum());
       // System.out.println(min(false));
    }

    //создание и инициализация
    static void demo() {
        int[] arr0 = {3, 1, 2};
        arr0[0] = 4;
        System.out.println(arr0[2]);
        System.out.println(arr0.length);
        int[] arr1 = new int[4];

    }

    static void fillOrder() {
        for (int i = 0; i < SIZE; i++)
            arr[i] = i + 1;
    }

    static void print() {
        for (int i = 0; i < SIZE; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    static void fillReverse() {
        for (int i = 0; i < SIZE; i++)
            arr[i] = SIZE - i;
    }

    //Заполнить массив двузначными числами
    static void fillRandom() {
        Random random = new Random();
        for (int i = 0; i < SIZE; i++)
            arr[i] = random.nextInt(90)+10;
    }

    //Нахождение суммы
    static int sum() {
        int sum = 0;
        for (int i = 0; i < SIZE; i++)
            sum+=arr[i];
        return sum;
    }

    static int min(){
        int min = arr[0];
        for (int i = 0; i < SIZE; i++)
            if (min>arr[i]) min=arr[i];
        return min;
    }

    static int min(boolean b){
        int min = arr[0];
        for (int i = 0; i < SIZE; i++)
            if (min>arr[i]) min=arr[i];
       if (b)
        System.out.println(min);
        return min;
    }
    static void revers(){
        int temp=0;
        int[] arrTemp= new int[arr.length];
        for (int i=0;i<SIZE;i++){
            arrTemp[i]=arr[SIZE-1-i];
        }
        arr=arrTemp;
        for (int i=0;i<SIZE; i++){
            temp=new Integer(arr[i]);
            arr[i]=new Integer(arr[SIZE-1-i]);
            System.out.println(arr[i]+" "+arr[SIZE-i-1]);
            arr[SIZE-1-i]=temp;
        }

    }
    static void swop (int i, int j){
        int temp=arr[i];
        arr[i]= arr[j];
        arr[j]=temp;
    }
    static void revers2 (){
        for (int i=0;i<SIZE/2;i++)
            swop(i,SIZE-i-1);
    }


}
