package Lambda;

public class Lambda {

    public static void main(String[] args) {
        Operationable oper = new Operationable (){
           @Override
           public int calculate (int x, int y){
               return x+y;
           }
        };
        //Operationable operation = (x, y) -> x + y;
       // int result = operation.calculate(10, 20);
        int result = oper.calculate(3,5);
        System.out.println(result); //30
        System.out.println(new Operationable() {
            @Override
            public int calculate(int x, int y) {
                return x+y;
            }
        }.calculate(3,5));

    }
}
interface Operationable {
    int calculate(int x, int y);
}

