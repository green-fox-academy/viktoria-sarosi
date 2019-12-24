import java.lang.reflect.Type;
import java.util.ArrayList;

public class Carrier {
    private ArrayList<Aircraft> fleet;
    private int storeOfAmmo;
    private int healthPoints;
    private int totalDamage;

    public Carrier() {
        this.fleet = new ArrayList<Aircraft>();
        this.storeOfAmmo = 1000;
        this.healthPoints = 6000;
        this.totalDamage = 0;
    }

    public int calculateTotalDamage(ArrayList<Aircraft> fleet) {
        for (int i = 0; i < this.fleet.size(); i++) {
            this.totalDamage += this.fleet.get(i).getDealtDamage();
        }
        return totalDamage;
    }

    public void addAircraft(Aircraft airplane) {
        this.fleet.add(airplane);
    }

    public void fill() throws NoAmmoException {
        int totalNeededAmmo = 0;
        for (int i = 0; i < fleet.size(); i++) {
            totalNeededAmmo += fleet.get(i).getMaxAmmo() - fleet.get(i).getAmmunition();
        }
        refillByAircraft("F35");
        refillByAircraft("F16");

        this.setTotalDamage(calculateTotalDamage(fleet));
        if (storeOfAmmo == 0) {
            throw new NoAmmoException();
        }
    }

    public void refillByAircraft(String Brand) {
        for (int i = 0; i < fleet.size(); i++) {
            if (((fleet.get(i).getType())).equals(Brand)) {
                storeOfAmmo = fleet.get(i).refill(storeOfAmmo);
            }
        }
    }

    public void fight(Carrier otherCarrier) {
        this.battle(otherCarrier);
        otherCarrier.battle(this);
        this.updateDealtDamageAfterFight();
        otherCarrier.updateDealtDamageAfterFight();
        this.setTotalDamage(0);
        otherCarrier.setTotalDamage(0);
    }

    public void battle(Carrier enemyCarrier) {
        for (int i = 0; i < this.fleet.size(); i++) {
            this.fleet.get(i).fight();
            enemyCarrier.healthPoints -= this.fleet.get(i).fight();
        }
    }

    public void updateDealtDamageAfterFight() {
        for (int i = 0; i < this.fleet.size(); i++) {
            this.fleet.get(i).setDealtDamage(0);
        }
    }

    public String getStatus() {
        if (this.healthPoints <= 0) {
            return "It's dead, Jim.";
        } else {
            String statusCarrier = "HP: " + this.getHealthPoints() + " Aircraft count: " + this.fleet.size() + " Ammo Storage: " + storeOfAmmo + " Total damage: " + getTotalDamage();
            String statusFleet = "";
            for (int i = 0; i < this.fleet.size(); i++) {
                statusFleet += fleet.get(i).getStatus() + "\n";
            }
            return statusCarrier + "\n" + "Aircrafts: " + "\n" + statusFleet;
        }
    }

    public int getTotalDamage() {
        return totalDamage;
    }

    public void setTotalDamage(int totalDamage) {
        this.totalDamage = totalDamage;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }
}
