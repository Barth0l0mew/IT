package StringExercise;

import java.util.Arrays;

public class Strings1 {
    public static void main(String[] args) {
        String s="abf";
        System.out.println(new String("a").hashCode());
        System.out.println("creat string");
        String s2=new String(s);
        String s3=s;
        int i=(int)new Character('s');
        System.out.println((int)new Character('s'));
        System.out.println("intern = "+s.intern());
        System.out.println("Equals s=s2 - "+s.equals(s2));
        System.out.println("s=s2 "+ (s==s2));
        System.out.println("charAt 2 = "+s.charAt(2));
        System.out.println(" hashCode  s="+s.hashCode());
        System.out.println("s=s3 "+(s==s3));
        System.out.println(" hashCode s2="+s2.hashCode());
        System.out.println(s.charAt(s.toCharArray().length-1));
        char c1 = '2', c2 = '\u00B7', c3 = '\u03C0', c4 = '=', c5 = '1',
                c6 = '8', c7 = '0', c8 = '\u00B0';
        String s5=String.valueOf(c1)+String.valueOf(c2)+String.valueOf(c3)+String.valueOf(c4)+String.valueOf(c5)+String.valueOf(c6)+String.valueOf(c7)+String.valueOf(c8);
        String s6=""+c1+c2+c3+c4+c5+c6+c7+c8;
        System.out.println(s5);
        System.out.println(s6);
      String s1 = "fir"; s2 = "air";
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1.equals(s2));
        System.out.println(s1.compareTo(s2));
        System.out.println((char)(s2.charAt(0)+5));
        String s9="123455";
        boolean result=true;

        for (int q=0;q<s9.length();q++)
            if (!Character.isDigit(s9.charAt(q)))
                result=false;
        System.out.println(result);
        String s10;
        //Проверить, содержит ли строка данную последовательность символов
        s = "good";
        s2 = "oo";
        System.out.println(s.contains(s3));
        //Проверить, одинаковы ли строки
        s = "good";
        //s2 = "good";
        s2 = new String("good");
        boolean answer = s == s2 ? true : false;
        //answer = s.equals(s2) ? true : false;
        System.out.println("Строки одинаковы: " + answer);
        //Заменить символ в строке (точку на вопросительный знак
        String str = "Why is garbage collection necessary in Java.";
        int index=str.indexOf('.');
        System.out.println(str.substring(0,index)+"?");
        StringBuilder str1 = new StringBuilder(str);
        char c='?';
        str1.setCharAt(index,'?');
        System.out.println(str1);
        //Заменить подстроку в строке
        s = "JVM is a %s virtual machine.";
        s = s.replace("%s","java");
        System.out.println(s);
        String[] arr= s.split(" ");
        System.out.println(Arrays.toString(arr));
        //Извлечь из строки подстроку JRE
        s = "JDK vs JRE vs JVM";
        s2= s.substring(s.indexOf("JRE"),s.indexOf("JRE")+3);
        System.out.println(s2);
        //Удалить все скобки из выражения
        s = "What are the {wrapper} {classes} in Java?";
        s= s.replaceAll("[{}]","");
        System.out.println(s);
        //Заменить первую букву на прописную
        s = "what is JIT compiler in Java?";
        StringBuilder sb= new StringBuilder(s);
        Character ch = s.charAt(0);

        sb.setCharAt(0,Character.toUpperCase(s.charAt(0)));
//Разбить строку на подстроки
        s = "Access modifiers in Java are: \nDefault\nPrivate\nProtected\nPublic";
        String[] string = s.split("\n");
        System.out.println(Arrays.toString(string));
        //Удалить концевые пробелы
        s = " Object-Oriented Programming or OOPs is a programming style that is associated with concepts like: "
                + "innheritance, encapsulation, polymorphism, abstraction. ";
        String res = s.trim();
        System.out.println(res);
    }
}
