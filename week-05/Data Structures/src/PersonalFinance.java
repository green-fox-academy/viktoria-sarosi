import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Collections;

public class PersonalFinance {
    public static void main(String[] args) {
        ArrayList <Integer> persFinance = new ArrayList<Integer>();
        persFinance.add(500);
        persFinance.add(1000);
        persFinance.add(1250);
        persFinance.add(175);
        persFinance.add(800);
        persFinance.add(120);
        //Create an application which solves the following problems.
        //How much did we spend?
        //Which was our greatest expense?
        //Which was our cheapest spending?
         //What was the average amount of our spendings?

        int ossz = 0;
        for (int i = 0; i < persFinance.size()-1; i++) {
            ossz += persFinance.get(i);
        }
        System.out.println(ossz);

        System.out.println(Collections.max(persFinance));
        System.out.println(Collections.min(persFinance));
        System.out.println(ossz/persFinance.size());


    }

    private static void toArray() {
    }
}
