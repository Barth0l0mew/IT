package Homework.Homework13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexString {
    public static void main(String[] args) {
        exercise_1("+111 (555) 111-2345");
        exercise_2("31.12.2024");
        exercise_3("5223456778944245");
        exercise_4("3111111E001PB0");
        exercise_5("Bar_d.aa");
        exercise_6("#AA22F3");
        exercise_7("filename.exe");
    }
    static void exercise_1 (String str){
        System.out.println("Matches "+match("\\+\\d{3}\\s+\\(\\d{3}\\)\\s+\\d{3}\\-\\d{4}",str));
    }
    static void exercise_2 (String str){
        System.out.println("Matches "+match("([0-2][0-9]|3[0-1])\\.(0[1-9]|1[0-2])\\.(\\d{4})",str));
    }
    static void exercise_3 (String str){
        System.out.println(match("4\\d{12}|4\\d{15}",str));
        if (match("4\\d{12}|4\\d{15}",str))
            System.out.printf("Card %s - MasterCard\n",str);
        else if (match("5[1-4]\\d{14}",str))
            System.out.printf("Card %s - Visa\n",str);
        else
            System.out.printf("Card %s not found\n",str);
    }
    static void exercise_4 (String str){
        System.out.println(match("\\d{7}E\\d{3}PB\\d",str));
    }
    static void exercise_5 (String str){

        if (match("[a-zA-Z._0-9]{5,12}",str)&&!match(".*((\\.{2,}|_{2,})|(\\._)|(_\\.)).*",str))
            System.out.println("Username correct");
        else
            System.out.println("Invalid username");
    }
    static void exercise_6 (String str){
        System.out.println(match("#[0-9A-Fa-f]{6}",str));
    }
    static  void exercise_7 (String str){
        System.out.println(match("[a-zA-Z0-9]{1,8}(.[a-zA-Z0-9]{3})?",str));
    }
    static boolean match (String reg, String str){
        System.out.println();
        System.out.println("Exercise ");
        System.out.println(reg);
        System.out.println(str);
        Pattern pt = Pattern.compile(reg);
        Matcher mt = pt.matcher(str);
        return mt.matches();
    }
}
