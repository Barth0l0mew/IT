package Homework.Homework15;

import OOP.Students.Students;

import java.util.Random;

public class Customer implements Comparable<Customer>{
    private int id;
    private String name;
    private String firstName;
    private String secondName;
    private String phone = "-";
    private String numberCard;
    private String numberAccount;
    private static int count;

    static {
        count = 0;
    }

    public Customer(String name, String firstName) {
        this.id = count;
        this.name = name;
        this.firstName = firstName;
        this.secondName = "-";
        this.numberCard = generateNumberCard();
        this.numberAccount = generateNumberAccount();
        count++;
    }

    public Customer(String name, String firstName, String secondName) {
        this.id = count;
        this.name = name;
        this.firstName = firstName;
        this.secondName = secondName;
        this.numberCard = generateNumberCard();
        this.numberAccount = generateNumberAccount();
        count++;
    }

    public Customer(String name, String firstName, String secondName, String phone) {
        this.id = count;
        this.name = name;
        this.firstName = firstName;
        this.secondName = secondName;
        this.phone = phone;
        this.numberCard = generateNumberCard();
        this.numberAccount = generateNumberAccount();
        count++;
    }

    private static String generateNumberCard() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 9; i++) {
            sb.append(random.nextInt(10));
        }
        return sb.toString();
    }

    private static String generateNumberAccount() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 7; i++)
            sb.append(random.nextInt(10));
        return "BY" + sb.toString();
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", numberCard='" + numberCard + '\'' +
                ", numberAccount='" + numberAccount + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getPhone() {
        return phone;
    }

    public String getNumberCard() {
        return numberCard;
    }

    public String getNumberAccount() {
        return numberAccount;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public int compareTo(Customer o) {
        System.out.println("CompareTo");
        return this.getFirstName().compareTo(o.getFirstName());
        //return 0;
    }
}
