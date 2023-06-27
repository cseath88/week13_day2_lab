package vehicle;

import behavours.IDrive;
import engine.Engine;
import engine.EngineType;
import tyres.Tyre;

public abstract class Vehicle implements IDrive{

    private double price;
    private String colour;
    private int year;
    private Engine engine;

    private Tyre tyres;
    private String model;

    public Vehicle(double price, String colour, int year, Engine engine, Tyre tyres, String model) {
        this.price = price;
        this.colour = colour;
        this.year = year;
        this.engine = engine;
        this.tyres = tyres;
        this.model = model;
    }


    public double getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public int getYear() {
        return year;
    }

    public Engine getEngine() {
        return engine;
    }

    public Tyre getTyres() {
        return tyres;
    }

    public String getModel() {
        return model;
    }


    public String drive() {
        return null;
    }
}
