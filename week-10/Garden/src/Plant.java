public class Plant {
    private String color;
    private double currentWaterLevel;
    private double absorption;
    private int limitWhenNeedsWater;

    public Plant() {
    }

    public Plant(String color, double currentWater) {
        this.color = color;
        this.currentWaterLevel = currentWaterLevel;
        this.absorption = absorption;
        this.limitWhenNeedsWater = limitWhenNeedsWater;
    }

    public boolean needsWater() {
        if (this.currentWaterLevel >= this.limitWhenNeedsWater) {
            return false;
        } else {
            return true;
        }
    }

    public double getCurrentWaterLevel() {
        return (currentWaterLevel);
    }

    public void setCurrentWaterLevel(double currentWaterLevel) {
        this.currentWaterLevel = currentWaterLevel;
    }

    public double getAbsorption() {
        return absorption;
    }

    public void setAbsorption(double absorption) {
        this.absorption = absorption;
    }

    public String getColor() {
        return color;
    }

    public void setLimitWhenNeedsWater(int limitWhenNeedsWater) {
        this.limitWhenNeedsWater = limitWhenNeedsWater;
    }
}
