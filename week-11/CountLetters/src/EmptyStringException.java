public class EmptyStringException extends Exception{
    public EmptyStringException(){
        super("The word does not contain any letters.");
    }
}
