package Dealership.Components;

public abstract class Engine {

    private String type;
    private double horsepower;
    private String make;


    public Engine(String type, double horsepower, String make){
        this.type = type;
        this.horsepower = horsepower;
        this.make = make;
    }

}
