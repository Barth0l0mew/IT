package Classwork;

public class Fibonachi {
    public static void main(String[] args) {
        /*
        1123
         */
        int sum=1;
        int temp=0;
        for (int i=0; i<5;i++){

            sum+=temp;
           // System.out.print(sum+"");
            temp+=sum;
            System.out.print(sum+""+temp+"");
            //System.out.printf("\n%d %d\n",sum,temp);
        }

        System.out.println();
        System.out.println();
        int first=0; int second = 1;
        int third;
        for (int i=0; i<10; i++){
            third = first+second;
            System.out.print(first+" ");
            first = second;
            second = third;
        }
    }
}
