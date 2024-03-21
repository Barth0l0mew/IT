package OOP.StreamAPI.INTStream;

import org.checkerframework.checker.units.qual.A;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class INTStreams {
    public static void main(String[] args) {

        IntStream.range(1,100).forEach(i-> System.out.print(i+" "));
        System.out.println();
        int[] abc = IntStream.range(1,101)
                .toArray();
        System.out.println(Arrays.toString(abc));
        int sum = IntStream.range(1,101)
                .reduce(0,(a,b)->a+b);
        System.out.println("sum= "+sum);
        Random random = new Random();
        int[] randArr =IntStream.generate(()->random.nextInt(100))
                .limit(10)
                .toArray();
        System.out.println(Arrays.toString(randArr));
        int[] ii = new int[100];
        for (int i=0;i<100;i++)
            ii[i]=i+1;

        int[] s={0};
        Arrays.stream(ii).forEach(i->s[0]+=i);
        System.out.println("sum= "+s[0]);
        String str = Arrays.stream(randArr)
                .sorted()
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(","));
        System.out.println(str);
        String str2 = Arrays.stream(randArr)
                .sorted()
                .filter(el-> {
                    if (el%2==0)
                        return true;
                        else return false;
                })
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(","));
        System.out.println(str2);
        //number 1-1000 /3,5,11
        System.out.println("Output number 1-1000 /3 && 5  && 11");
        int[] numbers =IntStream.range(1,1001)
                .filter(i->i%3==0&&i%5==0&&i%11==0)
                .toArray();
        System.out.println(Arrays.toString(numbers));
        //вывести квадраты первых n натуральных чисел
        int n=10;
        IntStream.range(1,11)
                .map(i->i*2)
                .forEach(i-> System.out.print(i+" "));
        //Выести степени числа 2 первые 10
        System.out.println();
        System.out.println(" //Выести степени числа 2 первые 10");

        IntStream.range(1,11)
                .map(i->(int)Math.pow(2,i))
                .forEach(i-> System.out.print(i+" "));
        System.out.println();
        System.out.println(" //Выести степени числа 2 первые 10");
        IntStream.iterate(2,i->i*2)
                .limit(10)
                .forEach(i-> System.out.print(i+" "));
    }
}
