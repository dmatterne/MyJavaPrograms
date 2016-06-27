package com.realdolmen.javaplatform;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by stannisbaratheon on 01/06/16.
 */
public class IngredientAdjuster {
    public static void main(String[] args) {
        BigDecimal sugar = new BigDecimal("2");
        BigDecimal butter = new BigDecimal("1");
        BigDecimal flour = new BigDecimal("2.75");

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the number of cookies you want to make: ");
        BigDecimal cookies = scan.nextBigDecimal();

        BigDecimal  sugarPerCookie = new BigDecimal(sugar.toString());
        BigDecimal  butterPerCookie = new BigDecimal(butter.toString());
        BigDecimal  flourPerCookie = new BigDecimal(flour.toString());
        BigDecimal  totalCookies = new BigDecimal ("48");




//        double sugarPerCookie= (double) sugar / 48;
//        double butterPerCookie = (double) butter / 48;
//        double flourPerCookie = (double) flour / 48;


// need to adjust the rounding
        System.out.println("You will need " + (sugarPerCookie.divide(totalCookies,1).multiply(cookies)) + " cups of sugar, " + (butterPerCookie.divide(totalCookies,1).multiply(cookies)) + " cups of butter and " + (flourPerCookie.divide(totalCookies,1).multiply(cookies)) + " cups of flour.");
    }
}
