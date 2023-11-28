package Homework2;

public class Task7 {
    /*
    Задание 7
Разработать программу, которая позволит при известном
годовом проценте вычислить сумму вклада в банке через
два года, если задана исходная величина вклада.
     */
    public static void main(String[] args) {
        double deposit=100.0, percent=13;

        System.out.printf("Start deposit = %.2f. Deposit after 2 years = %.2f",deposit,(deposit*percent/100*2+deposit));
    }
}
