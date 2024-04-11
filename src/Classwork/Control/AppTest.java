package Classwork.Control;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {
@Test
     public void testCalcOne() {
        System.out.println("======TEST ONE EXECUTED=======");
    int result1 = Control.getResult(2,2);
    Assertions.assertEquals(4, result1);
    int result2 = Control.getResult(3,2);
    Assertions.assertEquals(9, result2);
    int result3 = Control.getResult(3,4);
    Assertions.assertEquals(1, result3);
        int result4 = Control.getResult(5,15);
        Assertions.assertEquals(5, result4);
    int result5 = Control.getResult(10,1000000);
    Assertions.assertEquals(1, result5);
    }
}
