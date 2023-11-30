package Homework.Homework4;
public class Task8 {
    /*
Задание 8
Даны два числа x и y. Программа должна вывести в консоль YES, – если оба числа четные, либо оба числа нечетные; 
иначе программа ничего не выводит
     */
    public static void main(String[] args) {
        int x=332,y=150;
        if (x%2==0&&y%2==0)
            System.out.println("Два числа четные");
        else if (x%2!=0&&y%2!=0)
            System.out.println("Два числа не четные");
    }
}
