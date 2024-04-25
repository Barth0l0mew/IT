package Lambda;

public class LambdaInterfeis implements Example {
    public static void main(String[] args) {
        //  new LambdaInterfeis().show();
           /*
           1 способ вызов без наслеования интерфейса
            new Example() {
                @Override
                public int process(int a) {
                    return 0;
                }
            }.show();
            */
       /*  2 способ
       ((Example) a->0).show();

        */
        /* 3 способ с наследуемым интерфесам
new LambdaInterfeis().show();
         */

    }


    @Override
    public int process(int a) {
        return 0;
    }
}
interface Example {
    int process(int a);
    default void show() {
        System.out.println("default show()");
    }
}
