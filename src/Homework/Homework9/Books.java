package Homework.Homework9;

import java.util.Scanner;

public class Books {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        Book book = new Book("Война и мир",1872,"Л.Н.Толстой","Про войну и мир",2000);
        Book book2 = new Book("Мертвые души",1850,"Н.В. Гоголь","Про души",150);
        Book book3 = new Book("Березка");
        System.out.println(book);
        System.out.println(book2);
        System.out.println(book3);

    }

}
