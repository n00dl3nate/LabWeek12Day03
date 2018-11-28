package Dealership.Vehicle;

import Dealership.Components.Engine;
import Dealership.Components.Tyre;

public class ElectricCar extends Vehicle {

    public ElectricCar(String colour, Engine engine, Tyre tyres, double price){
        super(colour,engine,tyres,price);
    }
}
