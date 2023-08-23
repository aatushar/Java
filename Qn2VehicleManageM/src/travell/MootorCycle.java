
package travell;

public class MootorCycle extends Vehicle {

    public MootorCycle() {
    }

    public MootorCycle(String registrationNumber, String brand, int Year) {
        super(registrationNumber, brand, Year);
    }

    
    
    @Override
    public void start() {
        System.out.println("Motorcycle Start");    }

    @Override
    public void stop() {
        System.out.println("MotorCycle Stop");    }
    
}
