package Dealership.Components;

public class HybridEngine extends Engine {

    protected double batteryCapacity;
    protected double fuelCapacity;

    public HybridEngine(String type, double horsepower, String make,double batteryCapacity, double fuelCapacity) {
        super(type, horsepower, make);
        this.batteryCapacity = batteryCapacity;
        this.fuelCapacity = fuelCapacity;
    }
}
