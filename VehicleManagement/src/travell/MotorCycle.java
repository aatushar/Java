
package travell;


public class MotorCycle extends vehicle {

    public MotorCycle() {
    }

    public MotorCycle(String registrationNumber, String brand, int year) {
        super(registrationNumber, brand, year);
    }


    
    
    @Override
    public void start() {
        System.out.println("Motor Cycle Start");
    }

    @Override
    public void stop() {
        System.out.println("Motor Cycle Stop");
    }
    
}
