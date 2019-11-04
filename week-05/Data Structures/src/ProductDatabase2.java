import java.util.HashMap;
import java.util.Map;

public class ProductDatabase2 {
    public static void main(String[] args) {
        //Create a map with the following key-value pairs.

           //     Product name (key)	Price (value)
       // Eggs	200
        //Milk	200
        //Fish	400
       // Apples	150
       // Bread	50
        //Chicken	550
        HashMap<String, Integer> ProdD2 = new HashMap<>();
        ProdD2.put("Eggs",	200);
        ProdD2.put("Milk", 200);
        ProdD2.put("Fish", 400);
        ProdD2.put("Apples", 150);
        ProdD2.put("Bread", 50);
        ProdD2.put("Chicken", 550);
        //Create an application which solves the following problems.

        //Which products cost less than 201? (just the name)
        for(Map.Entry<String, Integer> element: ProdD2.entrySet()){
            if (element.getValue() < 201){
                System.out.println(element.getKey());
            }
        }
        //Which products cost more than 150? (name + price)
        for (Map.Entry<String, Integer> element: ProdD2.entrySet()){
            if (element.getValue() > 150){
                System.out.println(element.getKey() + " " + element.getValue());
            }
        }
    }
}
