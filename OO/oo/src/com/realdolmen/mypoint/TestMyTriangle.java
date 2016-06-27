package com.realdolmen.mypoint;

/**
 * Created by stannisbaratheon on 03/06/16.
 */
public class TestMyTriangle {
    public static void main(String[] args) {
        MyTriangle t1 = new MyTriangle(1,1,2,2,2,1);
        MyPoint p1 = new MyPoint(1,1);
        MyPoint p2 = new MyPoint(2,2);
        MyPoint p3 = new MyPoint(2,1);
        MyTriangle t2 = new MyTriangle(p1,p2,p3);

        System.out.println(t1.printType() + " and permiter " + t1.getPerimeter());
        System.out.println(t2.printType() + " and permiter " + t2.getPerimeter());


    }
}
