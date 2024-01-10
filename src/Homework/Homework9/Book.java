package Homework.Homework9;

import java.util.Date;

class Book {
    private Date current = new Date ();

    //Объявление полей для объектов книг
    private int id;
    private String name;
    private int year;
    private String author;
    private String title;
    private int price = 0;
    //Объявление статической переменной для класса BOOK
    private static int count;

    // блок инитиализации
    static {
        count = 0;
    }

    public Book(String name, int year, String author, String title, int price) {
        this.id = count;
        this.name = name;
        this.year = year;
        this.author = author;
        this.title = title;
        this.price = price;
        count++;
    }

    public Book(String name, int year, String title, int price) {
        this.id = count;
        this.name = name;
        this.year = year;
        this.author = "UNKNOWN";
        this.title = title;
        this.price = price;
        count++;
    }

    public Book(String name, int year, int price) {
        this.id = count;
        this.name = name;
        this.year = year;
        this.author = "No Author";
        this.title = "No Title";
        this.price = price;
        count++;
    }

    public Book(String name, int price) {
        this.id = count;
        this.name = name;
        this.year =2024;
        this.author = "No Author";
        this.title = "No Title";
        this.price = price;
        count++;
    }

    public Book(String name) {
        this.id = count;
        this.name = name;
        this.year = 2024;
        this.author = "No Author";
        this.title = "No Title";

        count++;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getYear() {
        return this.year;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getTitle() {
        return this.title;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", price=" + price +
                '}';
    }

}
