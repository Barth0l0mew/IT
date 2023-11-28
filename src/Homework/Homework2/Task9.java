package Homework2;

public class Task9 {
    /*
    Задание 9
Проверить, имеет ли число вещественную часть. Например, числа 3.14 и 2.5 – имеют вещественную часть, а числа 5.0
и 10.0 – нет.
     */
    public static void main(String[] args) {
        double number=3.0;
        if ((int)number==number){
            System.out.println("Нет вещественной части у числа "+number);
        } else {
            System.out.println("Есть вещественная часть у числа "+number);
        }

    }
}
