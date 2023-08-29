
package trav;


public class MotorCycle extends Vehicle {

    public MotorCycle() {
    }

    public MotorCycle(String regestrationNumber, String brand, int year) {
        super(regestrationNumber, brand, year);
    }

    
    
    
    @Override
    public void start() {
        System.out.println("MotorCycle Start");
    }

    @Override
    public void stop() {
        System.out.println("MotorCycle Stop");
    }
    
}
