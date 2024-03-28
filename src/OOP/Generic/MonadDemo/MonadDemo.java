package OOP.Generic.MonadDemo;

import java.util.function.Function;

public class MonadDemo {
    public static void main(String[] args) {
    Monad<Integer> x = new Monad<>(1);
    Monad<Integer> y = x.bind(v->new Monad<>(v*2));
    Monad<Double> z = y.bind(v->new Monad<>(v.doubleValue()*3.0));
        System.out.println(x.getObj());
        System.out.println(y.getObj());
        System.out.println(z.getObj());
    }
}

interface IMonad<T>{
    <U> IMonad<U> bind(Function<T,Monad<U>> f);
}

class Monad<T> implements IMonad<T>{
    private T obj;

    public Monad(T obj) {
        this.obj = obj;
    }


    @Override
    public <U> Monad<U> bind(Function<T, Monad<U>> f) {
        if (obj == null)
            return new Monad<U>(null);
        return f.apply(obj);
    }

    public T getObj() {
        return obj;
    }

    public Monad<T> setObj(T obj) {
        this.obj = obj;
        return this;
    }
}