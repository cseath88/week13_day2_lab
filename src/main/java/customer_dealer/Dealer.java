package customer_dealer;

import vehicle.Vehicle;

import java.util.ArrayList;

public class Dealer extends Customer_Dealer {

    private double money;

    private ArrayList<Vehicle> cars;

    public Dealer(double money) {
        super(money);
    }


    public void sellCar(Vehicle car, Customer customer){
//        deduct money from customer money
        customer.buyCar(car);
//        if (customer.getCars().indexOf(car) == null) {
//            return;
//        }
        this.cars.remove(car);
        this.money += car.getPrice();

    }


}
