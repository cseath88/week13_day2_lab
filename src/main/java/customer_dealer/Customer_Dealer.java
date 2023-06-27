package customer_dealer;

import behavours.IBuy;
import vehicle.Vehicle;

import java.util.ArrayList;

public abstract class Customer_Dealer implements IBuy {

    private ArrayList<Vehicle> cars;
    private double money;

    public Customer_Dealer(double money) {
        this.cars = new ArrayList<>();
        this.money = money;
    }

    public ArrayList<Vehicle> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Vehicle> cars) {
        this.cars = cars;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void buyCar(Vehicle car){
        if(this.money>car.getPrice()){
            this.cars.add(car);
            this.money-=car.getPrice();
        }
    }
    public int countCars() {
        return this.cars.size();
    }

}
