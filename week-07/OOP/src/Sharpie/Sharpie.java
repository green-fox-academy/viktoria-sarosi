package Sharpie;

public class Sharpie {
    public String color;
    public Float width;
    public Float inkAmount;

    public Sharpie(String color, Float width) {
        this.color = color;
        this.width = width;
        this.inkAmount = 100.0f;
    }

    public void use(){
        this.inkAmount --;
    }

    @Override
    public String toString() {
        return (color);
    }
}
