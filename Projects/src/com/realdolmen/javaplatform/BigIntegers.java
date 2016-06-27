package com.realdolmen.javaplatform;

/**
 * Created by stannisbaratheon on 31/05/16.
 */

import java.math.BigInteger;

/**
 *  @author stannisbaratheon
 *  @version 1.0
 *  @since 2016-05-31
 */
public class BigIntegers {

    public static void main(String[] args) {
        int a = 2000000000;
        int b = 2000000000;
        int d = a + b;


        BigInteger c = new BigInteger("0");
        BigInteger e = new BigInteger("2000000000");
        c = c.add(e);
        c = c.add(e);

        System.out.println(d + " is the sum of 2000000000 and 2000000000 using int");
        System.out.println(c + " is the sum of 2000000000 and 2000000000 using BigDecimal");


    }
}
