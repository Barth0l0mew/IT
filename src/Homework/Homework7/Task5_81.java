package Homework.Homework7;

public class Task5_81 {
    /*
     Даны натуральные числа х и у. Вычислить произведение
x y , используя
лишь операцию сложения. Задачу решить двумя способами.
     */
    public static void main(String[] args) {
        int x=5,y=3;
        int multi=0;
        for (int i=0 ;i<y;i++){
            multi+=x;
        }
        System.out.printf("1 - x+y=%d\n",multi);
        System.out.println();
        multi=0;
        int i=0;
        while (i<y){
            multi+=x;
            i++;
        }
        System.out.printf("2 - x+y=%d\n",multi);
    }
}
