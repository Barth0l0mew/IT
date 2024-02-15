package OOP.Laba2;

import java.util.*;

public class Laba2 {
    public static void main(String[] args) {
        /*
        1. Имеется список книг.
        Вывести книги до определенного года издания и в отсортированном порядке.
         */
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("War and Peace", 1992));
        books.add(new Book("Harry Potter",2005));
        books.add(new Book("Ball",2024));
        print(books);
        System.out.println("------------------");
        found(books,2010);
    }
    static void found (ArrayList<Book> books, int year){
        ArrayList<Book> tempBooks = new ArrayList<>();
        for (Book el:books)
            if (el.getYear()<year)
                tempBooks.add(el);
        Comparator <Book> compName = Comparator.comparing(book->book.getName());
        Collections.sort(tempBooks,compName);
        print(tempBooks);
    }
    static void print (ArrayList<Book> books){
        for(Book book:books)
            System.out.println(book);
    }


}
class Book {
    private  int id;
    private String name;
    private int  year;
    static int count;

    static {
        count=0;
    }
    public Book( String name, int year){
        this.id=count;
        this.name=name;
        this.year=year;
        count++;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
