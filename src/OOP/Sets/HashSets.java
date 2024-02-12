package OOP.Sets;

import java.util.*;

//Пользователь вводит натуральные числа, пока не введет ноль.
//Программа выводит массив неповторяющихся чисел, введенных пользователем
public class HashSets {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        //
        Scanner scanner = new Scanner(System.in);
        int number = -1;
        while (number!=0){
            System.out.println("Enter a number: ");
            number = scanner.nextInt();
            hashSet.add(number);
        }
        System.out.println(Arrays.toString(hashSet.toArray()));
        hashSet.forEach(System.out::println);
        System.out.println("-------iterator-------------");
        Iterator value = hashSet.iterator();
        while (value.hasNext())
            System.out.println(value.next());
    }
}
