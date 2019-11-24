import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class QuoteSwap {
    public static void main(String... args){
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

        // Accidentally I messed up this quote from Richard Feynman.
        // Two words are out of place
        // Your task is to fix it by swapping the right words with code
        // Create a method called quoteSwap().

        // Also, print the sentence to the output with spaces in between.
        quoteSwap(list);
        // Expected output: "What I cannot create I do not understand.
    }

    private static void quoteSwap(ArrayList<String> list) {
        String a = list.get(2);
        String b = list.get(5);
        list.remove(2);
        list.remove(4);
        list.add(2, b);
        list.add(5, a);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
