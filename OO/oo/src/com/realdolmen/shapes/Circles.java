package com.realdolmen.shapes;

/**
 * Created by stannisbaratheon on 03/06/16.
 */
public class Circles extends Shape implements GeometricObject {

    protected double radius = 1.0;

    public Circles() {
        super();
    }

    public Circles(double radius) {
        super();
        this.radius = radius;
    }

    public Circles(boolean filled, String color, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getArea() {
        return Math.pow((2 * radius),2) * (Math.PI / 4);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        return (2* Math.PI) * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}' + "and subclass is (" + super.toString() + ")";
    }
}
