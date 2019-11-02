import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ProductDatabase {
    public static void main(String[] args) {
        //Create a map with the following key-value pairs.

        //     Product name (key)	Price (value)
        //Eggs	200
        //Milk	200
        //Fish	400
        //Apples	150
        //Bread	50
        //Chicken	550
        //Create an application which solves the following problems.
        HashMap<String, Integer> ProductList = new HashMap<>();
        ProductList.put("Eggs", 200);
        ProductList.put("Milk", 200);
        ProductList.put("Fish", 400);
        ProductList.put("Apples", 150);
        ProductList.put("Bread", 50);
        ProductList.put("Chicken", 550);
        //How much is the fish?
        System.out.println(ProductList.get("Fish"));
        //       What is the most expensive product?
        System.out.println(Collections.max(ProductList.values()));
        //       What is the average price?
        int sum = 0;
        for (int price: ProductList.values()){
            sum += price;
        }
        System.out.println(sum / ProductList.size());
        //How many products' price is below 300?
        int a = 0;
        for (int price : ProductList.values()){
            if (price < 300){
                a++;
            }
        }
        System.out.println(a);
        //Is there anything we can buy for exactly 125?
        System.out.println(ProductList.containsValue(125));
        //      What is the cheapest product?
        int minimumprice = Collections.min(ProductList.values());
        for (String item : ProductList.keySet()){
            if (ProductList.get(item) == minimumprice){
                System.out.println(item);
            }
        }


        }

}