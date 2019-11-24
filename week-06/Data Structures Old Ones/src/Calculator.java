import java.lang.reflect.Array;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Create a simple calculator application which reads the parameters from the prompt
        // and prints the result to the prompt.
        // It should support the following operations,
        // create a method named "calculate()":
        // +, -, *, /, % and it should support two operands.
        // The format of the expressions must be: {operation} {operand} {operand}.
        // Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

        // You can use the Scanner class
        // It should work like this:

        // Start the program
        // It prints: "Please type in the expression:"
        // Waits for the user input
        // Print the result to the prompt
        // Exit
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type in the expression:");
        String orig = scanner.nextLine();

        System.out.println(calculate(orig));

    }

    private static int calculate(String orig) {
        String[] splittedOrig = orig.split(" ", 3);
        String operation = splittedOrig[0];
        int operand1 = Integer.valueOf(splittedOrig[1]);
        int operand2 = Integer.valueOf(splittedOrig[2]);
        int returnValue = 0;

        if(operation.equals("+")){
            returnValue = operand1 + operand2;
        } else if(operation.equals("-")){
            returnValue = operand1 -operand2;
        } else if(operation.equals("*")){
            returnValue = operand1 * operand2;
        } else if(operation.equals("/")){
            returnValue = operand1 / operand2;
        } else if(operation.equals("%")){
            returnValue = operand1 % operand2;
        }
        return returnValue;
    }
}
