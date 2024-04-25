package Lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaSort {
    public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("Hello");
    list.add("By");
    list.add("Good");
    list.add("Add");
    LambdaSort.sort(list);
        System.out.println(list.toString());
    }

    public static void sort(List<String> list) {
        Comparator<String> sorted = Comparator.comparing(el->el);
        Collections.sort(list,sorted);
    }
}
    //Отсортировать список строк с помощью лямбда-выражения?

