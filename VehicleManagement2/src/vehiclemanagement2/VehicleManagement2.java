
package vehiclemanagement2;

import Trav.Car;
import Trav.Motorcycle;
import Trav.Vehicle;


public class VehicleManagement2 {

    
    public static void main(String[] args) {
       Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();

        car.start();
        car.stop();

        motorcycle.start();
        motorcycle.stop();
       
       
       
    }
    
}
