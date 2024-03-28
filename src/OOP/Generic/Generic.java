package OOP.Generic;

import java.util.ArrayList;
import java.util.List;

public class Generic {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add('a');
        list.add(123);
        list.add("asd");
        printData('e');
        printData(1);
        printData("Hello");
        printData(list);
    }
    public static <T> void printData (T num){
        System.out.println(num);
    }

}

