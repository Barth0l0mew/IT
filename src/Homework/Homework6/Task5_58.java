package Homework.Homework6;

import java.util.Scanner;

public class Task5_58 {
    /*
    Известны результаты двух спортсменов-пятиборцев в каждом из пяти видов
спорта в баллах. Определить сумму баллов, полученных каждым спортсменом.

     */
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int[][] people = new int [2][5];
        for (int i=0; i< people.length;i++){
            for (int j=0; j<people[i].length;j++){
                System.out.printf("Input %d atletic mark=",(i+1));
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
            System.out.printf("Output atletic %d sum mark=%d\n",(i+1),sum);

        }
    }


}
