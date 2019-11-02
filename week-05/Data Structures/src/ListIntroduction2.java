import java.util.ArrayList;
import java.util.Arrays;

public class ListIntroduction2 {
    public static void main(String[] args) {
        //Create a list ('List A') which contains the following values
        //Apple, Avocado, Blueberries, Durian, Lychee
        ArrayList<String> lista = new ArrayList();
        lista.add("Apple");
        lista.add("Avocado");
        lista.add("Blueberries");
        lista.add("Durian");
        lista.add("Lychee");
        //Create a new list ('List B') with the values of List A
        ArrayList listb = new ArrayList<> ();
        listb.addAll(lista);
        System.out.println(listb);
        //Print out whether List A contains Durian or not
        System.out.println(lista.contains("Durian"));
        //Remove Durian from List B
        listb.remove("Durian");
        //Add Kiwifruit to List A after the 4th element
        lista.add(4, "Kiwifruit" );
        System.out.println(lista);
        System.out.println(listb);
        //Compare the size of List A and List B
        if (lista.size() < listb.size()){
            System.out.println("Listb is bigger");
        }
        if (lista.size() > listb.size()){
            System.out.println("Lista is bigger");
        }
        //Get the index of Avocado from List A
        System.out.println(lista.indexOf("Avocado"));
        //Get the index of Durian from List B
        System.out.println(listb.indexOf("Durian"));
        //Add Passion Fruit and Pomelo to List B in a single statement
        //ArrayList listc = new ArrayList();
        //listc.add("Passion Fruit");
        //listc.add("Kiwifruit");
        //System.out.println(listc);
        //listb.addAll(listc);
        //System.out.println(listb);
        // És valóban single statementben:
        listb.addAll(Arrays.asList("Passion Fruit", "Pomelo"));
        System.out.println(listb);

        //Print out the 3rd element from List A
        System.out.println(lista.get(2));


    }
}
