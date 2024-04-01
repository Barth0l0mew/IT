package Homework.Homework20;

import java.util.Objects;
import java.util.function.BiConsumer;

public class OptionalGeneric <T,U> {
    private T first;
    private U second;
    private OptionalGeneric (T first, U second){
        this.first=first;
        this.second=second;
    }
    public static<T,U> OptionalGeneric of (T first, U second){
        return new OptionalGeneric<>(first,second);
    }
    public static<T,U> OptionalGeneric empty (){
        return new OptionalGeneric<>(null,null);
    }
    public <T,U> void ifPresent (BiConsumer<T,U> consumer){
        if (first!=null && second!=null){
            consumer.accept((T)first, (U)second);
        }
    }

    @Override
    public String toString() {
        return "OptionalGeneric{" +
                "first=" + first + " class="+(first!=null?first.getClass():null)+
                ", second=" + second + " class="+(second!=null?second.getClass():null)+
                '}';
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OptionalGeneric<?, ?> that = (OptionalGeneric<?, ?>) o;
        return Objects.equals(first, that.first) && Objects.equals(second, that.second);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }
}
