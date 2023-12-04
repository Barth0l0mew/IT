package Classwork;

public class Numbers3 {
   /*
Для трех чисел известна их четность. Определить, будет ли сумма четной.
 */
   public static void main(String[] args) {
       int a=3,b=3,c=1;
       boolean a1=a%2==0;
       boolean b1=b%2==0;
       boolean c1=c%2==0;
       if ((!a1&&!b1&&c1)||(!a1&&b1&&!c1)||(a1&&!b1&&!c1)||(a1&&b1&&c1))
           System.out.println("even");
       else
           System.out.println("odd");
   }
}
