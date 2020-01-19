import org.junit.Test;

import static org.junit.Assert.*;

public class WordReverserTest {
    private String testString;

    @Test
    public void reverse_should_returnReversedInput() throws EmptyStringException {
        testString = "Szép kutyád van";
        String expectedResult = "pézS dáytuk nav";

        String result = WordReverser.reverse(testString);

        assertEquals(expectedResult, result);
    }


    @Test(expected = EmptyStringException.class)
    public void reverse_should_throwEmptyStringException_whenEmptyStringIsGiven() throws EmptyStringException {
        testString = "";
        WordReverser.reverse(testString);
    }

}