package Homework.Homework12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        exercise_1("C:\\Windows\\System32\\calc.exe");
        exercise_2("/etc/samba/smb.conf");
    }
    static void exercise_1 (String str){

        System.out.println("Exercise 1");
        System.out.println(str);
        String[] arr = str.split("\\\\");
        String disk= arr[0];

        String fileName=arr[arr.length-1].substring(0,arr[arr.length-1].indexOf("."));
        String fileExtension=arr[arr.length-1].substring(arr[arr.length-1].indexOf(".")+1);
        System.out.println("Disk = "+disk);
        for (int i=1;i<arr.length-1;i++){
            String catalog = arr[i];
            System.out.println("Catalog = "+ catalog);
        }
        System.out.println("FileName = "+fileName);
        System.out.println("FileExtension = "+fileExtension);



    }
    static void exercise_2 (String str){

        System.out.println("Exercise 2");
        System.out.println(str);
        String[] arr = str.split("/");
       // String disk= arr[0];

        String fileName=arr[arr.length-1].substring(0,arr[arr.length-1].indexOf("."));
        String fileExtension=arr[arr.length-1].substring(arr[arr.length-1].indexOf(".")+1);
        //System.out.println("Disk = "+disk);
        for (int i=1;i<arr.length-1;i++){
            String catalog = arr[i];
            System.out.println("Catalog = "+ catalog);
        }
        System.out.println("FileName = "+fileName);
        System.out.println("FileExtension = "+fileExtension);



    }
}
