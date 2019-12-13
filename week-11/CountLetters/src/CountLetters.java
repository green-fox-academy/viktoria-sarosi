import java.util.HashMap;

public class CountLetters {
    public static void main(String[] args) {
        String word = "hárombokorsalátakisangyalom";
        System.out.println(countTheLetters(word));
    }

    public static HashMap<String, Integer> countTheLetters(String word) {
        String[] splittedWord = word.split("");
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
