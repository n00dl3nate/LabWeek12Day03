package Dealership.Components;

public class DieselEngine extends Engine {

    protected double fuelCapacity;

    public DieselEngine(String type, double horsepower, String make, double fuelCapacity) {
        super(type, horsepower, make);
        this.fuelCapacity = fuelCapacity;
    }

}

