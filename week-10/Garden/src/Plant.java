public class Plant {
    private String color;
    private double currentWaterLevel;
    private double absorption;

    public Plant() {
    }

    public Plant(String color, double currentWater) {
        this.color = color;
        this.currentWaterLevel = currentWaterLevel;
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

}
