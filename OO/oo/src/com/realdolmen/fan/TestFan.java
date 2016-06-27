package com.realdolmen.fan;

/**
 * Created by stannisbaratheon on 10/06/16.
 */
public class TestFan {

    public static void main(String[] args) {
        Fan f1 = new Fan();
        Fan f2 = new Fan();
        f1.setSpeed(Speed.FAST.value);
        f2.setSpeed(Speed.MEDIUM.value);

        f1.setRadius(10);
        f2.setRadius(5);

        f1.setColor("Yellow");
        f2.setColor("Blue");

        f1.setOn(true);
        f2.setOn(false);

        System.out.println(f1.toString());
        System.out.println(f2.toString());
    }
}
