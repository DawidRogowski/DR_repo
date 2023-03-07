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

    @Test
    public void methods (){
    " ".charAt(0);
    }
    @Test
     public void checkCharAt() {
        String name = "I'm trying as best as I can";
        char firstLetter = name.charAt(0);
        assertEquals(name.charAt(0), firstLetter);
        System.out.println(name);
        System.out.println("Our first letter in this String is  " +firstLetter );
    }
}
