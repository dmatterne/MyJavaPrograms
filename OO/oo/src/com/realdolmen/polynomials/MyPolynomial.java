package com.realdolmen.polynomials;

import java.util.Arrays;

/**
 * Created by stannisbaratheon on 10/06/16.
 */
public class MyPolynomial {

    private double[] coeffs;


    /*public MyPolynomial(double... coeffs) {

        this.coeffs = new double[coeffs.length+1];
        for (double coeff : coeffs) {
            this.coeffs[].
        }

    }*/

    public MyPolynomial(double... coeffs)  {

        this.coeffs = new double[coeffs.length];

        for(int i = 0; i < coeffs.length; i++) {
            this.coeffs[i] = coeffs[i];
        }
    }

    public int getDegree(){
        return this.coeffs.length;
    }

    @Override
    public String toString() {
        String text = "";


        for(int i = coeffs.length,j = 0; i > 0 ; i-- ,j++) {
            if (i == 1) {
                text += coeffs[i-1];
            } else {
                text += coeffs[i-1] + "x^" + (coeffs.length - j) + " + ";
            }

        }

        return text;
    }


    public double evaluate(double x) {

        double total = 0.0;


        for(int i = coeffs.length,j = 0; i > 0 ; i-- ,j++) {
            if (i == 1) {
                total += coeffs[i-1];
            } else {
                total += coeffs[i-1] * (Math.pow(x,(coeffs.length - j)));
            }

        }

        return total;

    }
}
