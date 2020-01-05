package FishTank;

public class Tang extends Fish {
    public Tang(String name, int weight, String color) {
        super(name, weight, color);
        this.setWeightGainingRate(1);
        this.shortTermMemoryLoss = true;
    }

    @Override
    public void status() {
        System.out.println(this.getName() + ", weight: " + this.getWeight() + ", color: " + this.getColor() + ", short term memory loss: " + this.shortTermMemoryLoss);
    }
}
