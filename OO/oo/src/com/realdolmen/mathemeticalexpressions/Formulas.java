package com.realdolmen.mathemeticalexpressions;

/**
 * Created by David on 6/06/2016.
 */
public class Formulas {


    public static double formula1(double a, double m1, double m2, double p) {

        return (4 * Math.pow(Math.PI,2)) * (Math.pow(a,3) / (Math.pow(p,2) * (m1+m2)))
                ;
    }

    public static double formula2(double a, double b,double y){
        return Math.sqrt( Math.pow(a,2) + Math.pow(b,2) - (2 * a * b * Math.cos(y)));
    }

}
