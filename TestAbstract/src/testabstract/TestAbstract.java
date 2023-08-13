package testabstract;

import Geo.Circle;
import Geo.GeomatryObject;
import Geo.Rectrangle;

public class TestAbstract {

    public static void main(String[] args) {
        GeomatryObject circle = new Circle(5);
        GeomatryObject rec = new Rectrangle(10, 6);

        System.out.println("Cirle Area is " + circle.getArea()
                + " premiter is " + circle.getPerimeter());

        System.out.println("Ractrangle Area is " + rec.getArea()
                + " premiter is " + rec.getPerimeter());
    }

}
