import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Strings {
    public static void main(String[] args) { // még csak az első x-et változtatja át
        String text1 = "xhxdxf  egfx xjhxx";

        System.out.println(changeTheXs(text1));
    }

    private static String changeTheXs(String text1) {
        if (text1.length() < 1){
            return text1;
        }
        else{
            if("x".equals(String.valueOf(text1.charAt(0)))){ // Ha "x" a szöveg első karaktere Stringgé alakitva.
                text1 = "y" + text1.substring(1); // akkor irja felöl a szöveget y-nal és az utána jövő szövegrésszel
            }
            return text1.charAt(0) + changeTheXs(text1.substring(1)); // adja vissza az első betűt (ami vagy nem x, vagy x, de már átalakitva y-né) plusz a maradékot visszküldi a functionba.
        }
    }
}
