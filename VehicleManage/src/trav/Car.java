
package trav;


public class Car extends Vehicle{

    public Car() {
    }

    public Car(String regestrationNumber, String brand, int year) {
        super(regestrationNumber, brand, year);
    }

    
    
    @Override
    public void start() {
        System.out.println("Car engine started;");
    }

    @Override
    public void stop() {
        System.out.println("Car engine stopped");
    }
    
}
