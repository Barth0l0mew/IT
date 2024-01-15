package Game.GuessNumber;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100)+1;
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter number: ");
            int guessed=scan.nextInt();
            if (guessed == number) {
                System.out.println("win");
                break;
            } else {
                System.out.println("Looser");
                if (guessed < number)
                    System.out.println("up");
                else
                    System.out.println("down");
            }

        }

    }

}
//class RandomNumber{
//    private int size;
//    public RandomNumber (int size) {
//        this.size=size;
//    }
//    public static
//}