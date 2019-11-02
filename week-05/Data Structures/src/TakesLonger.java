public class TakesLonger {
    public static void main(String... args){
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        // When saving this quote a disk error has occured. Please fix it.
        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)
        String quote1 = "Hofstadter's Law: It";
        String quote2 = " always takes longer than";
        String quote3 = " you expect, even when you take into account Hofstadter's Law.";
        quote = quote1.concat(quote2).concat(quote3);

        System.out.println(quote);
    }
}
