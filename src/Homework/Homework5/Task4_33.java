package Homework.Homework5;

public class Task4_33 {
    /*
    . Дано натуральное число.
а) Верно ли, что оно заканчивается четной цифрой?
б) Верно ли, что оно заканчивается нечетной цифрой?

     */
    public static void main(String[] args) {
        int number=1400;
        if (number%10%2==0)
            System.out.println("Четное");
        else
            System.out.println("Не четное");
    }
}
