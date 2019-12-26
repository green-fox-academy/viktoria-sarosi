import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String first = "esernyő";
        String second = "seerőni";
        System.out.println(isAnagram(first, second));
    }

    private static boolean isAnagram(String first, String second) {
        if (first.length() != second.length()) {
            return false;
        } else {
            char[] firstArray = first.toCharArray();
            char[] secondArray = second.toCharArray();
            Arrays.sort(firstArray);
            Arrays.sort(secondArray);
            String firstChar = Arrays.toString(firstArray);
            String secondChar = Arrays.toString(secondArray);
            return (firstChar.equals(secondChar));
        }
    }
}

