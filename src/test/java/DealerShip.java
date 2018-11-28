import Dealership.ArnoldsCodeClan.Dealer;
import Dealership.ArnoldsCodeClan.Till;
import Dealership.Components.*;
import Dealership.Customer.Customer;
import Dealership.Vehicle.ElectricCar;
import Dealership.Vehicle.FuelCar;
import Dealership.Vehicle.HybridCar;
import Dealership.Vehicle.Vehicle;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealerShip {

    Dealer dealer;
    Till till;
    Customer customer;

    Tyre tyres;

    HybridEngine hybridEngine;
    ElectricEngine electricEngine;
    DieselEngine dieselEngine;
    PetrolEngine petrolEngine;

    FuelCar fuelCar;
    ElectricCar electricCar;
    HybridCar hybridCar;


    @Before
    public void before(){
        till = new Till(1000000.00);
        tyres = new Tyre("Standard","Wee Dave's");
        hybridEngine = new HybridEngine("Hybrid", 360.00,"Honda",70.00,40.00);
        electricEngine = new ElectricEngine("Electrical", 360.00,"Tesla",70.00);
        dieselEngine = new DieselEngine("Diesel", 360.00,"Ferrari",50.00);
        fuelCar = new FuelCar("Black", dieselEngine,tyres,400000.00);
        electricCar = new ElectricCar("White", electricEngine,tyres,3000.00);
        hybridCar = new HybridCar("red",hybridEngine,tyres,300000.00);

        dealer = new Dealer("Farty Mcghee's Motors",till);
        customer = new Customer(100000.00);

        dealer.Addcar(fuelCar);
        dealer.Addcar(fuelCar);
        dealer.Addcar(fuelCar);
        dealer.Addcar(electricCar);
        dealer.Addcar(hybridCar);
    }

    @Test
    public void dealerHasVehicles(){
        assertEquals(5,dealer.getVehicles().size());
    }

    @Test
    public void CustomerStartsWithNoVehicle(){
        assertEquals(0,customer.getVehicles().size());
    }

    @Test
    public void CustomerBuyVehicle(){
        customer.buyCar(electricCar);
        assertEquals(1,customer.getVehicles().size());
        assertEquals(97000,customer.getWallet(),0.01);
    }

    @Test
    public void dealerCanSellCar(){
        dealer.sellCar(fuelCar);
        assertEquals(1400000.00,dealer.getTill().getMoney(),0.01);
        assertEquals(4,dealer.getVehicles().size());
    }

    @Test
    public void dealerCanBuyCar(){
        dealer.buyCar(electricCar);
        assertEquals(997000.00,dealer.getTill().getMoney(),0.01);
        assertEquals(6,dealer.getVehicles().size());
    }

    @Test
    public void CompleteDealshipSellCar(){
        this.dealer.transaction(customer,electricCar);
        assertEquals(1003000.00,dealer.getTill().getMoney(),0.01);
        assertEquals(97000,customer.getWallet(),0.01);
        assertEquals(1,customer.getVehicles().size());
        assertEquals(4,dealer.getVehicles().size());
    }

    @Test
    public void rentACar(){
        this.dealer.rent(customer,hybridCar,10);
        assertEquals(1030000.00,dealer.getTill().getMoney(),0.01);
        assertEquals(70000,customer.getWallet(),0.01);
        assertEquals(1,customer.getVehicles().size());
        assertEquals(4,dealer.getVehicles().size());
    }






}
