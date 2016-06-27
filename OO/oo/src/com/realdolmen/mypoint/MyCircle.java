package com.realdolmen.mypoint;

/**
 * Created by stannisbaratheon on 03/06/16.
 */
public class MyCircle {
    private MyPoint center = new MyPoint();
    private int radius = 1;

    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public MyCircle(int x, int y, int radius) {
        this.center.setXY(x,y);
        this.radius = radius;
    }


    @Override
    public String toString() {
        return "Circle @ (" + this.center.getX() + "," + this.center.getY() + ") radius=" + this.radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getCenterX() {
        return this.center.getX();
    }

    public int getCenterY() {
        return this.center.getY();
    }

    public void setCenterXY(int x, int y) {
        this.center.setXY(x,y);
    }

    public double getArea() {
        return Math.pow((2 * radius),2) * (Math.PI / 4);
    }




}
