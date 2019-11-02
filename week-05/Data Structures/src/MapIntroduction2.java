import java.util.HashMap;

public class MapIntroduction2 {
    public static void main(String[] args) {
        HashMap<String, String> library = new HashMap<String,String>();
        library.put("978-1-60309-452-8", "A Letter to Jo");
        library.put("978-1-60309-459-7", "Lupus");
        library.put("978-1-60309-444-3", "Red Panda and Moon Bear");
        library.put("978-1-60309-461-0", "The Lab");
        //Print all the key-value pairs in the following format

        //A Letter to Jo (ISBN: 978-1-60309-452-8)
        //Lupus (ISBN: 978-1-60309-459-7)
        //Red Panda and Moon Bear (ISBN: 978-1-60309-444-3)
        //The Lab (ISBN: 978-1-60309-461-0)

        for(String key: library.keySet()) {
            System.out.println(library.get(key) + " (ISBN: " + key + ")");
        }
        System.out.println();
        //Remove the key-value pair with key 978-1-60309-444-3
        library.remove("978-1-60309-444-3");
        for(String key: library.keySet()) {
            System.out.println(library.get(key) + " (ISBN: " + key + ")");
        }
        System.out.println();
        //Remove the key-value pair with value The Lab
        library.values().remove("The Lab");
        for(String key: library.keySet()) {
            System.out.println(library.get(key) + " (ISBN: " + key + ")");
        }
        System.out.println();
        //Add the following key-value pairs to the map
        library.put("978-1-60309-450-4", "They Caled Us Enemy");
        library.put("978-1-60309-453-5", "Why Did We Trust Him?");
        for(String key: library.keySet()) {
            System.out.println(library.get(key) + " (ISBN: " + key + ")");
        }
        //Key	Value
        //978-1-60309-450-4	They Called Us Enemy
        //978-1-60309-453-5	Why Did We Trust Him?
        System.out.println(library.get("478-0-61159-424-8") != null);
         //       Print whether there is an associated value with key 478-0-61159-424-8 or not
        System.out.println(library.get("978-1-60309-453-5"));
        //Print the value associated with key 978-1-60309-453-5
    }
}
