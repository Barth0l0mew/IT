package Logikaltypes;

public class Logikal2 {
    public static void main(String[] args) {
        /*
Даны 3 целых числа. Программа выводит результат логических выражений в виде true или false:
1. Первые два числа равны между собой и не равны третьему;
2. Второе или третье число больше первого;
3. Первое не меньше второго, а второе не больше третьего;
4. Все числа разные;
5. Первое - четное, второе - нечетное, третье - отрицательное;
 */
        int a=1,b=1,c=3;
        System.out.printf("1 - a=b!=c %b\n",a==b&&a!=c||b!=c);
        System.out.printf("2 - b>a||c>a %b\n",b>a||c>a);
        System.out.printf("3 - a>=b&&b<=c %b\n",a>=b&&b<=c);
        System.out.printf("4 - a!=b&b!=c&c!=a %b\n",a!=b&&b!=c&&c!=a);
        System.out.printf("5 - a%%2==0&b%%2!=0&c<0 %b\n",((a%2)==0)&&((b%2)!=0)&&c<0);

    }
}
