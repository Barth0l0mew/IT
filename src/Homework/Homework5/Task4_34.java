package Homework.Homework5;

public class Task4_34 {
    /*
    Определить, является ли число а делителем числа b? А наоборот? (Получить
два ответа.)
     */
    public static void main(String[] args) {
        double a=2, b=4;
        if (a%b==0)
            System.out.println("Является а/b");
        else
            System.out.println("Не является а/b");
        if (b%a==0)
            System.out.println("Является b/a");
        else
            System.out.println("Не является b/a");
    }
}
