package PetrolStation;

public class PetrolStation {
    public static void main(String[] args) {
        //Create Station and Car classes
         //       Station
        //gasAmount
        //refill(car) -> decreases the gasAmount by the capacity of the car and increases the cars gasAmount
        //Car
        //        gasAmount
        //capacity
        //create constructor for Car where:
        //initialize gasAmount -> 0
        //initialize capacity -> 100
        Station shell = new Station();
        shell.gasAmount = 600;
        Car Fiat = new Car();
        shell.refill(Fiat);
        shell.refill(Fiat);
        System.out.println(shell.gasAmount + " ," + Fiat.gasAmount);
    }
}
