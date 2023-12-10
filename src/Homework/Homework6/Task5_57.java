package Homework.Homework6;

import java.util.Scanner;

public class Task5_57 {
    /*
    Известны оценки двух учеников по четырем предметам. Определить сумму
оценок каждого ученика.
     */
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int[][] people = new int [2][4];
        for (int i=0; i< people.length;i++){
            for (int j=0; j<people[i].length;j++){
                System.out.printf("Input %d people mark=",(i+1));
                people[i][j]= scan.nextInt();
            }
        }

        for (int i=0;i<people.length;i++){
        int sum=0;
            for (int j=0; j<people[i].length;j++){
                System.out.print(people[i][j]+" ");
                sum+=people[i][j];
            }
            System.out.println(" ");
            System.out.printf("Output people %d sum mark=%d\n",(i+1),sum);

        }
    }
}
