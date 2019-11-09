import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give 2 numbers, press ENTER between  them!");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a > b){
            System.out.println(a + " is bigger");
        }
        if (b > a){
            System.out.println(b + " is bigger");
        }
    }
}
