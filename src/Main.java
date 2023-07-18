//     define a tester class where you:
//            create a Car object and a Boat object
//            invoke the two Vehicle methods for the newly created Car and Boat objects
//            print in console the Boat weight and speed using the dedicated method.

public class Main {
    public static void main(String[] args) {
        Car macchina = new Car("Car", 4, 4, 15300);
        Boat barca = new Boat( "Boat", 0, 35.75, 1127);

        macchina.showVehicleDetails();
        macchina.doVehicleSound();

        barca.showVehicleDetails();
        barca.doVehicleSound();
        barca.getBoatWeightAndSpeed();

    }
}