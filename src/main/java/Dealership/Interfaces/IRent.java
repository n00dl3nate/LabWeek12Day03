package Dealership.Interfaces;

import Dealership.Customer.Customer;
import Dealership.Vehicle.Vehicle;

public interface IRent {

    public double rentPrice(Customer customer, Vehicle vehicle, int days);

    public void rent(Vehicle vehicle);
}
