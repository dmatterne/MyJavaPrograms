package com.realdolmen.lexicalelements;

import java.util.Scanner;

/**
 * Created by stannisbaratheon on 01/06/16.
 */
public class Physics {
    public static void main(String[] args) {
        System.out.println("Please enter the take-off speed of your airplane in v: ");
        Scanner scan = new Scanner(System.in);
        double v = scan.nextDouble();

        System.out.println("Please enter the acceleration of your airplane in meters/second squared: ");
        double acc = scan.nextFloat();

        double result = Math.pow(v,2) / (2 * acc);

        System.out.println("The result is : "+ result);

    }
}
