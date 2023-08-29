
package road;


public class Motorcycle extends Vehecile {

    public Motorcycle() {
    }

    public Motorcycle(String registrationNumber, String brand, int year) {
        super(registrationNumber, brand, year);
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
