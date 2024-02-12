package OOP.Stack;

import java.util.Stack;

public class CheckParenthesis {
    public static void main(String[] args) {
        String s = "(1*[2+3]);"; //Правильное выражение
        //String s = "2+3]);"; //Только закрывающие скобки
        //String s = "[(2+3]);"; //Несоответствующие скобки
        String parentesis = "(){}[]";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int index = parentesis.indexOf(c); //Является ли скобкой
            if (index != -1)
                if (index % 2 == 0)
                    stack.push(c);
                else {
                    if (stack.empty()) {
                        System.out.println("Ошибка");
                        break;
                    }
                    char c2 = stack.peek();
                    int index2 = parentesis.indexOf(c2);
                    if (index-index2==1)
                        stack.pop();
                    else System.out.println("Ошибка");
                }
        }
        if (!stack.empty()) System.out.println("Ошибка");

System.out.println(stack.toString());
    }
}
