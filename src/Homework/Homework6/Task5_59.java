package Homework.Homework6;

import java.util.Scanner;

public class Task5_59 {
    /*
    Известен возраст (в годах в виде 14,5 лет и т. п.) каждого ученика двух классов. Определить средний возраст учеников каждого класса. В каждом классе
учатся 20 человек
     */
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        double[][] people = new double[2][20];
        for (int i=0; i< people.length;i++){
            for (int j=0; j<people[i].length;j++){
                System.out.printf("Input %d class people year=",(i+1));
                people[i][j]= scan.nextDouble();
            }
        }

        for (int i=0;i<people.length;i++){
            double sum=0.0;
            for (int j=0; j<people[i].length;j++){
                System.out.print(people[i][j]+" ");
                sum+=people[i][j];
            }
            System.out.println(" ");
            System.out.printf("Output class %d average year=%.2f\n",(i+1),(sum/people[i].length));

        }
    }

}
