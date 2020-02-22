import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;

public class JosephusProblem {
    public static void main(String[] args) {
        int numberOfPeople = 10;
        System.out.println(josephus(numberOfPeople));
    }

    private static int josephus(int numberOfPeople) {
        ArrayList<Integer> group = new ArrayList<>();
        for (int i = 0; i < numberOfPeople; i++) {
            group.add(i, i + 1);
        }
        int indexToRemove = 1;
        for (int i = 0; i < group.size(); i++) {
            group.remove(indexToRemove);
            indexToRemove += 2;
        }

    }
}
}
