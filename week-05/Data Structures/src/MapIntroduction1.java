import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.HashMap;

public class MapIntroduction1 {
    public static void main(String[] args) {

        HashMap<Integer, Character> elsomap = new HashMap<Integer, Character>();
        if (elsomap.isEmpty()){
            System.out.println("empty");
        }
        elsomap.put(97, 'a');
        elsomap.put(98, 'b');
        elsomap.put(99, 'c');
        elsomap.put(65, 'A');
        elsomap.put(66, 'B');
        elsomap.put(67, 'C');
        System.out.println(elsomap.keySet());
        System.out.println(elsomap.values());

        elsomap.put(68, 'D');
        System.out.println(elsomap.entrySet());
        System.out.println(elsomap.size());
        System.out.println(elsomap.get(99));

        elsomap.remove(97);
        System.out.println(elsomap);

        System.out.println(elsomap.get(100) != null);
        elsomap.clear();
        System.out.println(elsomap);


    }
}
