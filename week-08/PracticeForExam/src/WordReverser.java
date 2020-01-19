package WordReverser;

public class WordReverser {
   // public static void main(String[] args) throws EmptyStringException {
     //   String input = "lleW ,enod taht saw ton taht drah";
       // try {
         //   System.out.println(reverse(input));
        //} catch (EmptyStringException e) {
           /* System.out.println(e.getMessage());
        }
    }*/

    public static String reverse(String input) throws EmptyStringException{
        if (input.length() == 0) {
            throw new EmptyStringException();
        } else {
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
}
