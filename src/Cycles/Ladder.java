package Cycles;

import java.util.Scanner;

public class Ladder {
    public static void main(String[] args) {
        Scanner sacn = new Scanner(System.in);
        for (int i=0; i<9;i++)
            System.out.println("floor"+(i++ +1));
           for (int i=0,j=0;i<9;i++){
                if (i==3) continue;
                if (i==4) break;
                System.out.println("floo"+i);
            i+=j;
            j++;

        }
        System.out.println(Math.sin(Math.toRadians(45)));


    }
}
