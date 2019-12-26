import java.util.ArrayList;

public class SubInt {
    public static void main(String[] args) {
        //  Create a function that takes a number and an array of integers as a parameter
        //  Returns the indices of the integers in the array of which the first number is a part of
        //  Or returns an empty array if the number is not part of any of the integers in the array

        //  Example:
        //System.out.println(subInt(1, new int[] {1, 11, 34, 52, 61}));
        //  should print: `[0, 1, 4]`
        //System.out.println(subInt(9, new int[] {1, 11, 34, 52, 61}));
        //  should print: '[]'
        int n = 1;
        int[] numbers = new int[]{1, 11, 34, 52, 61};
        System.out.println(subIntFinder(n, numbers));

    }

    private static ArrayList subIntFinder(int n, int[] numbers) {
        String nu = String.valueOf(n); //stringgé alakitja a számot
        CharSequence nunu = ((CharSequence) nu); //characterré alakitja  a stringet
        String[] newnumbers = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            String a = String.valueOf(numbers[i]); // stringgé alakitja az arrayben lévő számokat
            newnumbers[i] = a; //bepakolja az üres array-be
        }
        ArrayList<Integer> indices = new ArrayList<>();
        for (int i = 0; i < newnumbers.length; i++) {
            if (newnumbers[i].contains(nunu)) {
                indices.add(i);
            }
        }
        return indices;
    }
}

