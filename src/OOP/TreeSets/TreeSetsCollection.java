package OOP.TreeSets;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetsCollection {
    public static void main(String[] args) {
//        TreeSet<Book> books= new TreeSet<>();
//        Book war = new Book("war","123");
//        Book peace = new Book("peace","321");
//        books.comparator();
//        System.out.println(war);
//        System.out.println(peace);
//        books.add(war);
//        books.add(peace);
    }
}
class Book{
    public String name;
    public String page;
    public Book(String name, String page){
        this.name=name;
        this.page=page;
    }
    @Override
    public String toString (){
        return name+" "+page;
    }
}
