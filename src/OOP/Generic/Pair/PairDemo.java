package OOP.Generic.Pair;

public class PairDemo {
    public static void main(String[] args) {
        Pair<Integer,String> pire = new Pair<>(1,"abc");
        System.out.println(pire.getFirst());
        System.out.println(pire.getSecond());

    }
}
class Pair<T,U>{
    private T first;
    private U second;
    public Pair (T first, U second){
        this.first = first;
        this.second = second;

    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }
}
