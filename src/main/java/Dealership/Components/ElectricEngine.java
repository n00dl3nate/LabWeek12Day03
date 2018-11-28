package Dealership.Components;

public class ElectricEngine extends Engine {


    protected double batteryCapacity;

    public ElectricEngine(String type, double horsepower, String make, double batteryCapacity) {
        super(type, horsepower, make);
        this.batteryCapacity = batteryCapacity;
    }

}