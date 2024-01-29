package Recursion;

public class Submarine {

    public static void main(String[] args) {
        recurse(0);
    }
    static void recurse (int depth){
        if (depth==3) return; //2. выход из рекурсии
        System.out.println(depth);
        recurse(depth+1);//4. рекурсивный вызов, погружение
        System.out.println("hi "+depth);
    }
}
