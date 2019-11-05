import java.util.Scanner;

public class Cica {
    public static void main (String[] args) {
        int firstnumber = 1;
        double doublenumber = 1.5;
        int secondNumber;
        secondNumber = 3;
        boolean isHungry = true;
        String name = "Furkesz";
        char letter = 'a';

        int thirdNumber = firstnumber + secondNumber;
        System.out.println(thirdNumber);

        thirdNumber++;
        System.out.println(thirdNumber);

        thirdNumber = thirdNumber + 5;
        System.out.println(thirdNumber);

        thirdNumber += 5;
        System.out.println(thirdNumber);

        boolean isThirdBigger = thirdNumber < firstnumber;
        System.out.println(isThirdBigger);

         isHungry = true;
        boolean isSleepy = false;

        System.out.println("boolean operators");
        System.out.println(isHungry && isSleepy);

        System.out.println("Hello " + name + "!");

        String anotherString = "Hello" + thirdNumber + "!";
        System.out.println(anotherString);

        thirdNumber++;
        if (thirdNumber == 15) {
            System.out.println("third number is 15");
        } else {
            System.out.println("this is the else part");
        }

        thirdNumber--;
        if (thirdNumber == 15) {
            System.out.println("third number is 15");
        } else if (thirdNumber < 15) {
            System.out.println("third number is lower than 15");
        } else if (thirdNumber > 15) {
            System.out.println("third number is bigger than 15");
        }

        /*
         Scanner
         az elso sor csak ures sort csinal
        System.out.println();
        System.out.println("please write me something here");
        */
        Scanner scanner = new Scanner(System.in);
        /*
        String bejovo = scanner.nextLine();
        System.out.println("this was the input:" + bejovo);
        */

        System.out.println("please write a number here");
        int givenNumber = scanner.nextInt();
        System.out.println("your number is:" + givenNumber);

        /* for loop */

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        for (int i = 1; i <= givenNumber; i++) {
            System.out.println(i);
        }

        // while loop
        int a = 4;
        while (a < 10) {
            System.out.println();
            System.out.println(a);
            a++;
        }

        // do while loop
        System.out.println("do while loop");
        int b = 4;
        do {
            System.out.println(b);
            b++;
        } while (b < 10);

        //switch case


    }

}
