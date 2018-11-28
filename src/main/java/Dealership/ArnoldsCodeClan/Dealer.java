package Dealership.ArnoldsCodeClan;


import Dealership.Customer.Customer;
import Dealership.Interfaces.IRent;
import Dealership.Interfaces.ITransaction;
import Dealership.Vehicle.Vehicle;

import java.util.ArrayList;

public class Dealer implements ITransaction{

    private String name;
    private ArrayList<Vehicle> vehicles;
    private Till till;


    public Dealer(String name, Till till){

        this.name = name;
        this.till = till;
        this.vehicles = new ArrayList<>();
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public Till getTill() {
        return till;
    }

    public String getName() {
        return name;
    }

    public Boolean sellCar(Vehicle vehicle) {
        for (int i = 0; i < vehicles.size(); i++) {
            if (vehicles.get(i) == vehicle) {
                this.vehicles.remove(i);
                this.till.setMoney(till.getMoney()+vehicle.getPrice());
                return true;
            }
        }
        return false;
    }

    public void buyCar (Vehicle vehicle) {
            this.vehicles.add(vehicle);
            this.till.setMoney(till.getMoney()-vehicle.getPrice());
    }

    public void Addcar(Vehicle vehicle){
        this.vehicles.add(vehicle);
    }

    public String transaction(Customer customer, Vehicle vehicle){
        if (sellCar(vehicle) == true) {
            customer.buyCar(vehicle);
            return "Car Sold";
        }
        else{
            return "Not Sold";
        }

    }

    public void rent(Customer customer, Vehicle vehicle, int days) {
        double rentCost = rentPrice(vehicle) * days;
        for (int i = 0; i < vehicles.size(); i++) {
            if (vehicles.get(i) == vehicle && customer.getWallet() >= rentCost) {
                this.vehicles.remove(i);
                customer.getVehicles().add(vehicle);
                customer.setWallet(customer.getWallet() - rentCost);
                this.till.setMoney(till.getMoney()+rentCost);
            }
        }
    }


    public double rentPrice(Vehicle vehicle){
            return vehicle.getPrice() / 100;
    }

}