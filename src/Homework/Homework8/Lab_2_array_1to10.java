package Homework.Homework8;

import javax.swing.plaf.IconUIResource;
import java.util.Arrays;
import java.util.Random;

public class Lab_2_array_1to10 {

    public static void main(String[] args) {
        Exercise_1(fillUp(10));
        Exercise_1(fillRandom(10));
        Exercise_2(fillR(10));
        Exercise_3(fillR(10));
        Exercise_4(fillRandom(10));
        Exercise_5(fillRandom(10));
        int[] ex6_arr={0,2,4,6,3,-1,1};
        int[] ex6_in={4,6,3};
        System.out.println("result="+Exercise_6(ex6_arr,ex6_in));
        int[] test = {-2,1,2,-2,1,2,3,-3,1,2,3,4};
        Exercise_7(test);
        Exercise_7(fillRInt(10));
        Exercise_8(fillRInt(10));
        int[] test2={1,1,2,2,2,3,4,5,7};
        Exercise_8(test2);
        Exercise_9(fillRInt(10));
        Exercise_10(fillRandom(10),25);
        int[] test3={2,7,3,11,3,7,2};
        Exercise_11(test3);
        int[] test4={2,7,3,11,11,3,7,2};
        Exercise_11(test4);
        int[] test5={2,7,4,11,3,7,2};
        Exercise_11(test5);
        int[] test6={2,7,4,11,11,3,7,2};
        Exercise_11(test6);

    }
    static int[] fillUp (int size){
        int[] arr = new int[size];
        for (int i=0 ; i<size ; i++ ){
            arr[i]=i;
        }

        return  arr;
    }
    static int[] fillRandom (int size){
        /*
        массив от 0 до 50
         */
        int[] arr = new int[size];
        Random random = new Random();
        for (int i=0; i<size;i++)
            arr[i]=random.nextInt(50);
        return arr;
    }
    static double[] fillR (int size){
        /*
        массив действительных чисел от -100 до 100
         */
        double[] arr = new double[size];
        for (int i=0; i<size;i++){
            arr[i]=Math.random()*100;
            //выделения числа с 2 знаками после запятой
            arr[i]=1.*Math.round(arr[i]*100)/100;
            //знак минус в числах
            if (Math.random()*10>5) arr[i]*=-1;
        }
        return arr;
    }
    static  int[] fillRInt (int size){
        int[] arr = new int[size];
        for (int i=0; i<size;i++){
            arr[i]=(int) (Math.random()*100);

            //знак минус в числах
            if (Math.random()*10>5) arr[i]*=-1;
        }
        return arr;
    }
    static void Exercise_1 (int[] arr){
        /*
        Возрастающий массив
         */
        System.out.println("Exercise - 1");
        System.out.println(Arrays.toString(arr));
        int temp=arr[0];
        int count=0;
        for (int i=1; i<arr.length;i++){
            if (temp<=arr[i]) {
                temp = arr[i];
                count++;
            }
            else {
                System.out.println("Array random");
                break;
            }
            if (count==(arr.length-1))
                System.out.println("Array Up");
        }

    }
    static void Exercise_2(double[]arr){
        /*
        средне арифметическое положительных и отрицательных чисел
         */
        int countPl=0, countMin=0;
        double sumPl=0, sumMin=0;
        System.out.println("Exercise - 2");
        System.out.println(Arrays.toString(arr));
        for (double element :arr){
            if (element>0){
                sumPl+=element;
                countPl++;
            }else {
                sumMin+=element;
                countMin++;
            }

        }
        System.out.printf("Arifmetic plus = %.2f Arifmetic minus = %.2f\n",(sumPl/countPl),(sumMin/countMin));
    }
    static void Exercise_3 (double[] arr){
        /*
        произведение сумм чисел с индексом четных на сумму чисел с индексом не четных
         */
        double sumEven=0, sumOdd=0;
        System.out.println("Exercise - 3");
        System.out.println(Arrays.toString(arr));
        for (int i=0; i<arr.length;i++){
            if (i%2==0)
                sumOdd+=arr[i];
            else
                sumEven+=arr[i];
        }
        System.out.printf("Multi sumOdd*sumEven=%.2f\n",sumEven*sumOdd);
    }
    static void Exercise_4 (int[] arr){
        int count=1;
        int sum=arr[0];
        System.out.println("Exdercise - 4");
        System.out.println(Arrays.toString(arr));
        for (int i=1;i<arr.length;i++){
            boolean isOnly=false;
            for (int j=0; j<i;j++){
                if (arr[i]!=arr[j])
                    isOnly=true;
                else {
                    isOnly = false;
                    break;
                }
            }
            if(isOnly){
                count++;
                sum+=arr[i];
            }
        }
        System.out.printf("Arithmetic = %.2f\n",(1.0*sum/count));
    }
    static void Exercise_5(int[] arr){
        System.out.println("Exercise - 5");
        System.out.println(Arrays.toString(arr));
        int min=arr[0],max=min;
        for (int element:arr){
            if (min>element)
                min=element;
            else if (max<element)
                max=element;
        }
        System.out.printf("min=%d max=%d\n", min,max);
        for (int i=min+1;i<max;i++){
            int j;
            for ( j=0;j<arr.length;j++){
                if (i==arr[j])
                    break;
            }
            if (j==(arr.length))
                System.out.print(i+" ");
        }
    }
    static boolean Exercise_6 (int[] arr, int[] in){
        System.out.println("Exercise - 6");
        System.out.println("arr="+Arrays.toString(arr));
        System.out.println("in="+Arrays.toString(in));
        int indexIn=0;
        boolean result=false;
        for (int elemnt: arr){
            boolean equals= elemnt==in[indexIn];
            if (equals){
                indexIn++;
                if (indexIn==in.length) {
                    result = true;
                    break;
                }
            } else indexIn=0;

        }
        return result;
    }
    static void Exercise_7 (int[] arr){
        System.out.println("Exercise - 7");
        System.out.println(Arrays.toString(arr));
        int startindex=0;
        int count=0;
        int tempIndex=0,tempCount=0;
        for (int i=0; i<arr.length;i++){
            if (arr[i]>=0){
                tempCount++;
                if ( i==(arr.length-1)){

                    if (tempCount>=count){
                        count=tempCount;
                        startindex=i+1;
                    }
                }
            }else if (arr[i]<0 ) {
                tempIndex=i;
                if (tempCount>=count){
                    count=tempCount;
                    startindex=tempIndex;
                }
                tempCount=0;
            }
            //System.out.printf("i=%d startIndex=%d count=%d\n",i,startindex,count);

        }
        for (int i=startindex-count;i<startindex;i++)
            System.out.print(arr[i]+" ");
        System.out.println();

    }
    static void Exercise_8(int[]arr ){
        int count=0, tempCount=0,number=0,tempNumber=0,key=0;
        System.out.println("Exercise - 8");
        System.out.println(Arrays.toString(arr));
        for (int element:arr){
            count=0;
            for (int j=0; j<arr.length;j++){
                if (element==arr[j]){
                   count++;
                   number=element;
                }
            }
            if (count>tempCount){
                tempCount=count;
                tempNumber=number;
                if (count>=2) {
                    key++;
                    System.out.printf("Number=%d count=%d\n", tempNumber, tempCount);
                }
            }
        }
        System.out.printf("Repeat key=%d\n",key);
    }
    static void Exercise_9(int[]arr){
        System.out.println("Exercise - 9");
        System.out.println(Arrays.toString(arr));
        int sum=0,count=0;
        for(int element:arr){
            if (element>=0){
                sum+=element;
                count++;
            }
        }
        System.out.printf("arithmetic=%.2f\n",(1.0*sum/count));
        for (int element:arr){
            if (element<(1.0*sum/count))
                System.out.print(element+" ");
        }
        System.out.println();
    }
    static void Exercise_10(int[] arr, int y){
        System.out.println("Exercise - 10");
        System.out.println(Arrays.toString(arr));
        System.out.println("y="+y);
        double arith=0.0,temp=1.0*(arr[0]+arr[1])/2;
        int number1=arr[0],number2=arr[1];
        for (int i=1;i<arr.length-1;i++){
            for (int j=i+1;j<arr.length;j++){
                arith=1.0*(arr[i]+arr[j])/2;
                //System.out.printf("1-%d 2-%d arith=%.2f y-arith=%.2f\n",arr[i],arr[j],arith,Math.abs(arith-y));
                if (Math.abs(arith-y)<=Math.abs(temp-y)){
                    number1=arr[i];
                    number2=arr[j];
                    temp=arith;

                }
            }

        }System.out.printf("Number1=%d number2=%d\n",number1,number2);

    }
    static void Exercise_11(int[]arr){
        System.out.println("Exercise - 11");
        System.out.println(Arrays.toString(arr));
        boolean flag=true;
            for(int i=0;i<arr.length/2;i++){
                if (arr[i]!=arr[arr.length-1-i]&&!isPrime(arr[i]))
                    flag=false;
            }
        System.out.println("Simetric prime resul="+flag);
    }
    static boolean isPrime(int n){
        boolean flag=true;
        for (int i=2;i<n;i++)
            if (n%i==0)
                flag=false;
        return flag;
    }
}
