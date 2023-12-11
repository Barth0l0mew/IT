package Classwork;

import java.util.Random;
import java.util.Scanner;

public class Paper_game {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        Random random = new Random();
        int iAnswer=0;
        while (true) {
            System.out.println("Input rook=r, paper=p, scisors=s");
            char answer = scan.nextLine().charAt(0);
            switch (answer){
                case'r':
                    iAnswer=0;
                    break;
                case 'p':
                    iAnswer=1;
                    break;
                case 's':
                    iAnswer=2;
                    break;

            }
            int rang=random.nextInt(3);
            System.out.println("computer "+rang);
            if (iAnswer==rang)
                System.out.println("draw");
            if (iAnswer==0&& rang==2)
                System.out.println("win");
            if (iAnswer==0&& rang==1)
                System.out.println("game ower");
            if(iAnswer==1&& rang==0)
                System.out.println("win");
            if (iAnswer==1&&rang==2)
                System.out.println("game ower");
            if (iAnswer==2&&rang==0)
                System.out.println("game oewr");
            if (iAnswer==2&&rang==1)
                System.out.println("win");

        }

    }
}
