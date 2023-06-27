import customer_dealer.Customer;
import customer_dealer.Dealer;
import engine.Engine;
import engine.EngineType;
import org.junit.Before;
import org.junit.Test;
import tyres.Tyre;
import vehicle.ElectricVehicle;
import vehicle.Hybird;
import vehicle.PetrolVehicle;
import vehicle.Vehicle;

import java.lang.reflect.Type;

import static org.junit.Assert.assertEquals;

public class Customer_DealerTest {

    Customer customer1;
    Dealer dealer;

    ElectricVehicle car1;
    Hybird car2;
    PetrolVehicle car3;
//    Engine engine;


    @Before
    public void before(){
        customer1=new Customer(10000);
        dealer= new Dealer(50000);
        Engine engine1=new Engine(EngineType.ELECTRIC,200);
        Engine engine2=new Engine(EngineType.DIESEL,100);
        Engine engine3=new Engine(EngineType.HYBRID,200);
        Tyre tyre =new Tyre("ALL Terrain", "Full On");
        car1 =new ElectricVehicle( 200,"red",1998, engine1,tyre,"Ford X");
        car2= new Hybird( 300,"Black",1999, engine3,tyre,"BMW ");
        car3 =new PetrolVehicle( 400,"Green",1948, engine2,tyre,"Audi");
        dealer.buyCar(car1);
        dealer.buyCar(car2);
        dealer.buyCar(car3);
    }

    @Test
    public void dealerHasCars(){
        assertEquals(3, dealer.countCars());
    }

    @Test
    public void customerHasMoney() {
        assertEquals(10000, customer1.getMoney(), 0.0);
    }

    @Test
    public void customerCanBuyCar() {
        Engine engine3=new Engine(EngineType.HYBRID,200);
        Tyre tyre =new Tyre("ALL Terrain", "Full On");
        Hybird car4 = new Hybird( 300,"Black",1999, engine3, tyre,"BMW ");
        customer1.buyCar(car4);
        assertEquals(1, customer1.countCars());
        assertEquals(9700, customer1.getMoney(), 0.0);
//        assertEquals(9600, dealer.getMoney(), 0.0);
    }








}
