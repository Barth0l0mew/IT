package Homework.Homework5;

public class Task4_8 {
    /*
    Известны два расстояния: одно в километрах, другое — в футах
(
1 фут 0,305 м
). Какое из расстояний меньше?
     */
    public static void main(String[] args) {
        double km=34, fut=50000;
        if (km*3280>fut)
            System.out.println("Больше км");
        else
            System.out.println("Больше фут");
    }
}
