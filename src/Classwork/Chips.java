package Classwork;

public class Chips {
    /*
Фишки. Имеется квадратная доска nxn, на крайние поля которой выставлены фишки.
Дано k - количество фишек.
Можно ли разместить все эти фишки, чтобы они заняли все крайние поля доски?
Например, на доску 2x2 можно выставить 4 фишки, а на доску 5x5 - 16.
 */
    public static void main(String[] args) {
        int n=2, k=4;
        if ((n-1)*4<=k)
            System.out.println("yes");
        else
            System.out.println("no");

    }
}
