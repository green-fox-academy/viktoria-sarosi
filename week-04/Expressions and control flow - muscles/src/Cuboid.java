import java.util.Scanner;

public class Cuboid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the size of side a, in decimal please!");
        double a = scanner.nextDouble();

        System.out.println("Now give the size of side b, in decimal please!");
        double b = scanner.nextDouble();

        System.out.println("And  finally give the size of side c, in decimal please!");
        double c = scanner.nextDouble();

        double SurfaceArea = (a * b + a * c + b * c) * 2;
        double Volume = a * b * c;

        System.out.println("Surface Area: " + SurfaceArea);
        System.out.println( "Volume: " + Volume);
    }
}

