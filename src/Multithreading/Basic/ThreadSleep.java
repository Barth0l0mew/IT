package Multithreading.Basic;

import java.util.Scanner;

public class ThreadSleep {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Перевести 100 000 $ на карту");
        System.out.println("Если да нажмите y");
        if (scanner.nextLine().equals("y")){
        for (int i=0;i<50;i++){
            Thread.sleep(100);
            System.out.print("*");
        }
            System.out.println();
            System.out.println("Перевод завершен");
        }
    }

}
