package Dealership.Components;

public class PetrolEngine extends Engine {

    protected double fuelCapacity;

    public PetrolEngine(String type, double horsepower, String make, double fuelCapacity) {
        super(type, horsepower, make);
        this.fuelCapacity = fuelCapacity;
    }

}