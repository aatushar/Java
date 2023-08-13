package Geo;

import java.util.Date;

public abstract class GeomatryObject {

    private String color;
    private Boolean filled;
    private Date date;

    public GeomatryObject() {
    }

    public GeomatryObject(String color, Boolean filled, Date date) {
        this.color = color;
        this.filled = filled;
        this.date = date;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getFilled() {
        return filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    //our abstract method
    public abstract double getArea();

    public abstract double getPerimeter();
}
