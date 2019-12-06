package main.java.music;

public class BassGuitar extends StringedInstrument {
    public BassGuitar() {
        super();
        super.setNumberOfStrings(4);
    }
    public BassGuitar(int numberOfStrings){
        super(numberOfStrings);
    }
    @Override
    public String sound() {
        return "Duum-duum-duum";
    }


}
