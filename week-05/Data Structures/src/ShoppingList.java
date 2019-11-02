import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {
    public static void main(String[] args) {
        //reate a list with the following items.
            //    Eggs, milk, fish, apples, bread and chicken
        //Create an application which solves the following problems.
       // Do we have milk on the list?
              //  Do we have bananas on the list?
        ArrayList<String> ShopList = new ArrayList<>(Arrays.asList("eggs", "milk", "fish", "apples", "bread", "chicken"));
        if (ShopList.contains("milk")){
            System.out.println("Milk is on the list.");
        } else {
            System.out.println("Milk is not on the list.");
        }
        if (ShopList.contains("bananas")){
            System.out.println("Bananas are on the list");
        } else {
            System.out.println("Bananas are not on the list");
        }
    }
}
