package Recursion;

public class CambinationWithoutRepetitions {
    static String s="123";
    static int r=2;
    static int n=s.length();
    public static void main(String[] args) {
            combination(new StringBuilder(),0);
            combinations(new StringBuilder(),n,r);
    }
    static void combination (StringBuilder sb, int start){
        System.out.println(sb);
        for ( int i=start;i<n;i++) {
            sb.append(s.charAt(i));
            combination(sb, i + 1);
            sb.delete(sb.length()-1,sb.length());
        }
    }
    static void combinations(StringBuilder sb, int n, int r){
        if (sb.length()==r){
            System.out.println(sb);
            return;
        }

        for (int i=0; i<n; i++){
            sb.append(s.charAt(i));
            combinations(sb,n,r);
            sb.delete(sb.length()-1,sb.length());
        }
    }
}
