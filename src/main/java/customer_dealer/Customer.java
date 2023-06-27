package customer_dealer;

import behavours.IBuy;
import vehicle.Vehicle;

import java.util.ArrayList;

public class Customer extends Customer_Dealer {
    private double money;
    private ArrayList<Vehicle> cars;

    public Customer( double money) {
        super(money);
    }

}
