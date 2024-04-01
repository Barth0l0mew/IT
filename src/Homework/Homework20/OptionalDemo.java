package Homework.Homework20;


public class OptionalDemo {
    public static void main(String[] args) {
        OptionalGeneric<Integer,String> og = OptionalGeneric.of(1,"abs");
        System.out.println(og);
        System.out.println(og.getFirst()+"   "+og.getSecond());
        OptionalGeneric<String,String> og2= OptionalGeneric.empty();
        System.out.println(og2);
        OptionalGeneric<String,String> og3= OptionalGeneric.of(null,null);
        System.out.println(og3);
        OptionalGeneric<Long,String> og4 = OptionalGeneric.of(1L,"abs");
        System.out.println(og4);
        OptionalGeneric.of(1L,"new").ifPresent((k,v)-> System.out.println("Object first="+k.toString()+"\nObject second="+v.toString()));
    }
}
