
package Pak;


public class Truck extends Vehicle {
   
    private int weight;

    public Truck() {
    }

    public Truck(int weight) {
        this.weight = weight;
    }

    public Truck(int weight, int speed, double regularprice, String color) {
        super(speed, regularprice, color);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public double getSaleprice() {
        
        if(weight>2000){
         
           double price= getRegularprice()*.90;
           return price;
        }
        return getRegularprice();
    }
    
    
}
