package Dealership.Customer;

import Dealership.Interfaces.ITransaction;
import Dealership.Vehicle.Vehicle;

import java.util.ArrayList;

public class Customer implements ITransaction {

    protected double wallet;
    private ArrayList<Vehicle> vehicles;

    public Customer(double wallet) {
        this.wallet = wallet;
        this.vehicles = new ArrayList<>();

    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    public Boolean sellCar(Vehicle vehicle) {
        for (int i = 0; i < vehicles.size(); i++) {
            if (vehicles.get(i) == vehicle) {
                this.vehicles.remove(i);
                setWallet(getWallet() + vehicle.getPrice());
                return true;
            }
        }
        return false;
    }

    public void buyCar(Vehicle vehicle) {
        if (this.wallet >= vehicle.getPrice()) {
            setWallet(getWallet() - vehicle.getPrice());
            this.vehicles.add(vehicle);

        }
    }

    public void rentCar(Vehicle vehicle) {
        if (this.wallet >= vehicle.getPrice()) {
            setWallet(getWallet() - vehicle.getPrice());
            this.vehicles.add(vehicle);

        }
    }

}
