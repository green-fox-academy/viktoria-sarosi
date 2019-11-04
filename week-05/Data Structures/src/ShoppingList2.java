import java.security.KeyStore;
import java.util.HashMap;
import java.util.Map;

public class ShoppingList2 {

    public static void main(String[] args) {
        //Represent the following products with their prices
        //
        //Product	Amount
        HashMap<String, Double> ProdList = new HashMap<>();
        ProdList.put("Milk", 1.07);
        ProdList.put("Rice", 1.59);
        ProdList.put("Apples", 2.31);
        ProdList.put("Tomato", 2.58);
        ProdList.put("Potato", 1.75);
        ProdList.put("Onion", 1.10);
        ProdList.put("Eggs", 3.14);
        ProdList.put("Cheese", 12.60);
        ProdList.put("Chicken Breasts", 9.40);
        //Eggs	3.14
        //Cheese	12.60
        //Chicken Breasts	9.40
        //Apples	2.31
        //Tomato	2.58
        //Potato	1.75
        //Onion	1.10
        //Represent Bob's shopping list
        //
        HashMap<String, Integer> BobsList = new HashMap<>();
        BobsList.put("Milk", 3);
        BobsList.put("Rice", 2);
        BobsList.put("Eggs", 2);
        BobsList.put("Cheese", 1);
        BobsList.put("Chicken Breasts", 4);
        BobsList.put("Apples", 1);
        BobsList.put("Tomato", 2);
        BobsList.put("Potato", 1);
        //Product	Amount
        //Milk	3
        //Rice	2
        //Eggs	2
        //Cheese	1
        //Chicken Breasts	4
        //Apples	1
        //Tomato	2
        //Potato	1
        //Represent Alice's shopping list
        //
        HashMap<String, Integer> AlicesList = new HashMap<>();
        AlicesList.put("Rice", 2);
        AlicesList.put("Eggs", 5);
        AlicesList.put("Chicken Breasts", 2);
        AlicesList.put("Apples", 1);
        AlicesList.put("Tomato", 10);
        //Product	Amount
        //Rice	1
        //Eggs	5
        //Chicken Breasts	2
        //Apples	1
        //Tomato	10
        //Create an application which solves the following problems.
        //
        //How much does Bob pay?
        double sumBob = 0.0;
        for (Map.Entry<String, Integer>Bob : BobsList.entrySet()){
            sumBob += (ProdList.get(Bob.getKey()) * Bob.getValue());
        }
        System.out.println(sumBob);
        //How much does Alice pay?
        double sumAlice = 0.0;
        for (Map.Entry<String, Integer>Alice : AlicesList.entrySet()){
            sumBob += (ProdList.get(Alice.getKey()) * Alice.getValue());
        }
        System.out.println(sumBob);
        //Who buys more Rice?
        if(BobsList.get("Rice") > AlicesList.get("Rice")){
            System.out.println("Bob buys more rice.");
        }
        if(AlicesList.get("Rice") > BobsList.get("Rice")){
            System.out.println("Alice buys more rice.");

        }
        if(AlicesList.get("Rice") == BobsList.get("Rice")){
            System.out.println("They buy the same amount of rice.");
        }
        //Who buys more Potato?
        if(AlicesList.containsKey("Potato") && BobsList.containsKey("Potato")){
            if(BobsList.get("Potato") > AlicesList.get("Potato")) {
                System.out.println("Bob buys more potato.");
            }else if((AlicesList.get("Potato")) > (BobsList.get("Potato"))) {
                System.out.println("Alice buys more potato.");
            }else {
                System.out.println("They buy the same amount of potato.");
            }
        }else{
            System.out.println("One of them doesn't buy any potatoes.");
        }
        //Who buys more different products?
        if(BobsList.size() < AlicesList.size()){
            System.out.println("Bob buys more different products.");
        }else if (BobsList.size() == AlicesList.size()){
            System.out.println("They buy the same amount of different products.");
        }else{
            System.out.println("Alice buys more different products.");
        }

        //Who buys more products? (piece)
        int bobPieces = 0;
        for (int pieces : BobsList.values()){
            bobPieces += pieces;
        }
        int alicePieces = 0;
        for (int pieces :AlicesList.values()){
            alicePieces += pieces;
        }
        if(bobPieces > alicePieces){
            System.out.println("Bob buys more pieces of products.");
        }
        if(bobPieces < alicePieces){
            System.out.println("Alice buys more pieces of products.");
        }else{
            System.out.println("They buy equal amount of pieces.");
        }
    }




}

