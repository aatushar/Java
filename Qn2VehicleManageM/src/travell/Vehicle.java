package travell;

public abstract class  Vehicle {

    private String registrationNumber;
    private String brand;
    private int Year;

    public  Vehicle() {
    }

    public Vehicle(String registrationNumber, String brand, int Year) {
        this.registrationNumber = registrationNumber;
        this.brand = brand;
        this.Year = Year;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }
    
   public abstract void start();
   public abstract void stop();
   
}
