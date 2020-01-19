package Pirates;

import java.util.ArrayList;

public class Armada {
    //Create an Armada class
    //    Contains Ship-s as a list
    //    Have a armada.war(otherArmada) method where two armada can engage in war
    //    it should work like merge sort
    //    first ship from the first armada battles the first of the other
    //    the loser gets skipped so the next ship comes in play from that armada
    //    whichever armada gets to the end of its ships loses the war
    //return true if this is the winner

    public ArrayList<Ship> fleet;
    public boolean isWinner;

    public Armada(){
        fleet = new ArrayList<Ship>();
        this.isWinner = false;
    }

    public void fillArmada(){
        for (int i = 0; i < (int)((Math.random()*13 + 5)); i++) {
            this.fleet.add(new Ship());
            this.fleet.get(i).fillShip();
        }
    }

    public boolean war(ArrayList<Ship>armada) {
        for (int i = 0; i < Math.max(this.fleet.size(), armada.size()) ; i++) {
            if(i == this.fleet.size()){
                break;
            }
            for (int j = 0; j < Math.max(this.fleet.size(), armada.size());){
                this.fleet.get(i).battle(armada.get(j));
                if (this.fleet.get(i).haveWon) {
                    j++;
                    this.fleet.get(i).battle(armada.get(j));
                } else {
                    break;
                }
                if(j == armada.size()){
                    break;
                }
            }
        }
        return this.isWinner;
    }
}
