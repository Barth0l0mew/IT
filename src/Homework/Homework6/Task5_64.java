package Homework.Homework6;

import java.util.Arrays;
import java.util.Random;

public class Task5_64 {
    /*
    В области 12 районов.
     Известны количество жителей (в тысячах человек) и площадь (в км2) каждого района.
Определить среднюю плотность населения по области в целом
     */
    public static void main(String[] args) {
        Random random = new Random();

        double[][] country = new double[12][2];
        for (int i=0; i< country.length;i++){
            //area city
            country[i][0]=random.nextDouble()*1000;
            //count people
            country[i][1]=(random.nextInt(50)+1)*1000;
        }
        double average=0.0;
        for (double[] city : country){
            average+=1.0*city[1]/city[0];
        }
        System.out.printf("Average people/area in country %.2f\n",(average/country.length));
        System.out.println(Arrays.deepToString(country));
    }


}