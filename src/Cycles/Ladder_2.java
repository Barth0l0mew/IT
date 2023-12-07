package Cycles;

public class Ladder_2 {
    public static void main(String[] args) {
        for (int i=0; i<9; i++) {
            System.out.print("1th: " + (i + 1));
            System.out.println(" 2th: " + (9 - i));
        }
        System.out.println("Ex2");
        for (int i=0,j=0;i<9 && j<9;i++,j+=2){
            System.out.print("1th: " + (i + 1));
            System.out.println(" 2th: " + j);

        }
        //Два шага вперед, один назад: 0,2,1,3,2,4,3,5
        System.out.println("0,2,1,3,2,4,3,5 ");
        for(int i=0;i<9;i++) {
            System.out.print(i+" ");
            System.out.print((i+2)+" ");
            if ((i+2)>9)
                break;
//            int temp = i;
//            if (i % 2 == 0)
//                System.out.print((temp-=1) + " ");
//            else
//                System.out.print((temp+=2) + " ");
        }
    }
}
