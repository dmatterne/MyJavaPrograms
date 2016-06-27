package com.realdolmen.polynomials;

/**
 * Created by stannisbaratheon on 10/06/16.
 */
public class TestMyPolynomials {

    public static void main(String[] args) {
        MyPolynomial p = new MyPolynomial(1,2,3,4,5,6,7,8,9,10);
        System.out.println(p.toString());
        System.out.println(p.evaluate(10));
    }
}
