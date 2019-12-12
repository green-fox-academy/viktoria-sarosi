import java.util.ArrayList;

public class Sum {
    public int sum(ArrayList<Integer> numberList) throws Exception, ListDoesNotExistException {
        int sumOfNumbers = 0;
        if(numberList == null){
            throw new ListDoesNotExistException();
        }
        else if (numberList.isEmpty()) {
            throw new Exception("The list is empty.");
        } else {
            for (int i = 0; i < numberList.size(); i++) {
                sumOfNumbers += numberList.get(i);
            }
            return sumOfNumbers;
        }
    }
}
