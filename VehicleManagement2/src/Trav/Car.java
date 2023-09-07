
package Trav;

public class Car extends Vehicle {

    public Car(String registrationNumber, String brand, int year) {
        super(registrationNumber, brand, year);
    }

    public Car() {
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
