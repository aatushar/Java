
package evdqn2;

import Travell.Car;
import Travell.MotorCycle;
import Travell.Vehicle;


public class EvdQn2 {


    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle motorCycle = new MotorCycle();
        
        
        car.start();
        car.stop();
        
        motorCycle.start();
        motorCycle.stop();
    }
    
}
