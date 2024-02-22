package OOP.Collection2;
//ArrayList<Stack>

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ArrayList_Stack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("1");
        String s= stack.pop();
        List<Stack<String>> list = new ArrayList<>();
        for (int i=0; i<3; i++){
            Stack<String> stack2 = new Stack<>();
            for (int j=0; j< 5; j++)
                stack2.push(String.format("string %d",i*5+j));
                //stack2.push(String.valueOf(j));
            list.add(stack2);
        }
        for (Stack<String> el: list)
            System.out.println(el.toString());
        //изменение 2 строки 1 кооробки
        Stack<String> stack3 = list.get(1);
        System.out.println("-------------");
        stack3.set(2,"String new");
        print(list);
        System.out.println("---------------");
        outbox(list);


    }
    static  void print (List<Stack<String>> list ){
        for (Stack<String> el: list)
            System.out.println(el.toString());
    }
    static void outbox(List<Stack<String>> list ){
        for (int i=0; i<list.size();i++){
            Stack<String> stack3 = list.get(i);
            while(!stack3.empty()){
                String s= stack3.pop();
                System.out.print(s+ "  ");
            }
            System.out.println();
        }

    }
}
