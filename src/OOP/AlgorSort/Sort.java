package OOP.AlgorSort;

import java.util.Arrays;
import java.util.Random;

public class Sort {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];
        for (int i=0; i<arr.length; i++)
            arr[i]=random.nextInt(10);
        int[] arr2= Arrays.copyOf(arr,10);
        int[] arr3= Arrays.copyOf(arr,10);
        int[] arr4= Arrays.copyOf(arr,10);
        System.out.println(Arrays.toString(arr));
        System.out.println("Пузырьковая сортировка");
        System.out.println(Arrays.toString(sort(arr)));
        System.out.println("глупая сортировка");
        System.out.println(Arrays.toString(dummySort(arr2)));
        System.out.println("шейкерная сортировка");
        System.out.println(Arrays.toString(shakerSort(arr3)));
        System.out.println("сортировка гномов");
        System.out.println(Arrays.toString(arr4));
    }
    static int[] sort (int[] arr){
        int temp;
        for (int j=0; j<arr.length;j++)
        for (int i=0; i<arr.length-1-j;i++)

            if (arr[i]>arr[i+1]) {
                temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                System.out.println(i+" "+Arrays.toString(arr));
            }
        return arr;
    }
    /*
    Глупая сортировка. Когда встречается пара неотсортированных элементов, меняем их местами
    и возвращаемся к началу
     */
    public static int[] dummySort(int[] arr) {
        int i=0;
        int size=arr.length;
        while (i<size-1)
            if (arr[i] > arr[i + 1]) {
                //printColor(i, i + 1);
                swap(arr, i, i + 1);
                System.out.println(i+" "+Arrays.toString(arr));
                i=0;
            }
            else i++;
            return arr;
    }
    static void swap(int[] arr, int i, int j){ //ссылочный тип
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    /*Shaker sort
Начало как в пузырьковой сортировке - максимальный элемент перемещается вправо.
Затем происходит разворот и минимальный элемент смещается в начало.
 */
    public static int[] shakerSort(int[] arr) {
        int size=arr.length;
        int left = 0, right = size-1;
        do {
            for (int i=left; i < right; i++)
                if (arr[i] > arr[i + 1]) {

                    swap(arr, i, i + 1);
                    System.out.println(i+" "+ Arrays.toString(arr));
                }
            right--;
            for (int i=right; i >= left; i--)
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                    System.out.println(i+" "+ Arrays.toString(arr));
                }
            left++;
        } while (left<right);
        return arr;
    }
    //сортировка номов
    public static int[] gnomeSort(int[] arr) {
        int size=arr.length;
        for (int i = 1; i < size; i++) {
            for (int j = i; j > 0 && arr[j] < arr[j - 1]; j--)
                swap(arr, j, j - 1);
        }
        return arr;
    }


}
