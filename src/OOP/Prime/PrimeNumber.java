package OOP.Prime;

import java.util.ArrayList;
import java.util.Arrays;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(324/100);
        ArrayList <Integer> array = new ArrayList<Integer>();
        int count=0;
        int[] arrayInt;
        for (int i=100;i<=999;i++){
        if (prime(i)&& i/100==i%100) {
            array.add(i);
            count++;
        }
    }
        int esp =0;
        arrayInt= new int[count];
        for(int j=0;j<count;j++)
        {
            for (int i = 100; i <= 999; i++)
                if (prime(i)&& i/100==i%100) {
                    arrayInt[j] = i;
                    break;
                }
        }
        int count2=0;
        for (int i=100;i<=999;i++) {
            if (prime(i)) {
                array.add(i);
                count2++;
            }
        }
        int[] arr = new int[count2];
        int elem=0;
        for (int i = 100; i <= 999; i++)
            if (prime(i)) {
                arr[elem] = i;
                elem++;
            }
        System.out.println("elem"+Arrays.toString(arr));
        for (int el:array)
            System.out.println(el);
        System.out.println(Arrays.toString(arrayInt));
    }
    static boolean prime (int num){
      if (num<2)
          return false;
       double s= Math.sqrt(num);
        for (int i=2; i<=s;i++)
            if (num%i==0)
                return false;
        return true;
    }
    static boolean poly (int num){
        if (num%10==num/100)
        return true;
        else return false;
    }

}
