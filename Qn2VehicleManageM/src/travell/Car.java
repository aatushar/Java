
package travell;


public class Car extends Vehicle{

    public Car() {
    }

    public Car(String registrationNumber, String brand, int Year) {
        super(registrationNumber, brand, Year);
    }

    
    
    
    @Override
    public void start() {
        System.out.println("Car Start");
    }

    @Override
    public void stop() {
        System.out.println("Car Stop");
    }
    
}
