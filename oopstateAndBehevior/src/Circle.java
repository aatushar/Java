package geo;

public class Circle {
    public float radius;

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public Circle(float radius) {
        this.radius = radius;
    }

    
    
    
    
    
    public double getArea (){
        double area =Math.PI*radius*radius;
        
        return area;
    }
    
      public double getPerimeter (){
        double preimeter =2 * Math.PI * radius;
        
        return preimeter;
    }
    }
}
