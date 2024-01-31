package Homework.Homework14;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Recursion {
     /*
Решите две из предложенных задач.
1. Дан массив целых чисел, в котором каждый элемент равен его индексу, например [0,1,2].
Вывести все перестановки его n элементов, в которых элементы a и b не соседствуют.

2. Дан массив целых чисел, в котором каждый элемент равен его индексу, например [0,1,2].
Вывести все перестановки его n элементов, в которых ни один элемент не находится на своем месте.

3. В кафе есть меню из двух видов блюд на первое, трех - на второе и двух - на третье.
Выведите все возможные сочетания заказов из двух или трех блюд. Названия блюд подберите.

4. В кошельке есть набор монет. Вывести перебором все возможные подмножества монет для оплаты заданной суммы.

5. В урне находится 4 карточки с числами от 1 до 4.
При выборе 3-х карточек карточку можно возвращать обратно в урну и выбирать снова.
Выведите все возможные комбинации такого выбора.

*/
     public static void main(String[] args) {
        int[] arr=fillArr(3);
        //swap(arr,2,4);
         System.out.println("Array basic - "+Arrays.toString(arr));
         permutation(arr,0);
         System.out.println("Exercise - 1"+Arrays.toString(arr));
         exercise_1(arr,0,1,2);
         System.out.println("Exercise - 2 "+Arrays.toString(arr));
         exercise_2(arr,0);
//         String[] menu1 = {"борщ","Щи"};
//         String[] menu2 = {"картошка","Рис","Овощи"};
//         String[] menu3 = {"чай","сок"};
//         System.out.println(Arrays.toString(menu1));
//         System.out.println(Arrays.toString(menu2));
//         System.out.println(Arrays.toString(menu3));
//         //exercise_3(new StringBuilder(),menu1,menu2,menu3,0,2);
         System.out.println("Exercise - 3");
         String[][] menu1 = {{"борщ","Щи"},{"картошка","Рис","Овощи"},{"чай","сок"}};
         exercise_3(new ArrayList<>(),menu1,0,2);
         System.out.println("__________________");
         String[] firstDishes = {"Суп", "Салат"};
         String[] secondDishes = {"Стейк", "Паста", "Рыба"};
         String[] thirdDishes = {"Десерт", "Фрукты"};

         List<List<String>> combinations = combineMenu(firstDishes, secondDishes, thirdDishes);

         for (List<String> combination : combinations) {
             System.out.println(combination);
         }

     }
     static int[] fillArr (int len){
         int[]arr = new int[len];
         for (int i=0;i<len;i++)
             arr[i]=i;
         return arr;
     }
     static void permutation (int[]arr, int i){
         if (i==arr.length-1)
             System.out.println(Arrays.toString(arr));
         else
             for (int j=i;j<arr.length;j++){
                 swap(arr,i,j);
                 permutation(arr,i+1);
                 swap(arr,j,i);
             }

     }
    static void exercise_1 (int[]arr, int i, int a, int b){
        if (i==arr.length-1&&Math.abs(arr[a]-arr[b])!=1)
            System.out.println(Arrays.toString(arr));
        else
            for (int j=i;j<arr.length;j++){
                swap(arr,i,j);
                exercise_1(arr,i+1,a,b);
                swap(arr,j,i);
            }

    }
    static void exercise_2 (int[]arr, int i){
        if (i==arr.length-1) {
            int count=0;
            for (int j=0;j<arr.length;j++)
                if (arr[j]!=j) {
                    count++;
                }
            if (count==arr.length)
            System.out.println(Arrays.toString(arr));
        }
        else
            for (int j=i;j<arr.length;j++){
                swap(arr,i,j);
                exercise_2(arr,i+1);
                swap(arr,j,i);
            }

    }
    //static void exercise_3 (StringBuilder sb,String[] arr1, String[] arr2, String[] arr3, int n, int r){
        static void exercise_3 (ArrayList<String> sb, String[][] arr1, int n, int r){

         if (sb.size()==r){

            System.out.println(sb);

           return;
        }
        for (int i=0; i<arr1.length; i++){
            for (int j=0;j<arr1[i].length;j++) {
                    int len=arr1[i][j].length();
                    if (sb.size()==0||!sb.get(sb.size()-1).equals(arr1[i][j])) {
                        sb.add(arr1[i][j]);
                        exercise_3(sb, arr1, n, r);
                        sb.remove(sb.size() - 1);
                    }
            }
        }
    }
    public static List<List<String>> combineMenu(String[] firstDishes, String[] secondDishes, String[] thirdDishes) {
        List<List<String>> combinations = new ArrayList<>();

        combineDishes(firstDishes, secondDishes, thirdDishes, 0, new ArrayList<>(), combinations);

        return combinations;
    }

    public static void combineDishes(String[] firstDishes, String[] secondDishes, String[] thirdDishes,
                                     int index, List<String> currentCombination, List<List<String>> combinations) {
        if (index == 3) {
            combinations.add(new ArrayList<>(currentCombination));
            return;
        }
        String[] currentDishes;
        if (index == 0) {
            currentDishes = firstDishes;
        } else if (index == 1) {
            currentDishes = secondDishes;
        } else {
            currentDishes = thirdDishes;
        }
        for (String dish : currentDishes) {
            currentCombination.add(dish);
            combineDishes(firstDishes, secondDishes, thirdDishes, index + 1, currentCombination, combinations);
            currentCombination.remove(currentCombination.size() - 1);
        }
    }

    static void swap (int[] arr,int i,int j){
         int temp=arr[i];
         arr[i]=arr[j];
         arr[j]=temp;
     }
}
