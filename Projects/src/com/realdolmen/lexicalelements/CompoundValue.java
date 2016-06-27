package com.realdolmen.lexicalelements;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by stannisbaratheon on 01/06/16.
 */
public class CompoundValue {
    public static void main(String[] args) {
        BigDecimal monthlyPercentage = new BigDecimal(5);
        BigDecimal hundred = new BigDecimal(100);
        BigDecimal twelve= new BigDecimal(12);
        BigDecimal one= new BigDecimal(1);

        BigDecimal startAmount = new BigDecimal(100);

        monthlyPercentage = monthlyPercentage.divide(hundred,5, RoundingMode.HALF_DOWN).divide(twelve,5,RoundingMode.HALF_DOWN).add(one);

        System.out.println("The monthly percentage is :" + monthlyPercentage);


        BigDecimal sixMonth = new BigDecimal(0);

        sixMonth = startAmount.multiply(monthlyPercentage);

        System.out.println(sixMonth);

        sixMonth = startAmount.add(sixMonth.multiply(monthlyPercentage));
        sixMonth = startAmount.add(sixMonth.multiply(monthlyPercentage));
        sixMonth = startAmount.add(sixMonth.multiply(monthlyPercentage));
        sixMonth = startAmount.add(sixMonth.multiply(monthlyPercentage));
        sixMonth = startAmount.add(sixMonth.multiply(monthlyPercentage));
        sixMonth = startAmount.add(sixMonth.multiply(monthlyPercentage));

        System.out.println("After 6 months: " + sixMonth);


    }
}
