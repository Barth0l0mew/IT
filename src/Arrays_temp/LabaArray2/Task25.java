package Arrays_temp.LabaArray2;

public class Task25 {
    public static void main(String[] args) {
        print(exercise_24(9,9));
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
    static void print(String[][] arr) {
        for (String[] a : arr) {
            for (String el : a)
                System.out.print(el + " ");
            System.out.println();
        }
        //+    System.out.println(Arrays.toString(el));
    }
}

