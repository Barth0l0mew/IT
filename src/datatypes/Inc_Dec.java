package datatypes;

public class Inc_Dec {
    /*
    Инкримент - декримент
     */
    public static void main(String[] args) {
        int x,y;
        System.out.println("Inc");
        x=1;
        y=++x;
        System.out.println(x+" "+y);
        x=1;
        y=x++;
        System.out.println(x+" "+y);
        x=1;
        y=--x;
        System.out.println(x+" "+y);
        x=1;
        y=0;
        y=++x+x++;
        System.out.println(x+" "+y);
        x=1;
        y=0;
        y=++x- --x;
        System.out.println(x+" "+y);
        x=1;
        y=0;
        y=x++ - x--;
        System.out.println(x+" -5 "+y);
        x=1;
        y=0;
        y=x-- - --x;
        System.out.println(x+" -6 "+y);
        x=1;
        y=0;
        y=x++ - ++x;
        System.out.println(x+" "+y);
        x=1;
        y=0;
        y+=++x;
        System.out.println(x+" "+y);
        x=1;
        y=0;
        y+=x++;
        System.out.println(x+" "+y);
        x=4;
        y=0;
        y+=++x+x;
        System.out.println(x+" "+y);
        x=4;
        y=0;
        y+=x++ +x;
        System.out.println(x+" "+y);
        x=4;
        y=0;
        y+=--x+x++;
        System.out.println(x+" "+y);
        x=4;
        y=0;
        y+=++x+ ++x;
        System.out.println(x+" "+y);
    }
}
