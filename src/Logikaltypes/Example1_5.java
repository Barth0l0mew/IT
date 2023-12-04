package Logikaltypes;

public class Example1_5 {

    public static void main(String[] args) {
        //Example 1 (m)
        if (20 < 18) { // if (fasle)
            System.out.println("20 is greater than 18");
        }

        //Example 2 (m)
        int x = 20;
        int y = 18;
        if (x < y) { // if (fasle)
            System.out.println("x is greater than y");
        }

        // Example 2 (m)
        if (true)
        System.out.println(true);

        //Example 3
        int time = 20;
        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

        //Example 4
        int time2 = 3;
        if (time2 > 5 && time2 < 12)
            System.out.println("Good morning.");
        else if (time2 < 18)
            System.out.println("Good afternoon.");
        else
            System.out.println("Good evening.");

        //Example 5
        int number = 10;
        if (number < 0)
            System.out.println("The number is negative.");
        System.out.println("Statement outside if block");
    }
}
