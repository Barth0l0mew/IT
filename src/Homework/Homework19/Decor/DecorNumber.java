package Homework.Homework19.Decor;
/*
Разработать приложение, генерирующее несколько последовательностей чисел
(по заранее заданному алгоритму, например,
последовательность чисел Фибоначчи, последовательность простых чисел,
последовательность факториалов целых неотрицательных чисел).
Генерирование типа последовательности и количество генерируемых элементов должно
определяться пользователем. Для каждой последовательности после генерации указать
время работы соответствующего алгоритма. Определение этого времени реализовать,
используя шаблон проектирования «Decorator».

 */

import javax.sound.midi.Soundbank;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DecorNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1-Natural numbers\n2-Fibonachi\n3-Factorial");
        System.out.print("Input function: ");
        switch (scan.nextInt()){
            case 1:
                System.out.print("Input number of item: ");
                GeneratorNumber naturalNumber = new Time(new NaturalNumber());
                System.out.println(naturalNumber.generator(scan.nextInt()));
                break;
            case 2:
                System.out.print("Input number of item: ");
                GeneratorNumber fibonachi = new Time(new Fibonachi());
                System.out.println(fibonachi.generator(scan.nextInt()));
                break;
            case 3:
                System.out.print("Input number of item: ");
                GeneratorNumber factorial = new Time(new Factorial());
                System.out.println(factorial.generator(scan.nextInt()));
                break;
            default:
                System.out.println("Not correct number\nExit");
        }
    }

}
interface GeneratorNumber {
    String generator (int index);
}
class NaturalNumber implements GeneratorNumber {
    private List<Integer> list = new ArrayList<Integer>();
    @Override
    public String generator(int index) {
        System.out.println("Generator natural numbers");
        for (int i=0; i<index;i++) {
            list.add(i+1);
        }
        return list.toString();
    }
}
class Fibonachi implements GeneratorNumber{
    private List<Integer> list = new ArrayList<Integer>();
    @Override
    public String generator(int index) {
        System.out.println("Generatotr Fibonachi");
        if (index==0)
            return "not number fibonachi";
        if (index==1) {
            list.add(index);
            return list.toString();
        }
        int sum = 1;
        int temp = 0;
        for (int i=0;i<index;i++){
            sum+=temp;
            temp+=sum;
            list.add(sum);
            list.add(temp);
        }
        return list.toString();
    }
}
class Factorial implements GeneratorNumber{
    private List<Long> list = new ArrayList<Long>();
    @Override
    public String generator(int index) {
        System.out.println("Generator factorial numbers");
        if (index==0) return "not number factorial";
        for (int i=0; i<index;i++){
            long count=1;
            for (int j=1;j<=i+1;j++){
                count*=j;
            }
            list.add(count);
        }
        return list.toString();
    }
}
abstract class TimeDecorartor implements GeneratorNumber {
    GeneratorNumber sourse;
    public TimeDecorartor (GeneratorNumber sourse){

        this.sourse= sourse;
    }
}
class Time extends TimeDecorartor {

    public Time(GeneratorNumber sourse) {
        super(sourse);
    }

    @Override
    public String generator(int index) {
        return addTime(sourse,index);
    }
    private String addTime (GeneratorNumber test,int index){
        Instant start = Instant.now();
        long start2 = System.nanoTime();
        String list = sourse.generator(index);
        Instant finish = Instant.now();
        long finish2 = System.nanoTime();
        return String.format("%s \nInstant Time : %d ms\nSystem.nanoTime: %.3f ms"
                ,list
                ,Duration.between(start,finish).toMillis()
                ,(1.*(finish2-start2)/1000000));
    }
}
