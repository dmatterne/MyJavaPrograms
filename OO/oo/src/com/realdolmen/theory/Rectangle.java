package com.realdolmen.theory;

/**
 * Created by stannisbaratheon on 09/06/16.
 */
public class Rectangle implements Shape {

    private double width;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    private double height;

    public Rectangle() {

    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double surface() {
        return width * height;
    }

    @Override
    public double perimiter() {
        return (width * height) * 2;
    }
}
