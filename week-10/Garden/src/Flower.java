public class Flower extends Plant {

    public Flower(String color, double currentWater) {
        super(color, currentWater);
        this.setAbsorption(0.75);
        this.setLimitWhenNeedsWater(5);
    }

}
