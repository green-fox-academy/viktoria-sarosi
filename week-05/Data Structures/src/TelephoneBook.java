import java.util.HashMap;
import java.util.Map;

public class TelephoneBook {
    public static void main(String[] args) {
        //Create a map with the following key-value pairs.

        //  Name (key)	Phone number (value)
        //  William A. Lathan	405-709-1865
        //John K. Miller	402-247-8568
       // Hortensia E. Foster	606-481-6467
        //Amanda D. Newland	319-243-5613
       // Brooke P. Askew	307-687-2982
        HashMap<String, String> telefon = new HashMap<>();
        telefon.put("William A. Lathan", "405-709-1865");
        telefon.put("John K. Miller", "402-247-8568");
        telefon.put("Hortensia E. Foster", "606-481-6467");
        telefon.put("Amanda D. Newland", "319-243-5613");
        telefon.put("Brooke P. Askew", "307-687-2982");
        //Create an application which solves the following problems.

        //What is John K. Miller's phone number?
        System.out.println(telefon.get("John K. Miller"));
        System.out.println();
        //Whose phone number is 307-687-2982?
        for (String key : telefon.keySet()){
            if (telefon.get(key) == "307-687-2982"){
                System.out.println(key);
            }
        }
        //Or:
        for (Map.Entry<String, String> szam : telefon.entrySet()) {
            if (szam.getValue() == "307-687-2982") {
                System.out.println(szam.getKey());
            }
        }
        //Do we know Chris E. Myers' phone number?
        System.out.println(telefon.containsKey("Chris E. Myers"));
        System.out.println(telefon.get("Chris E. Myers") != null);
    }


}
