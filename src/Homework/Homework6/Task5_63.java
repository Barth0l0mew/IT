package Homework.Homework6;

import java.util.Random;

public class Task5_63 {
    public static void main(String[] args) {
        /*
         В области 10 районов. Заданы площади, засеваемые пшеницей (в гектарах),
и средняя урожайность (в центнерах с гектара) в каждом районе. Определить
количество пшеницы, собранное в области, и среднюю урожайность по области.
         */
        Random random = new Random();
        int[][] obl = new int[10][2];
        for (int i=0; i<obl.length;i++){
            for (int j=0;j<obl[i].length;j++){
                obl[i][j]=random.nextInt(100);
            }
        }
        int sum=0;
        double aver = 0.0;
        for (int i=0; i< obl.length;i++){
            sum +=obl[i][0]*obl[i][1];
            aver+=obl[i][1];
        }
        System.out.printf("Sum =%d average harvest=%.2f",sum,(aver/obl.length));
    }
}
