package Homework.Homework19.Composite;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

/*
Разработать приложение, выводящее список товаров мебельного магазина, отсортированного по цене.
У каждого товара должны быть заданы: категория, название, артикул (уникальный код) и цена.
Для мебели в категории «шкафы» необходимо дополнительно указывать тип дверей (обычные,
купе, стеклянные). Для мебели категории «стол» необходимо указывать количество выдвижных ящиков.
Для мебели категории «стул» необходимо указывать наличие спинки. Кроме продажи отдельных предметов
мебели в магазине могут продаваться наборы со скидкой 5% от общей стоимости всех предметов мебели
этого набора.
 Подсчёт стоимости набора мебели организовать через шаблон проектирования «Composite».
 */
public class Price {
    public static void main(String[] args) {
        Product closet = new Closet(1,"Closet", CategoryProduct.CLOSET, 1234,DoorType.COUPE);
        Product table = new Table(6,"Table", CategoryProduct.TABlE, 125,3);
        Product chair = new Chair(3,"Chair", CategoryProduct.CHAIR, 1000,true);

        System.out.println(closet);
        System.out.println(table);
        System.out.println(chair);
        Group group = new Group();
        Group group2 = new Group();
        Group group3 = new Group();
        Group group4 = new Group();
        group.Add(closet);
        group.Add(closet);

        group2.Add(table);
        group2.Add(table);
        group2.Add(chair);
        group4.Add(closet);
        group3.Add(group4);
        group3.Add(group);
        group3.Add(group2);
       // group3.Add(closet);

        group3.Sum();
       // System.out.println(group3.Sum());
        group3.print();
    }
}
interface SumCost {
    double Sum ();
    void print();
}

enum DoorType {NORMAL,COUPE, Glasses}
enum CategoryProduct {CLOSET,TABlE,CHAIR}
abstract class Product implements SumCost{
    public int id;
    public String productName;
    public CategoryProduct categoryProduct;
    public int cost;

}
class Chair extends Product{
    private boolean isBackChair = false;
    public Chair(int id, String productName, CategoryProduct categoryProduct, int cost, boolean isBackChair){
        this.id=id;
        this.productName=productName;
        this.categoryProduct = categoryProduct;
        this.isBackChair = isBackChair;
        this.cost=cost;

    }
    @Override
    public double Sum() {
        System.out.println(this.productName +" " +this.cost);
        return this.cost;
    }

    @Override
    public void print() {
        System.out.println(this.productName);
    }

    @Override
    public String toString() {
        return "Chair{" +
                "isBackChair=" + isBackChair +
                ", id=" + id +
                ", productName='" + productName + '\'' +
                ", categoryProduct=" + categoryProduct +
                ", cost=" + cost +
                '}';
    }
}
class Table extends Product{
    private int countBox=0;
    public Table(int id, String productName, CategoryProduct categoryProduct, int cost, int countBox){
        this.id=id;
        this.productName=productName;
        this.categoryProduct = categoryProduct;
        this.countBox= countBox ;
        this.cost=cost;

    }
    @Override
    public double Sum() {
        System.out.println(this.productName +" " +this.cost);
        return this.cost;
    }

    @Override
    public void print() {
        System.out.println(this.productName);

    }

    @Override
    public String toString() {
        return "Table{" +
                "countBox=" + countBox +
                ", id=" + id +
                ", productName='" + productName + '\'' +
                ", categoryProduct=" + categoryProduct +
                ", cost=" + cost +
                '}';
    }
}
class Closet extends Product{
    private DoorType doorType;
    public Closet(int id, String productName, CategoryProduct categoryProduct, int cost, DoorType doorType){
        this.id=id;
        this.productName=productName;
        this.categoryProduct = categoryProduct;
        this.doorType= doorType;
        this.cost=cost;

    }

    @Override
    public String toString() {
        return "Closet{" +
                "doorType=" + doorType +
                ", id=" + id +
                ", productName='" + productName + '\'' +
                ", categoryProduct=" + categoryProduct +
                ", cost=" + cost +
                '}';
    }

    @Override
    public double Sum() {
        System.out.println(this.productName +" " +this.cost);
        return this.cost;
    }

    @Override
    public void print() {
        System.out.println(this.productName);

    }
}
interface TotalSum {
    int total (Product product);
}
class Group extends Product{
    private int totalSum=0;
    public List<Product> list = new ArrayList<Product>();
    public void Add (Product product){
        list.add(product);
    }
    @Override
    public void print(){
        Comparator<Product> compProduct = Comparator.comparing(obj->obj.hashCode());
        Collections.sort(list,compProduct);
       // System.out.println("------Group------");
        for (Product el: list) {
            //System.out.println("-----");
            if (el instanceof Group)
                System.out.println("----Group----");
            el.print();

        }
            //System.out.println(el.print());

    }

    @Override
    public double Sum() {
//        System.out.println("----Group----");
        int sum=0;
    for (int i=0;i< list.size();i++){
        if (list.get(i) instanceof Group) {
            sum = 0;
            System.out.println("----Group----");

        }
        sum+=list.get(i).Sum();
       // if (i==list.size()-1)
        //System.out.println("Total cost group "+sum*0.95);
        if (list.get(i) instanceof Group) {
            //System.out.println(((Group) list.get(i)).list.size());
            if (((Group) list.get(i)).list.size()==1)
                System.out.println("Total cost group "+sum);
            else
                System.out.println("Total cost group "+sum*0.95);
        }

    }

    return sum;
    }
}