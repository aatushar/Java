
package geo;

import java.util.Date;


public abstract class Geo {
    private String color;
    private boolean filled;
    private Date date;

    public Geo() {
    }

    public Geo(Date dateCreated) {
        this.date= new Date();
    }

    public Geo(boolean filled, Date dateCreated) {
        this.filled = filled;
        this.date = date;
        this.color= color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return date;
    }

    public void setDateCreated(Date dateCreated) {
        this.date = date;
    }
    public abstract double gerArea();
    public abstract double gerArea();
 
    @Override
    public String toString() {
        return "Geo{" + "color=" + color + ", filled=" + filled + ", dateCreated=" + dateCreated + '}';
    }

   public abstract double getArea();
   
   
   public abstract double getPerimeter();
    
    
    
}
