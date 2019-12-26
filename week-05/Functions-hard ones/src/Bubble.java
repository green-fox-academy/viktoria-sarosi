import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Bubble {
    public static void main(String[] args) {
        //  Create a function that takes a list of numbers as parameter
        //  Returns a list where the elements are sorted in ascending numerical order
        //  Make a second boolean parameter, if it's `true` sort that list descending

        //  Example:
        //System.out.println(bubble(new int[] {34, 12, 24, 9, 5}));
        //  should print [5, 9, 12, 24, 34]
        //System.out.println(advancedBubble(new int[] {34, 12, 24, 9, 5}, true));
        //  should print [34, 24, 12, 9, 5]

        ArrayList<Integer> first = new ArrayList<Integer>(Arrays.asList(34, 12, 24, 9, 5, 13, 1));
        System.out.println(bubble(first));
        System.out.println(advancedBubble(first, true));
    }

    private static ArrayList<Integer> advancedBubble(ArrayList<Integer> first, boolean well) {
        if (well) {
            Collections.sort(first, Collections.reverseOrder());
            return first;
        } else {
            Collections.sort(first);
            return first;
        }
    }

    private static ArrayList<Integer> bubble(ArrayList<Integer> first) {
        Collections.sort(first);
        return first;
    }
}
