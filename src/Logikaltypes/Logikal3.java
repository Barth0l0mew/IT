package Logikaltypes;

public class Logikal3 {
    public static void main(String[] args) {
        /*
        2.12. Дано трехзначное число. Найти:
а) число единиц в нем;
б) число десятков в нем;
в) сумму его цифр;
г) произведение его цифр.
         */
        int a=123;
        System.out.printf("once=%d\n", a%10);
        System.out.printf("ten=%d\n",a/10%10);
        System.out.printf("hundred=%d\n",a/100);
    }
}
