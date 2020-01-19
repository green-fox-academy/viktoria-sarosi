package Pirates;

public class Pirate {
    //Create a Pirate class. While you can add other fields and methods, you must have these methods:-
    //
    //drinkSomeRum() - intoxicates the Pirate some
    //howsItGoingMate() - when called, the Pirate replies, if drinkSomeRun was called:-
    //0 to 4 times, "Pour me anudder!"
    //else, "Arghh, I'ma Pirate. How d'ya d'ink its goin?", the pirate passes out and sleeps it off.
    //If you manage to get this far, then you can try to do the following.
    //
    //die() - this kills off the pirate, in which case, drinkSomeRum, etc. just result in he's dead.
    //brawl(x) - where pirate fights another pirate (if that other pirate is alive) and there's a 1/3 chance, 1 dies, the other dies or they both pass out.
    //And... if you get that far...
    //
    //Add a parrot.
    String name;
    int intoxicationValue;
    boolean isPassedOut;
    boolean isAlive;

    public Pirate() {
        this.name = name;
        this.intoxicationValue = 0;
        this.isPassedOut = false;
        this.isAlive = true;

    }

    public void drinkSomeRum() {
        if (!this.isAlive) {
            System.out.println(this.name + " is dead.");
        } else {
            this.intoxicationValue++;
        }
    }

    public void howsItGoingMate() {
        if (!this.isAlive) {
            System.out.println(this.name + " is dead.");
        } else {
            if (this.intoxicationValue < 5) {
                System.out.println("Pour me anudder!");
            } else {
                System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
                this.isPassedOut = true;
            }
        }
    }

    public void die() {
        this.isAlive = false;
    }

    public void brawl(Pirate pirate) {
        if (this.isAlive && pirate.isAlive) {
            int n = ((int) Math.random() * 2);
            if (n == 0) {
                pirate.isAlive = false;
                System.out.println(pirate.name + " is dead.");
            }
            if (n == 1) {
                this.isAlive = false;
                System.out.println(this.name + " is dead.");
            }
            if (n == 2) {
                this.isPassedOut = true;
                pirate.isPassedOut = true;
                System.out.println(this.name + "and " + pirate.name + " are both passed out");
            }
        } else if (!this.isAlive) {
            System.out.println("He is dead, can not brawl.");
        } else if (!pirate.isAlive) {
            System.out.println("He is dead, can not brawl.");
        }

    }

    @Override
    public String toString() {
        return " drank " + intoxicationValue + " rums and " + (isPassedOut ? " is passed out," : " is conscious,") + (isAlive ? " alive." : " dead.");
    }
}




