package Recursion;

public class Factorial {
    static int index=0;
    public static void main(String[] args) {
    recurse(5);//1. точка входа в реккурсию
        System.out.println(fac(10));
        System.out.println(sum(5));
        System.out.println(sum2(5));
    }
    static int fac (int i){
        int pr;
        if (i==1) return i;
        pr=i*fac(--i);
        return pr;
    }
    static int sum (int i){
        //int s;
        if (i==1) return i;
        //s=i+sum(--i);
        return i+sum(--i);
    }
    static int sum2 (int number){
        if (number==0) return number;
        return number+sum2(number-1);
    }
    static  void recurse(){
        if (index==5) return; //2. выход из рекурсии
        index++;//3. необходимые инструкции
        System.out.println("hi");
        recurse();//4. рекурсивный вызов, погружение
    }
    static  void recurse(int index){
        if (index==0) return; //2. выход из рекурсии
        System.out.println("hi");
        recurse(index-1);//4. рекурсивный вызов, погружение
    }
}
