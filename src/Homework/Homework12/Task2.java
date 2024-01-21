package Homework.Homework12;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(exercise_1("Все его символы, стоящие на четных местах, заменить буквой ы."));
        System.out.println(exercise_2("Все его символы, стоящие на третьем, шестом, девятом и т. д. местах, заменить буквой а."));
        System.out.println(exercise_3("Дано ах предложение. Заменить в нем ах все вхождения буквосочетания ах на ух."));
       // System.out.println(exercise_3("Дано предложение. Заменить в нем  все вхождения буквосочетания  на ух."));
    }
    static String exercise_1 (String str){
        System.out.println("Exercise 1");
        System.out.println(str);
        StringBuilder sb = new StringBuilder(str);
        for (int i=1;i<sb.length();i+=2)
            sb.replace(i,i+1,"ы");
        return sb.toString();
    }
    static String exercise_2 (String str){
        System.out.println("Exercise 2");
        System.out.println(str);
        char[] buffer = new char[str.length()];
        str.getChars(0,str.length(),buffer,0);
        for (int i=2; i<str.length();i+=3)
            buffer[i]='a';
        return new String(buffer);
    }
    static String exercise_3 (String str){
        System.out.println("Exercise 3");
        System.out.println(str);
        StringBuilder sb = new StringBuilder(str);
        int index=0;
        while (true){
            index=sb.indexOf("ах");
            if (index>=0)
                sb.replace(index,index+2,"ух");
            else
                break;
        }

        return sb.toString();
    }

}
