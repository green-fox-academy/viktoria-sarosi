import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class AverageOfinput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give 5 numbers, press ENTER between each of them!");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        System.out.println("Sum :" + (a+b+c+d+e));
        System.out.println("Average:" + (a+b+c+d+e)/5);
    }
}
