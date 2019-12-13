import org.junit.Before;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class SumTest {

    private Sum firstSum;
    private ArrayList<Integer> firstList;  //instatiate fields

    @Before
    public void init() {
        firstSum = new Sum();
        firstList = new ArrayList<Integer>();  // initialize objects
    }

    @Test
    public void sum_should_addAll_when_numbersAreGiven() throws Exception, ListDoesNotExistException {
        firstList.add(2);
        firstList.add(4);
        firstList.add(6);
        firstList.add(5);
        int expectedResult = 17;

        int result = firstSum.sum(firstList);

        assertEquals(expectedResult, result);
    }

    @Test(expected = Exception.class)
    public void sum_should_throwException_when_emptyListIsGiven() throws Exception, ListDoesNotExistException {
        firstSum.sum(firstList);
    }

    @Test
    public void sum_should_returnInput_when_listHasOnlyOneElement() throws Exception, ListDoesNotExistException {
        firstList.add(12);
        int expectedResult = firstList.get(0);

        int result = firstSum.sum(firstList);

        assertEquals(expectedResult, result);
    }

    @Test(expected = ListDoesNotExistException.class)
    public void sum_should_throwListDoesNotExistException_when_listDoesNotExist() throws Exception, ListDoesNotExistException {
        firstSum.sum(null);
    }
}