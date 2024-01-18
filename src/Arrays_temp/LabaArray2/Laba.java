package Arrays_temp.LabaArray2;

public class Laba {
    public static void main(String[] args) {
        String[][] arr = {{"1","2","3"},{"2","3","5"}};
        int size=5;
        int rows=size*2;
        int cols=size*2-1;
        int[][] arr2= new int[rows][cols];
        printInt(arr2);
        for (int i=0;i<size;i++){
            for (int j=size-1;j<size-1+i+1;j++)
            arr2[i][j]=j+1-i;
        }
        for (int i=size;i<rows;i++)
            for (int j=i-size;j<size;j++)
                arr2[i][j]=size-j+Math.abs(size-i);
        System.out.println();
        printInt(arr2);
    }
    static void print (String[][] arr){
        for (String[] a:arr) {
            for (String el : a)
                System.out.print(" " + el);
            System.out.println();
        }
    }
    static void printInt (int[][] arr){
        for (int[] a:arr) {
            for (int el : a)
                System.out.print(" " + el);
            System.out.println();
        }
    }
}
