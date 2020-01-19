public class Tree extends Plant {

    public Tree(String color, double currentWater) {
        super(color, currentWater);
        this.setAbsorption(0.4);
        this.setLimitWhenNeedsWater(10);
    }

//TODO public static final absorption és limit (nem kell getter setter)
}




