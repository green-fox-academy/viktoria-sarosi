public class Flower extends Plant {

    public Flower(String color, double currentWater, double absorption) {
        super(color, currentWater);
        this.setAbsorption(0.75);
    }

}
