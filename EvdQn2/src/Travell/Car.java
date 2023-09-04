
package Travell;


public class Car extends Vehicle{

    public Car() {
    }

    public Car(String registrationNumber, String brand, int year) {
        super(registrationNumber, brand, year);
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
