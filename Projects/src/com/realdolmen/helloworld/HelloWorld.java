/**
 * Created by stannisbaratheon on 30/05/16.
 */
package com.realdolmen.helloworld;

import java.math.BigDecimal;
import java.time.*;

public class HelloWorld {

    public static void main(String[] args){

        int x = 0;

        double y = 3.14;

        BigDecimal d = BigDecimal.ZERO;

        String msg = "\"Hello World!\"";

        ZoneId zi = ZoneId.systemDefault();

        Clock c = Clock.system(zi);

        System.out.println("From: " + c.getZone().getId());

        System.out.println(msg);
    }

}
