package OOP.Generic.MagicBoxBounded;

public class MagicBoxBounded {
    public static void main(String[] args) {
MagicBoxBoundedGeneric<Animal> mb = new MagicBoxBoundedGeneric<>(new Bird());
//wildcard
  MagicBoxBoundedGeneric<?> mb2 = new MagicBoxBoundedGeneric<>(new Bird());
        MagicBoxBoundedGeneric<?> mb3 = new MagicBoxBoundedGeneric<>(new Cat());
  //upper bounded
        MagicBoxBoundedGeneric<? extends Pigeon> mb4= new MagicBoxBoundedGeneric<>(new Pigeon());
  //lower bounded
        MagicBoxBoundedGeneric<? super Bird> mb5= new MagicBoxBoundedGeneric<>(new Pigeon());
    }
}
class MagicBoxBoundedGeneric<T>{
    private T obj;

    public MagicBoxBoundedGeneric(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }
}
