package StringExercise;

import com.sun.jdi.request.StepRequest;

import java.util.Arrays;

public class String3 {
    public static void main(String[] args) {
        /*
        // Посчитать количество повторяющихся символов в строке

        String s = "Посчитать количество повторяющихся символов в строке";
         */
        String s = "Посчитать количество повторяющихся символов в строке";
        String sUnique="";
        for (int i=0; i<s.length();i++){
            boolean flag=true;
            for (int j=0;j<i;j++)
                if (s.charAt(i)==s.charAt(j))
                    flag=false;
            if (flag) {
                sUnique+=s.charAt(i);
                System.out.print(s.charAt(i));
            }

        }
        //Посчитать количество этих символов в строке
        int counts[] = new int[s.length()];
        for (int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            int index = sUnique.indexOf(Character.toString(c));
            if (index!=-1)
                counts[index]++;
        }
        System.out.println(Arrays.toString(counts));
    }
}
