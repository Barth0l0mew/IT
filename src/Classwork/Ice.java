package Classwork;

public class Ice {
    /*
В кафе продают мороженое только по 3 или по 5 шариков.
Можно ли приобрести ровно n шариков мороженного?
 */
    public static void main(String[] args) {
        int n=4;
        if (n==3 || n==5 || n==6|| n>=8)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
