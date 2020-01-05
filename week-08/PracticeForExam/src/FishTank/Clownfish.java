package FishTank;

public class Clownfish extends Fish {
    private String stripeColor;

    public Clownfish(String name, int weight) {
        super(name, weight, "Orange");
        this.setWeightGainingRate(1);
        this.stripeColor = "White";
    }

    @Override
    public void status(){
        System.out.println(this.getName() + ", weight: " + this.getWeight() + ", color: " + this.getColor() + " with " + this.stripeColor + " stripes, short term memory loss: " + this.shortTermMemoryLoss);
    }
}
