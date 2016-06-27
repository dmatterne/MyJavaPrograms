package com.realdolmen.statementsandblocks;

import java.lang.Math;

/**
 * Created by stannisbaratheon on 01/06/16.
 */
public class RandomNumber {
    public static void main(String[] args) {

        double a = Math.random();

        int r = (int) (Math.random() * (20 - 5)) + 5;

        System.out.println(r);


    }
}
