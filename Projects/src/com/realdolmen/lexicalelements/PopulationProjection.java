package com.realdolmen.lexicalelements;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by stannisbaratheon on 01/06/16.
 */
public class PopulationProjection {
    public static void main(String[] args) {

        BigDecimal startPopulation = new BigDecimal("312032486");
        BigDecimal birth = new BigDecimal(1);
        BigDecimal death = new BigDecimal(1);
        BigDecimal immig = new BigDecimal(1);
        BigDecimal divideAm= new BigDecimal(7);
        BigDecimal divideAmDeath= new BigDecimal(13);
        BigDecimal divideAmImmig= new BigDecimal(45);
        BigDecimal sixtyValue = new BigDecimal(60);
        BigDecimal yearValue = new BigDecimal(365);
        BigDecimal dayValue = new BigDecimal(24);

        birth = birth.multiply(sixtyValue).multiply(sixtyValue).multiply(dayValue).multiply(yearValue).divide(divideAm,2,RoundingMode.HALF_DOWN);
        death = death.multiply(sixtyValue).multiply(sixtyValue).multiply(dayValue).multiply(yearValue).divide(divideAmDeath,2,RoundingMode.HALF_DOWN);
        immig = immig.multiply(sixtyValue).multiply(sixtyValue).multiply(dayValue).multiply(yearValue).divide(divideAmImmig,2,RoundingMode.HALF_DOWN);

        BigDecimal result = startPopulation.add(birth).add(immig).subtract(death);

        System.out.println("Year 1: " + result);
        result = result.add(birth).add(immig).subtract(death);
        System.out.println("Year 2: " + result);
        result = result.add(birth).add(immig).subtract(death);
        System.out.println("Year 3: " + result);
        result = result.add(birth).add(immig).subtract(death);
        System.out.println("Year 4: " + result);
        result = result.add(birth).add(immig).subtract(death);
        System.out.println("Year 5: " + result);



    }
}
