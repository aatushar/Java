
package vehiclemanagement;

import travell.MotorCycle;
import travell.car;
import travell.vehicle;


public class VehicleManagement {

    
    public static void main(String[] args) {
       vehicle car= new car();
       vehicle MotorCycle = new MotorCycle();
       
       car.start();;
       car.stop();
       
       MotorCycle.start();
       MotorCycle.stop();
    }
    
}
