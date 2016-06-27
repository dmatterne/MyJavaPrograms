package com.realdolmen.mypoint;

/**
 * Created by stannisbaratheon on 03/06/16.
 */
public class MyTriangle {
    private MyPoint v1 = new MyPoint();
    private MyPoint v2 = new MyPoint();
    private MyPoint v3 = new MyPoint();

    public MyTriangle() {
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public MyTriangle(int x1,int y1, int x2, int y2, int x3, int y3) {
        this.v1.setXY(x1,y1);
        this.v2.setXY(x2,y2);
        this.v3.setXY(x3,y3);
    }

    @Override
    public String toString() {
        return "Triangle @ " + v1.toString() + " , " + v2.toString() + " , " + v3.toString() ;
    }

    public MyPoint getV1() {
        return v1;
    }

    public void setV1(MyPoint v1) {
        this.v1 = v1;
    }

    public MyPoint getV2() {
        return v2;
    }

    public void setV2(MyPoint v2) {
        this.v2 = v2;
    }

    public MyPoint getV3() {
        return v3;
    }

    public void setV3(MyPoint v3) {
        this.v3 = v3;
    }

    public double getPerimeter() {
        return v1.distance(v2) + v2.distance(v3) + v3.distance(v1);

    }

    public String printType() {
        if (v1.distance(v2) == v2.distance(v3) && v2.distance(v3) == v3.distance(v1)) {
            return "Equilateral";
        } else if (v1.distance(v2) == v2.distance(v3) || v2.distance(v3) == v3.distance(v1)) {
            return "Isosceles";
        } else { return "Scalene" ;
        }
    }
}
