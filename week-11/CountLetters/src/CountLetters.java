import java.util.HashMap;

public class CountLetters {
    public static void main(String[] args) {
        String word = "ezatesztszöveg";
        String emptyString = "";
        String nonExistingWord = null;
        try {
            System.out.println(countTheLetters(word));
            System.out.println(countTheLetters(nonExistingWord));
        } catch (EmptyStringException e) {
            System.out.println(e.getMessage());
        } catch (TheWordDoesNotExistException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(countTheLetters(emptyString));
        } catch (EmptyStringException e) {
            System.out.println(e.getMessage());
        } catch (TheWordDoesNotExistException e) {
            System.out.println(e.getMessage());
        }

    }

    public static HashMap<String, Integer> countTheLetters(String word) throws EmptyStringException, TheWordDoesNotExistException {
        if (word == null) {
            throw new TheWordDoesNotExistException();
        }
        if (word.length() == 0) {
            throw new EmptyStringException();
        } else {
            String lowerWord = word.toLowerCase();
            String[] splittedWord = lowerWord.split("");
            HashMap<String, Integer> countedLetters = new HashMap<>();
            for (int i = 0; i < splittedWord.length; i++) {
                if (!countedLetters.containsKey(splittedWord[i])) {
                    countedLetters.put(splittedWord[i], 1);
                } else {
                    countedLetters.replace(splittedWord[i], countedLetters.get(splittedWord[i]) + 1);
                }
            }
            return countedLetters;
        }
    }
}
