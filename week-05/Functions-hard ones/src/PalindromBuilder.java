import java.lang.reflect.Array;

public class PalindromBuilder {
    public static void main(String[] args) {
        String first = "margit";
        System.out.println(createPalindrom(first));
    }

    private static String createPalindrom(String first) {
        char[] firstArray = first.toCharArray();
        String palindromToReturn = first;
        for (int i = firstArray.length - 1; i >= 0; i--) {
            palindromToReturn += firstArray[i];
        }
        return palindromToReturn;
    }
}
