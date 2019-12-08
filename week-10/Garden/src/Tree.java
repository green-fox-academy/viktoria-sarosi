public class Tree extends Plant {

    public Tree(String color, double currentWater) {
        super(color, currentWater);
        this.setAbsorption(0.4);
        this.setLimitWhenNeedsWater(10);
    }


}




