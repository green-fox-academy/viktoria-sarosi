package Pirates;

import java.util.ArrayList;

public class Ship {
    //Create a Ship class.
    //The Ship stores Pirate-s instances in a list as the crew and has one captain who is also a Pirate.
    //When a ship is created it doesn't have a crew or a captain.
    //The ship can be filled with pirates and a captain via fillShip() method.
    //Filling the ship with a captain and random number of pirates.
    //Ships should be represented in a nice way on command line including information about
    //captains consumed rum, state (passed out / died)
    //number of alive pirates in the crew
    //Ships should have a method to battle other ships: ship.battle(otherShip)
    //should return true if the actual ship (this) wins
    //the ship should win if its calculated score is higher
    //calculate score: Number of Alive pirates in the crew - Number of consumed rum by the captain
    //The loser crew has a random number of losses (deaths).
    //The winner captain and crew has a party, including a random number of rum :)
    //BattleApp
    public ArrayList<Pirate> crew;
    String name;
    Pirate captain;
    boolean haveWon;

    public Ship() {
        this.haveWon = true;
        crew = new ArrayList<Pirate>();
    }

    public void fillShip() {
        this.crew = new ArrayList<Pirate>();
        for (int i = 0; i <((int)(Math.random()*50 + 10)) ; i++) {
            this.crew.add(new Pirate());
        }
        this.captain = crew.get(0);
    }

    @Override
    public String toString() {
        int result = 0;
        for (int i = 0; i < crew.size(); i++) {
            if (crew.get(i).isAlive) {
                result++;
            }
        }
        return "The captain " + captain + "\n" + "There are " + result + " pirates alive on " + name + ".";
    }

    public int score() {
        int theScore = 0;
        for (int i = 0; i < crew.size(); i++) {
            if (crew.get(i).isAlive) {
                theScore++;
            }
        }
        theScore = theScore - captain.intoxicationValue;
        return theScore;
    }

    public boolean battle(Ship ship){
        if (this.score() > ship.score()) {
            this.haveWon = true;
            ship.haveWon = false;
        }else if (this.score() == ship.score()){
            this.haveWon = false;
            ship.haveWon = false;
        }else{
            this.haveWon = false;
            ship.haveWon = true;
        }
        this.afterBattle();
        ship.afterBattle();
        System.out.println(this.name + " won: " + this.haveWon + ".");
        System.out.println(ship.name + " won: " + ship.haveWon + ".");
        return this.haveWon;

    }
    public void afterBattle(){
        if (this.haveWon){
            for (int i = 0; i < this.crew.size(); i++) {
                for (int j = 0; j < (int) (Math.random() * 10); j++) {
                    this.crew.get(i).drinkSomeRum();
                }
            }
        }else{
            for (int i = 0; i < (int) (Math.random() * this.crew.size()); i++) {
                this.crew.get(i).die();
            }
        }

    }
}


