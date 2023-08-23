
package qn2vehiclemanagem;

import travell.Car;
import travell.MootorCycle;
import travell.Vehicle;


public class Qn2VehicleManageM {

    public static void main(String[] args) {
        Vehicle car= new Car();
        Vehicle MotorCycle = new MootorCycle();
        
        car.start();
        car.stop();
        
        MotorCycle.start();
        MotorCycle.stop();
    }
    
}
