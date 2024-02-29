package Exeptionsed;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BuiltinExeptions {
    //Встроенные исключения
    public static void main(String[] args)  {
    int a=1,b;
    try {
        b=a/0;
    }
    catch (ArithmeticException e) {
        System.out.println("Nu-nu ");
    }
    int[] arr={1,2,3};
    try{
        System.out.println(arr[3]);
    }
    catch (ArrayIndexOutOfBoundsException e){
        System.out.println("nu-nu");
    }
    TestClass testClass =null;
    try{
        testClass.print();
    }
    catch (NullPointerException e){
        System.out.println("not object");
    }

    try {
        int q=Integer.parseInt("1.2");
    }
    catch (NumberFormatException e){
        System.out.println("not  number");
    }
    }
    static void processInput (){
        try {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Input a");
            int a1 = scanner1.nextInt();
            System.out.println(a1);
        }
        catch (InputMismatchException e){
            System.out.println(e);
        }
    }
}
class TestClass {
    private int i=0;
    public void print(){
        System.out.println("print");
    }

}
