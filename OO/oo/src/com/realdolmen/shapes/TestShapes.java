package com.realdolmen.shapes;

/**
 * Created by David on 6/06/2016.
 */
public class TestShapes {

    public static void main(String[] args) {
        Shape s1 = new Rectangle();
        Shape s2 = new Circle(true,"yellow",5);
        Shape s3 = new Square(4,"Purple",true);

        System.out.println("Shape 1 has color " + s1.getColor() + " and filled is "
                + s1.isFilled()
        );

        s2.setColor("purple");
        s2.setFilled(false);

        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());






    }
}
