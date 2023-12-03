package Homework.Homework5;

public class Task4_9 {
    /*
    Известны две скорости: одна в километрах в час, другая — в метрах в секунду. Какая из скоростей больше?
     */
    public static void main(String[] args) {
        double kmh=76,mc=13;
        if (kmh/3.6>mc)
            System.out.println("больше км/ч");
        else
            System.out.println("больше м/с");
    }
}
