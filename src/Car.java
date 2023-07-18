//     define a subclass Car of Vehicle that has:
//        an int attribute numberOfDoors
//        a double attribute carPrice
//        an override of the superclass method showVehicleDetails() that:
//            recalls the super method showVehicleDetails()
//            prints in console an informative message about the car's numberOfDoors
//            a mandatory override of the abstract method doVehicleSound() where you print the car's sound
//        a constructor method that:
//            accepts 3 params (wheels, doors, price)
//            assign the correct values to type, numberOfWheels, numberOfDoors and carPrice
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

public class Car extends Vehicle{
    private int numberOfDoors;
    private double carPrice;

    public Car(String type, int wheels, int doors, double price) {
        super(type, wheels);
        this.numberOfDoors = doors;
        this.carPrice = price;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public double getCarPrice() {
        return carPrice;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public void setCarPrice(double carPrice) {
        this.carPrice = carPrice;
    }

    @Override // è obbligatorio fare l'override di questo metodo perché nella classe padre è dichiarato con abstract
    public void doVehicleSound() {
        System.out.println("The car sound = broooom");
    }

    @Override
    public void showVehicleDetails() {
        System.out.println("The car has " + numberOfDoors + " doors ");
    }
}

//    Quando si estende una classe astratta:
//    - se ha dei metodi dichiarati con abstract allora ne si deve per forza fare l'override nelle classi che la estendono
//    - se voglio chiamare una sua variabile all'interno del costruttore della sottoclasse:
//          --> se la variabile è dentro al costruttore della super classe allora nella sottoclasse bisogna fare
//                public Sottoclasse(int variabileDaAssegnareAllaSuperclasse) {
//                    super(variabileDaAssegnareAllaSuperclasse);
//                }
//
//          --> se la variabile non è inizializzata nel costruttore della superclasse allora basta fare
//                public Sottoclasse(int variabileDellaSuperclasse, int doors, double price) {
//                   this.numberOfWheels = variabileDellaSuperclasse;
//               }