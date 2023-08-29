
package trav;


public abstract class Vehicle {
    private String regestrationNumber;
    private String brand;
    private int year;

    public Vehicle() {
    }

    public Vehicle(String regestrationNumber, String brand, int year) {
        this.regestrationNumber = regestrationNumber;
        this.brand = brand;
        this.year = year;
    }

    public String getRegestrationNumber() {
        return regestrationNumber;
    }

    public void setRegestrationNumber(String regestrationNumber) {
        this.regestrationNumber = regestrationNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
   public abstract void start(); 
   public abstract void stop(); 
}
