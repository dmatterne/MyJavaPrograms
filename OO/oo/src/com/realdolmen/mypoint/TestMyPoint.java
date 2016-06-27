package com.realdolmen.mypoint;

/**
 * Created by stannisbaratheon on 03/06/16.
 */
public class TestMyPoint {

    public static void main(String[] args) {
        MyPoint a = new MyPoint(1,1);
        MyPoint b = new MyPoint(2,2);

        System.out.println("The position of point a =" + a.toString());
        System.out.println("The position of point b =" + b.toString());

        a.setXY(1,3);
        b.setX(5);
        b.setY(7);


        System.out.println("The position of point a has been updated to =" + a.getX() + " and " + a.getY());
        System.out.println("The position of point b has been updated to =" + a.getX() + " and " + a.getY());

        System.out.println("The distance from point a to (1,1) is" + a.distance(1,1));
        System.out.println("The distance from point b to (1,1) is" + b.distance(1,1));

        System.out.println("The distance from point a to b is" + a.distance(b));
/*
        MyPoint[] arrayPoints = new MyPoint[10];

        for (int i = 1; i <= arrayPoints.length; i++) {
            arrayPoints[i-1].setXY(i,i);

        }

        for (int i = 1; i <= arrayPoints.length; i++) {
            System.out.println("Print array for i =" + i + " : " + arrayPoints[i-1].toString());

        }
*/

    }


}
