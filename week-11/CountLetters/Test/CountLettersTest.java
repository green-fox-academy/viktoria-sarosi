import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class CountLettersTest {
    private String testWord;

    @Test
    public void countTheLetters_should_returnHashMap_when_wordIsGiven() throws EmptyStringException, TheWordDoesNotExistException {
        testWord = "ezatesztszo";
        HashMap<String, Integer> expectedResult = new HashMap<String, Integer>() {{
            put("e", 2);
            put("z", 3);
            put("a", 1);
            put("t", 2);
            put("s", 2);
            put("o", 1);
        }};

        HashMap<String, Integer> result = CountLetters.countTheLetters(testWord);

        assertEquals(expectedResult, result);
    }

    @Test
    public void countTheLetters_should_returnCorrectHashMap_when_upperCaseLettersAreAlsoGiven() throws EmptyStringException, TheWordDoesNotExistException {
        testWord = "ezAtesZtszo";
        HashMap<String, Integer> expectedResult = new HashMap<String, Integer>() {{
            put("e", 2);
            put("z", 3);
            put("a", 1);
            put("t", 2);
            put("s", 2);
            put("o", 1);
        }};

        HashMap<String, Integer> result = CountLetters.countTheLetters(testWord);

        assertEquals(expectedResult, result);
    }

    @Test(expected = EmptyStringException.class)
    public void countTheLetters_should_throwEmptyStringException_whenEmptyStringIsGiven() throws EmptyStringException, TheWordDoesNotExistException {
        testWord = "";

        CountLetters.countTheLetters(testWord);
    }

    @Test(expected = TheWordDoesNotExistException.class)
    public void countTheLetters_should_throwTheWordDoesNotExistException_whenWordDoesNotExist() throws EmptyStringException, TheWordDoesNotExistException {
        CountLetters.countTheLetters(null);
    }
}