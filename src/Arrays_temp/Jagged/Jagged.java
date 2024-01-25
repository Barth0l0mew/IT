package Arrays_temp.Jagged;

import java.util.Arrays;

public class Jagged {
    public static void main(String[] args) {
        //ступенчатый ммасив
        int[][] num = {{1,2,3},{1,2},{1}};

        System.out.println(Arrays.deepToString(num));
        String s="JaggedEdge";
        char[][] arr=new char[s.length()][];
        for (int i=0;i<s.length();i++){
           arr[i]=new char[i+1];
            for (int j=0;j<i+1;j++)
                arr[i][j]=s.charAt(j);
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
