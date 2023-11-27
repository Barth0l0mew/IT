package Zlatopolskiy;

public class Logikal3_29 {
    public static void main(String[] args) {
        /*
        3.29. Записать условие, которое является истинным, когда:
а) каждое из чисел X и Y нечетное;
б) только одно из чисел X и Y меньше 20;
в) хотя бы одно из чисел X и Y равно нулю;
г) каждое из чисел X, Y, Z отрицательное;
д) только одно из чисел X, Y и Z кратно пяти;
е) хотя бы одно из чисел X, Y, Z больше 100
         */
        int x=5, y=3, z=5;
        boolean b1=x%2!=0&&y%2!=0;
        System.out.println("b1="+b1);
        boolean b2=x<20^y<20;
        //((a<20)&&!(b<20))||(!(a<20)&&(b<20))
        System.out.println("b2="+b2);
        boolean b3=x==0||y==0;
        System.out.println("b3="+b3);
        boolean b4=x<0&&y<0&&z<0;
        System.out.println("b4="+b4);
        boolean b5=x%5==0^y%5==0^z%5==0;
        //не работает
        System.out.println("b5="+b5);
        boolean b6=x>100||y>100||z>100;
        System.out.println("b5="+b6);

    }
}
