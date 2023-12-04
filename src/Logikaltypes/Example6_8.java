package Logikaltypes;

public class Example6_8 {
    public static void main(String[] args) {
        //Example 6
        int number = 10;
        if (number > 0)
            System.out.println("The number is positive.");
        else
            System.out.println("The number is not positive.");
        System.out.println("Statement is not inside if...else block");

        //Example 7
        Double n1 = -1.0, n2 = 4.5, n3 = -5.3, largest;
        if (n1 >= n2) {
            if (n1 >= n3) {
                largest = n1;
            }
            else {
                largest = n3;
            }
        } else {
            if (n2 >= n3) {
                largest = n2;
            }
            else {
                largest = n3;
            }
        }
        System.out.println("Largest Number: " + largest);

        //Example 8
//        String str = """
//         itstep.by
//         """;
        String str = "itstep.by";
        String str2 = "itstep.by";
        int i = 5;
        if (i == 4)
            i++;
        System.out.println(str.equals(str2));
        System.out.println("i = " + i);
    }
}
