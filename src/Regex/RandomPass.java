package Regex;

import java.util.Random;

public class RandomPass {
    public static void main(String[] args) {
        System.out.println(randomPass());
    }
    static String randomPass (){
        StringBuilder str = new StringBuilder();
        Random random = new Random();
        char[] spec = {(char)(random.nextInt(6)+58),(char)(random.nextInt(6)+91),(char)(random.nextInt(4)+123),(char)(random.nextInt(14)+33)};
        str.append(spec[random.nextInt(4)]);
        str.append((char)(random.nextInt(25)+66));
        str.append((char)(random.nextInt(25)+97));
        str.append((char)(random.nextInt(10)+48));
        for (int i=0; i<4;i++) {
            int ran=random.nextInt(4);
            char temp= str.charAt(i);
            str.setCharAt(i,str.charAt(ran));
            str.setCharAt(ran,temp);
        }

        return str.toString();
    }
}
