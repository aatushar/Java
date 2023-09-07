package vehecilemanagent2;

import road.Car;
import road.Motorcycle;
import road.Vehecile;

public class VehecileManagent2 {

    public static void main(String[] args) {
        Vehecile car = new Car();
        Vehecile motorcycle = new Motorcycle();

        car.start();
        car.stop();

        motorcycle.start();
        motorcycle.stop();

    }

}
