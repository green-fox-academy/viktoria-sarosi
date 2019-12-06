package main.java.music;

public class ElectricGuitar extends StringedInstrument {
    public ElectricGuitar() {
        super();
        super.setNumberOfStrings(6);
    }
    public ElectricGuitar( int numberOfStrings){
        super(numberOfStrings);
    }

    @Override
    public String sound() {
        return "Twang";
    }


}
