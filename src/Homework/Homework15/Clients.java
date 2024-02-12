package Homework.Homework15;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
2. Customer: id, Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки,
Номер банковского счета.
Создать массив объектов. Вывести:
a) список покупателей в алфавитном порядке;
b) список покупателей, у которых номер кредитной карточки находится
в заданном интервале
 */
public class Clients {
    public static void main(String[] args) {
        List<Customer> customer= new ArrayList<>();
        customer.add(new Customer("Ivan","Ivanov","Ivanovich"));
        customer.add(new Customer("Jon","Smith"));
        customer.add(new Customer("Jan","Richard"));
        customer.add(new Customer("Sun","Fracle"));
        System.out.println("--------------CustomBD-------------");
        print(customer);
        System.out.println("-----------------SortFerstName-----------------");
        sort(customer);
        System.out.println("-----------------SortName-----------------");
        sort2(customer);
        System.out.println("----------------FoundNumberCard----------");
        foundNumberCard(customer,"[4-6]\\d{8}");
    }
    public static void print (List<Customer> customer){
        for (Customer el:customer)
            System.out.println(el);
    }
    public  static void sort (List<Customer> customer){
        List<Customer> tempList = new ArrayList<>(customer);
        Comparator<Customer> compFirstName=Comparator.comparing(obj->obj.getFirstName());
        Collections.sort(tempList,compFirstName);
        print(tempList);
    }
    public  static void sort2 (List<Customer> customer){
        List<Customer> tempList = new ArrayList<>(customer);
        Comparator<Customer> compName=Comparator.comparing(obj->obj.getName());
        Collections.sort(tempList,compName);
        print(tempList);
    }
    public static void foundNumberCard(List<Customer> customer, String regx){
        int count=0;
        Pattern pt = Pattern.compile(regx);
        Matcher mt;
        for (Customer el:customer){
            mt=pt.matcher(el.getNumberCard());
            if (mt.matches()) {
                System.out.println(el);
                count++;
            }
        }
        if (count==0)
            System.out.println("Not found");
    }
}

