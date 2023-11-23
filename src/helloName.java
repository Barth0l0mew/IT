import  java.util.Scanner;
public class helloName {

    public static void  main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name=scan.nextLine();
        System.out.printf("Name - %S\n",name.toUpperCase());


    }
}
