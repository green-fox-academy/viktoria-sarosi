import java.awt.*;
import java.util.ArrayList;

public class Candyshop {
    public static void main(String[] args) {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        arrayList.add("Cupcake");
        arrayList.add(2);
        arrayList.add("Brownie");
        arrayList.add(false);

        // Accidentally we added "2" and "false" to the list.
        // Your task is to change from "2" to "Croissant" and change from "false" to "Ice cream"
        // No, don't just remove the lines
        // Create a method called sweets() which takes the list as a parameter.

        System.out.println(sweets(arrayList));
        // Expected output: "Cupcake", "Croissant", "Brownie", "Ice cream"
    }

    private static String sweets(ArrayList<Object> arrayList) {
        arrayList.remove(1);
        arrayList.add(1, "Croissant");
        arrayList.remove(3);
        arrayList.add(3,"Ice cream");
        return arrayList.toString();
    }
}
