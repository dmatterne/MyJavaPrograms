package com.realdolmen.statementsandblocks;

/**
 * Created by stannisbaratheon on 01/06/16.
 */
public class HelloWorld {
    public static void main(String[] args) {
        String s = "Hello";
        String t = s.toUpperCase();
        System.out.println(t);
        double d = 3.14;
        System.out.println(Math.round(d));

        boolean isActive = true;

        System.out.println(isActive ? "Lets go" : "Hold on");
    }
}
