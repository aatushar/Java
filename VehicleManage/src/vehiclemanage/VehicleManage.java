
package vehiclemanage;

import trav.Car;
import trav.MotorCycle;
import trav.Vehicle;


public class VehicleManage {

  
    public static void main(String[] args) {
        Vehicle car =new Car();
        Vehicle motorCycle = new MotorCycle();
        
        car.start();
        car.stop();
        
        motorCycle.start();
        motorCycle.stop();
    }
    
}
