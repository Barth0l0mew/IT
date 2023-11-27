package Zlatopolskiy;

public class Task_2_16 {
    public static void main(String[] args) {
      /*
      2.16. Дано трехзначное число. Найти число, полученное при перестановке первой и
второй цифр заданного числа.
       */
        int a = 123;
        int o = a%10;
        int t = a/10%10;
        int h = a/100;
        int b=o+h*10+t*100;
        System.out.printf("o=%d t=%d h=%d\n",o,t,h);
        System.out.println("b="+b);
    }
}
