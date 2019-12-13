import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {
    private String FirstWord;
    private String SecondWord;

    @Test
    public void isThisAnAnagram_should_compare_when_twoWordsAreGiven() throws AtLeastOneOfTheWordsIsMissingException {
        FirstWord = "asdfg";
        SecondWord = "ahgfd";

        boolean result = Anagram.isThisAnAnagram(FirstWord, SecondWord);

        assertFalse(result);
    }

    @Test
    public void isThisAnAnagram_should_returnFalse_when_one_StringIsLonger() throws AtLeastOneOfTheWordsIsMissingException {
        FirstWord = "asdf";
        SecondWord = "asd";

        boolean result = Anagram.isThisAnAnagram(FirstWord, SecondWord);

        assertFalse(result);
    }

    @Test(expected = AtLeastOneOfTheWordsIsMissingException.class)
    public void isThisAnAnagram_should_throwAtLeastOneOfTheWordsIsMissingException_when_there_is_no_two_words() throws AtLeastOneOfTheWordsIsMissingException {
        FirstWord = "uztr";

        Anagram.isThisAnAnagram(FirstWord, null);
    }
}