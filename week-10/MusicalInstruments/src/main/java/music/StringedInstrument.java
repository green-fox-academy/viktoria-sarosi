package main.java.music;

public abstract class StringedInstrument extends Instrument{
    private int numberOfStrings;

    public StringedInstrument() {
        super();
        this.numberOfStrings = numberOfStrings;
    }
    public StringedInstrument(int numberOfStrings){
        super();
        this.numberOfStrings = numberOfStrings;
    }
    public abstract String sound();

    @Override
    public void play() {
        System.out.println(getClass().getSimpleName() + ", a " + numberOfStrings + "-stringed instrument that goes " + sound());
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }
}
