package Dealership.Vehicle;

import Dealership.Components.Engine;
import Dealership.Components.Tyre;

public abstract class Vehicle {

    protected String colour;
    protected Engine engine;
    protected Tyre tyres;
    protected double price;


    public Vehicle(String colour, Engine engine, Tyre tyres, double price){
        this.colour = colour;
        this.engine = engine;
        this.price = price;
        this.tyres = tyres;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Engine getEngineSize() {
        return engine;
    }

    public void setEngineSize(Engine engine) {
        this.engine = engine;
    }

    public Tyre getTyres() {
        return tyres;
    }

    public void setTyres(Tyre tyres) {
        this.tyres = tyres;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
