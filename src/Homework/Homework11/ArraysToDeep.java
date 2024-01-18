package Homework.Homework11;

import java.util.Arrays;

public class ArraysToDeep {
    public static void main(String[] args) {
        print(exercise_14(5, 9));
        print(exercise_15(5,9));
        print(exercise_16(9,9));
        print(exercise_17(9,9));
        print(exercise_18(9,9));
        print(exercise_19(9,9));
        print(exercise_20(9,9));
        print(exercise_21(9,9));
        print(exercise_22(9,9));
        print(exercise_23(9,9));
        print(exercise_24(9,9));
        print(exercise_25(9,9));
    }

    static String[][] exercise_14(int row, int colm) {
        String[][] arr = new String[row][colm];
        System.out.println("Exercise 14");
        for (int i = 0; i <row; i++)
            for (int j = 0; j <= colm / 2; j++) {
                if (i >= j) {
                    //System.out.println(colm/2+i);
                    arr[i][colm / 2 - j] = String.valueOf(j + 1);
                    arr[i][colm / 2 + j] = String.valueOf(j + 1);
                } else {
                    arr[i][colm / 2 - j] = " ";
                    arr[i][colm / 2 + j] = " ";
                }
            }
        return arr;
    }
    static String[][] exercise_15 (int row,int colm){
        String[][] arr = new String[row][colm];
        System.out.println("Exercise 15");
        for (int i = 0; i < row; i++)
            for (int j = 0; j <= colm / 2; j++) {
                if (i >= j) {
                    //System.out.println(colm/2+i);
                    arr[i][colm / 2 - j] = String.valueOf(colm/2+1-i+j);
                    arr[i][colm / 2 + j] = String.valueOf(colm/2+1-i+j);
                } else {
                    arr[i][colm / 2 - j] = " ";
                    arr[i][colm / 2 + j] = " ";
                }
            }
        return arr;
    }

    static String[][] exercise_16(int row, int colm){
        String[][] arr= new String[row][colm];
        System.out.println("Exercise 16");
        for (int i=0;i<row;i++)
            for (int j=0;j<colm;j++)
                if (j<=colm/2&&(i<=j||i>=(colm-1-j)) ) {
                    arr[i][j]=String.valueOf(colm-Math.abs(i-row/2)-j);
                }else
                    arr[i][j]=" ";
        return arr;
    }
    static String[][] exercise_17 (int row, int colm){
        String[][] arr = new String[row][colm];
        System.out.println("Exercise 17");
        for (int i=0;i<row;i++)
            for (int j=0;j<colm;j++)
                if (((colm/2-j<=i)&&(i<=(j+row/2)))&&j<=colm/2)
                    if (i<=row/2)
                    arr[i][j]=String.valueOf(Math.abs(Math.abs(colm/2-i)-j-1));
                    else
                        arr[i][j]=String.valueOf(j+1);
                else
                    arr[i][j]=" ";
        return arr;
    }
    static String[][] exercise_18 (int row, int colm){
        String[][] arr = new String[row][colm];
        System.out.println("Exercise 18");
        for (int i=0; i<row;i++)
            for (int j=0;j<colm;j++)
                if (j<=colm/2&&(i<=j||i>=(colm-j-1)))
                    arr[i][j]=String.valueOf(j+1);
                else
                    arr[i][j]=" ";
        return arr;
    }
    static String[][] exercise_19 (int row, int colm){
        String[][] arr = new String[row][colm];
        System.out.println("Exercise 19");
        for (int i=0;i<row;i++)
            for (int j=0;j<colm;j++)
                if (j<=colm/2&&(i<=j||i>=(colm-j-1)))
                arr[i][j]=String.valueOf(Math.abs(Math.abs(colm/2-Math.abs(colm/2-j))-Math.abs(colm/2-Math.abs(colm/2-i)))+1);
                else
                    arr[i][j]=" ";
        return arr;
    }
    static String[][] exercise_20 (int row, int colm){
        String[][] arr = new String[row][colm];
        System.out.println("Exercise 20");
        for (int i=0; i<row;i++)
            for (int j=0;j<colm;j++)
                if ((j<=colm/2&&i<=j)||(j>=colm/2&&i>=j))
                    arr[i][j]=String.valueOf(Math.abs(colm/2-Math.abs(colm/2-j))+1);
                else
                    arr[i][j]=" ";
        return arr;
    }
    static String[][] exercise_21 (int row, int colm){
        String[][] arr = new String[row][colm];
        System.out.println("Exercise 21");
        for (int i=0;i<row;i++)
            for (int j=0;j<colm;j++)
                if ((j<=colm/2&&i<=j)||(j>=colm/2&&i>=j))
                    arr[i][j]=String.valueOf(Math.abs(Math.abs(colm/2-Math.abs(colm/2-j))-Math.abs(colm/2-Math.abs(colm/2-i)))+1);
                else
                   arr[i][j]=" ";
        return arr;
    }
    static String[][] exercise_22 (int row, int colm){
        String[][] arr = new String[row][colm];
        System.out.println("Exercise 22");
        for (int i=0;i<row;i++)
            for (int j=0;j<colm;j++)
                if ((j<=colm/2&&i<=j)||(j>=colm/2&&i>=j))
                    arr[i][j]=String.valueOf(colm/2-Math.abs(Math.abs(colm/2-Math.abs(colm/2-j))-Math.abs(colm/2-Math.abs(colm/2-i)))+1);
                else
                    arr[i][j]=" ";
        return arr;

    }
    static String[][] exercise_23 (int row, int colm){
        String[][] arr= new String[row][colm];
        System.out.println("Exercise 23");
        for (int i=0;i<row;i++)
            for (int j=0;j<colm;j++)
                if ((i<=j&&j<=colm/2)||(i>=j&&j>=colm/2))
                arr[i][j]=String.valueOf(Math.abs(colm/2-j)+1);
                else
                arr[i][j]=" ";
        return arr;
    }
    static  String[][] exercise_24 (int row, int colm){
        String[][] arr = new String[row][colm];
        System.out.println("Exercise 24");
        for (int i=0;i<row; i++)
            for (int j=0;j<colm;j++)
                if ((i<=row/2&&j>=colm/2&&colm/2+i>=j)||(i>=row/2&&j<=colm/2&&row/2+j>=i))
                arr[i][j]=String.valueOf(Math.abs(colm/2-j)+1);
                else
                    arr[i][j]=" ";
        return arr;
    }
    static String[][] exercise_25 (int row, int colm){
        String[][] arr = new String[row][colm];
        System.out.println("Exercise 25");
        for (int i=0;i<row;i++)
            for (int j=0;j<colm;j++)
                if ((i<=row/2&&j>=colm/2&&colm/2+i>=j)||(i>=row/2&&j<=colm/2&&row/2+j>=i))
                    arr[i][j]=String.valueOf(colm-Math.abs(colm/2-Math.abs(colm/2-j))-Math.abs(row/2-Math.abs(row/2-i)));
                else
                    arr[i][j]=" ";
        return arr;
    }
    static void print(String[][] arr) {
        for (String[] a : arr) {
            for (String el : a)
                System.out.print(el + " ");
            System.out.println();
        }
        //+    System.out.println(Arrays.toString(el));
    }
}
