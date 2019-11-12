import java.util.*;

public class Matchmaking{
    public static void main(String... args){
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Claire","Kat","Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Tom","Todd","Neef","Jeff"));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // If someone has no pair, he/she should be the element of the list too
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

        System.out.println(makingMatches(girls, boys).toString());
    }

    private static ArrayList<String> makingMatches(ArrayList<String> girls, ArrayList<String> boys) {
        int min = Math.min(boys.size(), girls.size());
        ArrayList<String> matches = new ArrayList<String>((girls.size()+boys.size()));
        for (int i = 0; i < min; i++) {
                matches.add(girls.get(i));
                matches.add(boys.get(i));
        }
        if(girls.size() > boys.size()){
            for (int i = boys.size(); i < girls.size(); i++) {
                matches.add(girls.get(i));
            }
        }

        if(boys.size() > girls.size()){
            for (int i = girls.size(); i < boys.size(); i++) {
                matches.add(boys.get(i));
            }
        }
        return matches;

        //int counter = 0;
        //for (int i = 1; i < boys.size(); i+=2) {
            //girls.add(i, boys.get(counter));
            //counter+=1;
        //}
        //if (girls.size()< boys.size()){

        //}
        //return girls;
//lemarad 2 fiu a végén
        }

}

