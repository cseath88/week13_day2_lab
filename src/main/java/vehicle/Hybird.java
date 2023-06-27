package vehicle;

import behavours.IDrive;
import engine.Engine;
import tyres.Tyre;

public class Hybird extends Vehicle  {

    public Hybird(double price, String colour, int year, Engine engine, Tyre tyres,String model) {
        super(price, colour, year, engine, tyres, model);
    }



    public String drive() {
        return "I am hybird, and I can drive.";
    }
}
