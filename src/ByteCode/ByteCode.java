package ByteCode;

public class ByteCode {
    public static void main(String[] args) {
        int a=2;
        int b=a+3;
           /*
        //Сложение трех чисел
        int a = 1;
        int b = 2;
        int c = a+b+1;
         */

        //Вызов функции
         a=1;
         b=2;
        int c = calc(a,b);
        //

    }
    public static int calc(int a, int b){
        return (int)Math.sqrt(a+b);
    }
}
