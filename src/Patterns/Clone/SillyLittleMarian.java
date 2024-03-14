package Patterns.Clone;

public class SillyLittleMarian {
    public static void main(String[] args) {
        Girl marian = new Girl("Marian");
        System.out.println(marian);
         //новый объект
        Girl noMarian = (Girl)marian.clone();
        noMarian.setName("noMarian");
        noMarian.setLazy(false);
        noMarian.setSilly(false);
        System.out.println(noMarian);

    }
}
class Girl implements Cloneable{
    private  String name;
    private boolean silly = true;
    private boolean lazy = true;
    private boolean little = true;

    public Girl(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isSilly() {
        return silly;
    }

    public boolean isLazy() {
        return lazy;
    }

    public boolean isLittle() {
        return little;
    }

    public Girl setName(String name) {
        this.name = name;
        return this;
    }

    public Girl setSilly(boolean silly) {
        this.silly = silly;
        return this;
    }

    public Girl setLazy(boolean lazy) {
        this.lazy = lazy;
        return this;
    }

    public Girl setLittle(boolean little) {
        this.little = little;
        return this;
    }

    @Override
    public Girl clone() {
        try {
            Girl clone = (Girl) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' +
                ", silly=" + silly +
                ", lazy=" + lazy +
                ", little=" + little +
                '}';
    }
}
