package Homework.Homework5;

public class Task4_12 {
    /*
    Известны сопротивления двух несоединенных друг с другом участков электрической цепи и напряжение на каждом из них. По какому участку протекает
меньший ток?
     */
    public static void main(String[] args) {
        double r1=50,r2=65;
        if (r1>r2)
            System.out.println("меньший ток протикает в цепи 1");
        else
            System.out.println("меньший ток протикает в цепи 2");
    }
}
