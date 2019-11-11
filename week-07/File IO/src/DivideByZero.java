public class DivideByZero {
    public static void main(String[] args) {
        double a = 3;
        System.out.println(divider(a));
    }

    private static double divider(double a) {
        double d = 0;
        try{
            d = 10./a;
        }catch (ArithmeticException e) {
            System.out.println("fail");
        }
        return d;
    }
}
