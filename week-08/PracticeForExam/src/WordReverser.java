public class WordReverser {
    public static void main(String[] args) {
        String input = "lleW ,enod taht saw ton taht drah";
        System.out.println(reverse(input));
    }

    public static String reverse(String input) {
        StringBuilder reversedInput = new StringBuilder();
        String[] splittedInput = input.split(" ");
        for (int i = 0; i < splittedInput.length; i++) {
            StringBuilder reversedWords = new StringBuilder();
            reversedWords.append(splittedInput[i]);
            reversedWords.reverse();
            reversedInput.append(reversedWords + " ");
        }
        reversedInput.deleteCharAt(reversedInput.length() - 1);
        String reversedString = reversedInput.toString();
        return reversedString;
    }
}
