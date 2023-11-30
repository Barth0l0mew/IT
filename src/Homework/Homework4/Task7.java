package Homework.Homework4;
import java.util.Scanner;

public class Task7 {
    /*
    Задание 7
Пользователь вводит с клавиатуры букву. Программа
должна определить, в какой раскладке введена буква – в латинской или кирилице. Вывести в консоль: «латиница», если
буква введена латиницей или «кирилица», если буква относится к кирилическому алфавиту. Если введена цифра, а не
буква, вывести «цифра». Если символ не относится ни к буквам, ни к цифрам, вывести «невозможно определить».
     */
    public static void main(String[] args) {
        System.out.print("Input char= ");
        Scanner scan = new Scanner(System.in);
        char c=scan.nextLine().charAt(0);
        if(('a'<=c&&'z'>=c)||('A'<=c&&'Z'>=c))
        System.out.println("Латиница");
        else if (('а'<=c&&'я'>=c)||('А'<=c&&'Я'>=c))
        System.out.println("Кирилица");
        else if ('0'<=c&&c<='9')
            System.out.println("Цифры");
        else
            System.out.println("Не определенно");
    }
}
