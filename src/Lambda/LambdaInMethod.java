package Lambda;


interface Condition {
    boolean isAppropriate(int n);
}

public class LambdaInMethod {
    private static int sum(int[] numbers, Condition condition) {
       int sum =0;
//       for (int i=0; i<numbers.length;i++){
           for (int el:numbers){
           if (condition.isAppropriate(el)){
                sum+=el;
           }
       }
       return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4,-5};
        System.out.println(LambdaInMethod.sum(arr,x->x%2==0));
    }
}


