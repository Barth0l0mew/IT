package Annotation.Sample1;

import org.checkerframework.checker.nullness.qual.NonNull;

import java.lang.annotation.*;
import java.lang.reflect.Field;
import java.util.Arrays;

public class BookDemo{
    public static void main(String[] args) {

        Book book = new Book("title","author",2010,-10);
        BookProcessor bookProcessor = new BookProcessor(book);
        bookProcessor.print();
       // bookProcessor.checkNoNNull();
        bookProcessor.checkPage();
    }
        }
@BookAnnotation ("short")
class Book {
    @NoNNull
    public String title;
    @NoNNull
    public String author;
    public int year;
    @IntPositiv
    public int pages;

    public Book(String title, String author, int year, int pages) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.pages = pages;
    }

    public void printShort() {
        System.out.println("Title: " + title + ", author:" + author);
    }

    public void printLong() {
        System.out.println("Title: " + title + ", author:" + author + ", year" + year);
    }
}
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface BookAnnotation{
    public String value();

}
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface NoNNull{

}
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.FIELD)
@interface IntPositiv{

}
class BookProcessor {
    private Book book;
    public BookProcessor (Book book){
        this.book=book;
    }
    public void print (){
       Class clazz = Book.class;
       //получаем информацию об аннотации
        Annotation annotation = clazz.getAnnotation(BookAnnotation.class);
        System.out.println(annotation);
        if (annotation instanceof BookAnnotation){
             if (((BookAnnotation) annotation).value().equals("short")){
                 book.printShort();
             }
            if (((BookAnnotation) annotation).value().equals("long")){
                book.printLong();
            }
        }
        Annotation[] annotations = clazz.getAnnotations();
        System.out.println(Arrays.toString(annotations));
    }
    public void checkNoNNull (){
        Field[] fields = book.getClass().getDeclaredFields();
        for (Field field: fields){
            Annotation annotation = field.getAnnotation(NoNNull.class);
            try {

                if (annotation!=null&&field.get(book)==null)
                    System.err.println("Field = "+ field.getName()+ " cannot be null");
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void checkPage(){
        Field[] fields = book.getClass().getDeclaredFields();
        for (Field field: fields){
            Annotation annotation = field.getAnnotation(IntPositiv.class);
            try {
                System.out.println(field.get(book) instanceof Integer);
                System.out.println(annotation!=null);
                if ((field.get(book) instanceof Integer)&&((int)field.get(book)<0)) {
                    System.err.println("Field = "+ field.getName()+ " cannot be positive");
                    throw new RuntimeException("Exeption");

                    }
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
    }

}

