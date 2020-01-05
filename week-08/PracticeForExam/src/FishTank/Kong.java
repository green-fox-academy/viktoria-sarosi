package FishTank;

public class Kong extends Fish {
    public Kong(String name, int weight, String color) {
        super(name, weight, color);
        this.setWeightGainingRate(2);
    }

    @Override
    public void status() {
        System.out.println(this.getName() + ", weight: " + this.getWeight() + ", color: " + this.getColor() + ", short term memory loss: " + this.shortTermMemoryLoss);
    }
}
