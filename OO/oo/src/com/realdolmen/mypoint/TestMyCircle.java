package com.realdolmen.mypoint;

/**
 * Created by stannisbaratheon on 03/06/16.
 */
public class TestMyCircle {

    public static void main(String[] args) {
        MyCircle circle1 = new MyCircle(1,1,1);
        MyPoint punt1 = new MyPoint(2,2);
        MyCircle circle2 = new MyCircle(punt1,2);

        System.out.println("Circle1: " + circle1.toString());
        System.out.println("Circle2: " + circle2.toString());

        System.out.println("Circle Description: " + circle1.getCenter() + " " + circle1.getRadius()
                + " area =" + circle1.getArea() );

        System.out.println("Circle Description: " + circle2.getCenterX() + circle2.getCenterY() +
                " " + circle2.getRadius() + " area =" + circle2.getArea()
        );



    }

}
