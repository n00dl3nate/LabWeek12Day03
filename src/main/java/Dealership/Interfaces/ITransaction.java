package Dealership.Interfaces;

import Dealership.Vehicle.Vehicle;

public interface ITransaction {

    public Boolean sellCar(Vehicle vehicle);

    public void buyCar(Vehicle vehicle);

}
