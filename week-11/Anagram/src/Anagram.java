import java.util.Arrays;
import java.util.Collections;

public class Anagram {
    public static void main(String[] args) {
        String first = "terhgejn";
        String second = "etrhecjn";
        System.out.println(isThisAnAnagram(first, second));

    }
        public static boolean isThisAnAnagram (String first, String second){
            first.toLowerCase();
            second.toLowerCase();
            char[] firstChar = first.toCharArray();
            char[] secondChar = second.toCharArray();
            if (!(firstChar.length == secondChar.length)) {
                System.out.println("For sure not anagrams because one of them is longer.");
                return false;
            }
            Arrays.sort(firstChar);
            Arrays.sort(secondChar);
            String sortedFirst = Arrays.toString(firstChar);
            String sortedSecond = Arrays.toString(secondChar);
            return (sortedFirst.equals(sortedSecond));
        }


}

//TODO compare to val is megcsinálni