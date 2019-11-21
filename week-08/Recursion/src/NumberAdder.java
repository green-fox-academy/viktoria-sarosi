public class NumberAdder {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(addnumber(n));
    }

    private static int addnumber(int n) {
        if(n == 1){
            return 1;
        }else {
            return n + addnumber(n - 1);
        }
    }

}
