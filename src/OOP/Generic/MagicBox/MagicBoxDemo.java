package OOP.Generic.MagicBox;

import java.util.ArrayList;
import java.util.Arrays;

public class MagicBoxDemo {
    public static void main(String[] args) {
    MagicBox magicBox = new MagicBox();
    magicBox.setObject(1);
        System.out.println(magicBox.getObject());
        System.out.println(magicBox.getObject().getClass());
    magicBox.setObject("abc");
        System.out.println(magicBox.getObject());
        System.out.println(magicBox.getObject().getClass());
    magicBox.setObject(new ArrayList<String>(Arrays.asList("focus","pocus")));
        System.out.println(magicBox.getObject());
        System.out.println(magicBox.getObject().getClass());
        magicBox.setObject(new MagicBox());
        System.out.println(magicBox.getObject());
        System.out.println(magicBox.getObject().getClass());
        Object object = magicBox.getObject();
        System.out.println(object.getClass());
        Class <?> clazz = magicBox.getObject().getClass();
        System.out.println(clazz.descriptorString());

        MagicBoxGeneric<Integer>  magicBoxGeneric = new MagicBoxGeneric<>();
        magicBoxGeneric.setObject(1);
        System.out.println(magicBoxGeneric.getObject());
        MagicBoxGeneric<MagicBoxGeneric<Integer>> MMI = new MagicBoxGeneric<>();
        MMI.setObject(new MagicBoxGeneric<Integer>().setObject(10));
        System.out.println(MMI.getObject().getObject());
        MagicBoxGeneric<Integer> MI = new MagicBoxGeneric<>();
        MI.setObject(2);
        MMI.setObject(MI);
        System.out.println(MMI.getObject().getObject());

    }

}
class MagicBox {
    //Контейнер
    private Object object;

    public Object getObject() {
        return object;
    }

    public MagicBox setObject(Object object) {
        this.object = object;
        return this;
    }

    @Override
    public String toString() {
        return "MagicBox{" +
                "object=" + object +
                '}';
    }
}
class MagicBoxGeneric <T> {//параметризованный класс
    //Коробка с произвольным типом
    private T object;

    public T getObject() {
        return object;
    }

    public MagicBoxGeneric<T> setObject(T object) {
        this.object = object;
        return this;
    }

    @Override
    public String toString() {
        return "MagicBoxGeneric{" +
                "object=" + object +
                '}';
    }
}

