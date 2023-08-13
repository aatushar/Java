
package geo;

import java.util.Date;


public class Circle extends Geo {

    public Circle() {
    }

    public Circle(Date dateCreated) {
        super(dateCreated);
    }

    public Circle(boolean filled, Date dateCreated) {
        super(filled, dateCreated);
    }
    
    
    

    @Override
    public double getArea() 
    this.radius = radius;
    {
        double area= Math.PI*radius*radius;
        return area;
    }

    @Override
    public double getPerimeter() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
