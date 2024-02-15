package OOP.ShopQueue;

import java.util.*;

public class ShopQueue {
    public static void main(String[] args) {
        /*
//Очередь в магазин. Каждый покупатель имеет корзину,
 в каждой корзине набор товаров определенной цены.
//После обслуживания покупателя сумма в кассе увеличивается.
//Без очереди обслуживаются ветераны, затем дети до 10 лет
         */
    Product water = new Product("water",2.10);
    Product bread = new Product("bread",2.70);
    Product eag = new Product("eag",1.10);
    Product reace = new Product("reace",1.40);

    Customer customer1 = new Customer(TypeCustomer.REGULAR);
        customer1.basket.add(water);
        customer1.basket.add(eag);
        customer1.basket.add(reace);
    Customer customer2 = new Customer(TypeCustomer.VETERAN);
        customer2.basket.add(eag);
        customer2.basket.add(reace);
    Customer customer3 = new Customer(TypeCustomer.CHILD);
        customer3.basket.add(bread);
        customer3.basket.add(water);
        customer3.basket.add(reace);
    Queue<Customer> queue = new PriorityQueue<>();
    queue.add(customer1);
    queue.add(customer2);
    queue.add(customer3);
        Seller seller = new Seller();
        double sum =0;
        Comparator<Customer> compType =Comparator.comparing(el->el.type.ordinal()) ;

    while (!queue.isEmpty()){

        Customer customer = queue.poll();
        System.out.println(customer);
        sum+=seller.calcSum(customer);
        System.out.println(customer.type+" " +seller.calcSum(customer));

    }
        System.out.println("Total: ="+sum);
    }
}
enum TypeCustomer{
    VETERAN, CHILD, REGULAR;
}
class Product{
    String name;
    double price;
    Product(String name, double price){

        this.name  = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

class Customer implements Comparable {
    public TypeCustomer type;
    public List<Product> basket = new ArrayList<>();
    public Customer(TypeCustomer type){
        this.type=type;
    }
    @Override
    public int compareTo(Object o) {
        int index1 = this.type.ordinal();
        int index2 = ((Customer)o).type.ordinal();// привидение типа (type cast)
        return index1-index2;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "type=" + type +
                ", basket=" + basket +
                '}';
    }
}
class Seller {
    public double calcSum (Customer customer){
        double sum = customer.basket.stream().mapToDouble(p->p.price).sum();
        return sum;
    }
}

