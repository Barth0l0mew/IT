package Recursion;

public class Permutation {
    static String s="123";
    static int n= s.length();
    static StringBuilder sb =new StringBuilder(s);
    public static void main(String[] args) {
    permut(0);
    }
    static void permut (int i){
        if (i==n-1)
            System.out.println(sb);
        else
            for (int j=i;j<n;j++){
                swap(i,j);
                permut(i+1);
                swap(i,j);
            }
    }
    static void swap (int i, int j){
        char temp = sb.charAt(i);
        sb.setCharAt(i,sb.charAt(j));
        sb.setCharAt(j,temp);
    }

}
