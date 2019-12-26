import java.util.ArrayList;
import java.util.Arrays;

public class Unique {
    public static void main(String[] args) {
        //  Create a function that takes a list of numbers as a parameter
        //  Returns a list of numbers where every number in the list occurs only once

        //  Example
        ArrayList<Integer> ints = new ArrayList<Integer>(Arrays.asList(1, 11, 34, 11, 52, 61, 1, 34));
        System.out.println(unique(ints));
        //  should print: `[1, 11, 34, 52, 61]`
    }

    private static ArrayList<Integer> unique(ArrayList<Integer> ints) {
        ArrayList<Integer> second = new ArrayList<Integer>();
        for (int i = 0; i < ints.size(); i++) {
            if (!second.contains(ints.get(i))) {
                second.add(ints.get(i));
            }
        }
        return second;
    }
}
