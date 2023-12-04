package Classwork;

public class Even {
    /*
Целое число должно делиться на 3 или на 5, при этом не может делиться на 3 и на 5 одновременно и не является при этом четным.
Написать программу для проверки этого условия для заданного числа.
A: делится на 3
B: делится на 5
С: является четным
 */
    public static void main(String[] args) {
        int n=10;
        boolean a=n%3==0;
        boolean b=n%5==0;
        boolean c=n%2==0;
        if ((!a&&b&&!c)||(a&&!b&&!c))
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
