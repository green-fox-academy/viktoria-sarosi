public class Reverse {
    public static void main(String... args){
        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        // Create a method that can reverse a String, which is passed as the parameter
        // Use it on this reversed string to check it!
        // Try to solve this using charAt() first, and optionally anything else after.

        System.out.println(reverse(reversed));
    }
    public static String reverse (String input){
        //String[] osplit = o.split(""); // elmenti karakterre felabarolva egy arraybe.
        //String[] visszaforditva = new String[o.length()]; // nincs kesz!
        //for (int i = osplit.length; i <= 0 ; i--);
            //visszaforditva = o[i];
        //return visszaforditva;
        String ov = "";
        for (int i = input.length()-1; i >= 0; i--) {
            ov = ov + input.charAt(i);
        }
        return ov;
    }

}



