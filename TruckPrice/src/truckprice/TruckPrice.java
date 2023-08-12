
package truckprice;

import Pak.Truck;


public class TruckPrice {

   
    public static void main(String[] args) {
        Truck  truck = new Truck();
        truck.setRegularprice(1000);
        truck.setWeight(2005);
        
        System.out.println(truck.getSaleprice());
    }
    
}
