//      define a subclass Boat of Vehicle that has:
//         a double attribute maxKnotsSpeed
//         an int attribute boatKilosWeight
//         a mandatory override of the abstract method doVehicleSound() where you print the boat's sound
//         a constructor method that:
//               accepts 2 params (maxSpeed, weight)
//               assign the correct values to type, maxKnotsSpeed and boatKilosWeight
//               a method getBoatWeightAndSpeed that returns an informative String about the total kilos weight and the maximum knots speed
//     define a tester class where you:
//            create a Car object and a Boat object
//            invoke the two Vehicle methods for the newly created Car and Boat objects
//            print in console the Boat weight and speed using the dedicated method.

public class Boat extends Vehicle {
    private double maxKnotsSpeed;
    private int boatKilosWeight;

    public Boat(String type, int wheels, double maxSpeed, int weight) {
        super(type, wheels);
        this.maxKnotsSpeed = maxSpeed;
        this.boatKilosWeight = weight;
    }

    public double getMaxKnotsSpeed() {
        return maxKnotsSpeed;
    }

    public int getBoatKilosWeight() {
        return boatKilosWeight;
    }

    public void setMaxKnotsSpeed(double maxKnotsSpeed) {
        this.maxKnotsSpeed = maxKnotsSpeed;
    }

    public void setBoatKilosWeight(int boatKilosWeight) {
        this.boatKilosWeight = boatKilosWeight;
    }

    @Override
    public void doVehicleSound(){
        System.out.println("The boat sound = clooooooonkkk");
    }

    public void getBoatWeightAndSpeed() {
        System.out.println("The boat weight is " + boatKilosWeight + " and its max knot speed is " + maxKnotsSpeed);
    }
}
