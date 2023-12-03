package Homework.Homework5;

public class Task4_11 {
    /*
    Даны объемы и массы двух тел из разных материалов. Материал какого из тел
имеет большую плотность?
     */
    public static void main(String[] args) {
        double m1=23,m2=13,v1=63,v2=82;
        if ((m1/v1)>(m2/v2))
            System.out.println("Плотность больше у 1");
        else
            System.out.println("Плотность больше у 2");

    }
}
