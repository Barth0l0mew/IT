package Homework.Homework12;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(interfeis()));
    }
    static String[] interfeis (){
        String str="интерфейс";
        String[] result = new String[2];
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        int index1=str.indexOf("и");
        sb.append(str.substring(index1,5));
        index1=str.indexOf("е");
        sb.append(str.substring(index1,(index1+1)));
        index1=str.indexOf("с");
        sb.append(str.substring(index1,index1+1));
        result[0]=sb.toString();

        index1=str.indexOf("ф");
        sb1.append(str.substring(index1,index1+1));
        index1=str.indexOf("и");
        sb1.append(str.substring(index1,index1+1));
        index1=str.indexOf("т");
        sb1.append(str.substring(index1,index1+1));
        index1=str.indexOf("н");
        sb1.append(str.substring(index1,index1+1));
        index1=str.indexOf("е");
        sb1.append(str.substring(index1,index1+1));
        index1=str.indexOf("с");
        sb1.append(str.substring(index1,index1+1));
        result[1]=sb1.toString();
        return result;
    }
}
