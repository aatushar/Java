
package Trav;


public class Motorcycle extends Vehicle {

    public Motorcycle(String registrationNumber, String brand, int year) {
        super(registrationNumber, brand, year);
    }

    public Motorcycle() {
    }

    @Override
    public void start() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void stop() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
