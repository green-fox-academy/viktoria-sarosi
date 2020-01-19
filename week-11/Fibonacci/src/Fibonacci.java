import java.util.ArrayList;

public class Fibonacci {
    public static void main(String[] args) {
        findFibonacciMemberAtIndex(4);
        System.out.println(fibonacci(10));
    }

    private static int findFibonacciMemberAtIndex(int i) {
        int index = 0;
        ArrayList<Integer> fibonacci = new ArrayList<>();


        return index;
    }

    public static int fibonacci(int n) {
        int fibonacciMember = 0;
        int previous = 1;
        int next;
        for (int i = 0; i < n ; ++i) {
            next = fibonacciMember + previous;
            previous = fibonacciMember;
            fibonacciMember = next;
        }
        return fibonacciMember;
    }

}
