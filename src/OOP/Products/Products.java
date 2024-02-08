package OOP.Products;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Products {
    public static void main(String[] args) {
        House house = new House();
        house.sell();
        Refrigerator refrigerator = new Refrigerator(100,500);
        refrigerator.sell();
        List<Product> products = new ArrayList<>();
        products.add(house);
        products.add(refrigerator);
        for (Product prd:products)
            System.out.println(prd.toString());
        //Comparator<Product> compPrice = Comparator.comparing(product -> product);
        List<Sellable> productSell = new ArrayList<>();
        productSell.add(house);
        productSell.add(refrigerator);
        Comparator<Sellable> compSell = Comparator.comparing(product->product.getPrice());
        Collections.sort(productSell,compSell);
        for (Product prd:products)
            System.out.println(prd.toString());
    }
}
abstract class Product {
    protected String name;
    public abstract void sell();
}
interface Sellable {
    public int getPrice();

}
interface Transportable {
    public double getWight();
}
class Refrigerator extends Product implements Sellable, Transportable {
    private int price;
    private double weight;

    public Refrigerator(int price, double weight) {
        this.price = price;
        this.weight = weight;
    }

    @Override
    public void sell() {
        System.out.println("The refrigeration is sold");
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public double getWight() {
        return weight;
    }
}
class House extends Product implements Sellable{

    @Override
    public void sell() {
        System.out.println("The hous is sold");
    }

    @Override
    public int getPrice() {
        return 0;
    }
}

