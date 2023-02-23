package pl.rogowski;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;
public class Tests {

   @Test
    public void testAssertion() {
        int number1 = 10;
        int number2 = 110;
        int result = number2+number1;
        assertEquals(120, result);
       System.out.println(result);
    }
}
