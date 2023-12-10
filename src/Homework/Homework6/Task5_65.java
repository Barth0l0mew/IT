package Homework.Homework6;

import java.util.Arrays;
import java.util.Random;

public class Task5_65 {
    /*
     области 12 районов.
     Известны количество жителей каждого района (в тысячах человек)
     и плотность населения в нем (тыс. чел./км2).
     Определить общую площадь территории области
     */
    public static void main(String[] args) {
        Random random = new Random();
        double[][] country = new double[12][2];
        for (int i=0; i< country.length;i++){
            //people/area
            country[i][0]=random.nextDouble()*100;
            //count people
            country[i][1]=(random.nextInt(50)+1)*10000;
        }
        double average=0.0;
        for (double[] city : country){
            average+=city[1]/city[0];
        }
        System.out.printf("Country area %.2f\n",average);
        System.out.println(Arrays.deepToString(country));
    }
}
