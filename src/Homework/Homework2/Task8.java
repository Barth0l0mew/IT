package Homework2;

public class Task8 {
    /*
    Задание 8
Зная скорость распространения звука в воздушной среде,
 можно вычислить расстояние до места удара молнии по
времени между вспышкой и раскатом грома. Зная время в
секундах между вспышкой и раскатом грома (константа в
программе), вычислите расстояния до места удара молнии и
выведите его на экран.
     */
    public static void main(String[] args) {
        final double TIME=5.4;
        double speedLight=335;
        System.out.printf("Distance = %.2f m",(speedLight*TIME));
    }
}
