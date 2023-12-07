package Cycles;

import java.util.Random;
import java.util.stream.IntStream;

public class Randomize {
    public static void main(String[] args) {
        Random random = new Random();
//    IntStream ds=random.ints(18,3,20);
//    for (IntStream str: ds)
//        System.out.println(str);
        for (int i=1; i<9; i++){
            double r = Math.random();
            System.out.print(random.nextInt(18)+3);
            System.out.print("  "+random.ints(18,3,20));

            System.out.print("   "+(int)(r*10)+"\n");
            //System.out.printf("        %f",r);
        }

    }
}
