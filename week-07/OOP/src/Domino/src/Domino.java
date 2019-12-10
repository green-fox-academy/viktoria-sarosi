public class Domino implements Printable{
    private final int left;
    private final int right;

    public Domino(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public int getLeftSide() {
        return left;
    }

    public int getRightSide() {
        return right;
    }

    @Override
    public String toString() {
        return "[" + left + ", " + right + "]";
    }

    @Override
    public void printAllFields() {
        System.out.println("Domino A: side " + this.getLeftSide() + ", B side: " + this.getRightSide() );
    }
}

