package com.realdolmen.shapes;

/**
 * Created by David on 6/06/2016.
 */
public class Cylinder {

    private Circle base ;
    private double height;

    public Cylinder(){

        this(false,"Green",0,0);
    }

    public Cylinder(boolean filled,String color, double radius, double height){
        base = new Circle();
        this.base.setRadius(radius);
        this.base.setFilled(filled);
        this.base.setColor(color);
        this.height = height;
    }

    public Cylinder(Circle base, double height) {
        this.base = base;
        this.height = height;
    }
}
