package Geo;

import java.util.Date;

public class Rectrangle extends GeomatryObject {

    private double width;
    private double height;

    public Rectrangle() {
    }

    public Rectrangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectrangle(double width, double height, String color, Boolean filled, Date date) {
        super(color, filled, date);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {

        double area = height * width;
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = 2 * (height + width);
        return perimeter;
    }

}
