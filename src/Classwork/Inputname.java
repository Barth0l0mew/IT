package Classwork;

import java.util.Scanner;

public class Inputname {
    public static void main(String[] args) {
        String name;
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("Input name");
            name=scan.nextLine();
        }
        while (name.equals(""));


    }
}
