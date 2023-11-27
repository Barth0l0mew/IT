package Logikaltypes;

public class Chest {
    public static void main(String[] args) {
        int x1=8, y1=1;
        int x2=6, y2=1;
        if ((x1==x2)^(y1==y2))
            System.out.println("yes");
        else
            System.out.println("no");
        if ((x1+y1)%2==1 &&(x2+y2)%2==1) System.out.println("yes");
        else System.out.println("no");
        if (Math.abs(x1-x2)==Math.abs(y1-y2)) System.out.println("yes");
        else System.out.println("no");
    }
}
