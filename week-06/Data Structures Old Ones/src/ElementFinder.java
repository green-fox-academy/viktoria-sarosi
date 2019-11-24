import java.util.ArrayList;
import java.util.Arrays;

public class ElementFinder {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(containsSeven1(arrayList));
        containsSeven2(arrayList);
    }

    private static String containsSeven1(ArrayList<Integer> arrayList) {
        if(arrayList.contains(7)){
            return "Hoorray";
        }else{
            return "Noooo";
        }
    }
    private static void containsSeven2(ArrayList<Integer> arrayList){
        boolean foundSeven = false;
        for (int i = 0; i <arrayList.size() ; i++) {
            if (arrayList.get(i) == 7){
                foundSeven = true;
                System.out.println("Hoorray");
                break;
            }
        }
        if (!foundSeven){
            System.out.println("Noooo");
        }
    }
}

