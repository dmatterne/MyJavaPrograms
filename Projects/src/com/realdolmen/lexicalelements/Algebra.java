package com.realdolmen.lexicalelements;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 * Created by stannisbaratheon on 01/06/16.
 */
public class Algebra {
    public static void main(String[] args) {
        System.out.println("Enter a and b and e if ax + by = e and");
        System.out.println("Enter c and d and f if cx + dy = f: ");

        Scanner scan = new Scanner(System.in);
        System.out.print("a: ");
        BigDecimal a = scan.nextBigDecimal();
        System.out.print("b: ");
        BigDecimal b = scan.nextBigDecimal();
        System.out.print("e: ");
        BigDecimal e = scan.nextBigDecimal();
        System.out.print("c: ");
        BigDecimal c = scan.nextBigDecimal();
        System.out.print("d: ");
        BigDecimal d = scan.nextBigDecimal();
        System.out.print("f: ");
        BigDecimal f = scan.nextBigDecimal();


        BigDecimal x = new BigDecimal(0);
        x = x.setScale(2, RoundingMode.DOWN);

        BigDecimal y = new BigDecimal(0);
        y = y.setScale(2, RoundingMode.DOWN);

        x = ((e.multiply(d)).subtract(b.multiply(f))).divide((a.multiply(d)).subtract(b.multiply(c)),2,RoundingMode.DOWN);

        y = ((a.multiply(f)).subtract(e.multiply(c))).divide((a.multiply(d)).subtract(b.multiply(c)),2,RoundingMode.DOWN);


        System.out.println("X is : " + x);
        System.out.println("Y is : " + y);
    }
}
