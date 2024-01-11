package OOP.Del;

import java.util.Arrays;

public class Sample6 {
    public static void main(String[] args) {
        //Поместить в массив все простые делители числа.
        int number=12;
        System.out.println(Arrays.toString(array(count(number),number)));
    }
    static int[] array (int count, int num){
        int[] arr = new int[count];
        int index=0;
        for (int i=1; i<=num;i++){
            if (prime(i) && num%i==0)
            {
                arr[index]=i;
                index++;
            }
        }
        return arr;
    }
    static int count (int num){
        int count=0;
        for (int i=1; i<=num;i++){
            if (prime(i) && num%i==0)
                count++;
        }
        return count;
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
}

