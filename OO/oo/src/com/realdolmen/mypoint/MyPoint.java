package com.realdolmen.mypoint;

/**
 * Created by stannisbaratheon on 03/06/16.
 */
public class MyPoint {

    int x = 0, y=0;

    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString () {
        return "(" + x + "," + y + ")" ;
    }

    public double distance(int x, int y) {
        return Math.sqrt(Math.pow((x - this.x),2) + Math.pow((y - this.y),2));
    }

    public double distance(MyPoint b) {
        return Math.sqrt(Math.pow((b.getX() - this.x),2) + Math.pow((b.getY() - this.y),2));

    }




    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x,int y) {
        this.x = x;
        this.y = y;
    }


}
