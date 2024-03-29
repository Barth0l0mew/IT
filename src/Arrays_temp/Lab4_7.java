package Arrays_temp;

import java.util.Arrays;

public class Lab4_7 {
    /*
    найти положительную подпоследовательность наибольшей длины.
    поместить результат в массив
     */
    public static void main(String[] args) {
        //Объявление и инициализация
        int[] arr = {-1, 1, 0, 3, 2,3,5, -4, -5, 6,7,8};
        int count = 0; //Количество положительных элементов в подпоследовательности
        //Найти все положительные числа
        //for (int elem:arr)
        //    if (elem>0) System.out.println(elem);

        int countMax = 0; //Длина подпоследовательности
        int index = 0; //Индекс, с которого началась подпоследовательность
        //Найдя положительное число, исследовать массив дальше
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0)
                count++;
            if (arr[i] <= 0 ) {
                if (count > countMax) {
                    countMax = count;
                    index = i-1;
                }
                count = 0;
            }
            if (i==(arr.length-1))
                if (count > countMax) {
                    countMax = count;
                    index = i;
                }
        }

         System.out.println(count);

        System.out.println(countMax);
        System.out.println(index);
        System.out.println(Arrays.toString(arr));
        for (int i=index-countMax+1;i<index+1;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}
