package vehicle;

import behavours.IDrive;
import engine.Engine;
import tyres.Tyre;

public class ElectricVehicle extends Vehicle {

    public ElectricVehicle(double price, String colour, int year, Engine engine, Tyre tyres, String model) {
        super(price, colour, year, engine, tyres,model);
    }


    public String drive() {
        return "I am electric, and I can drive.";
    }
}
