/**
 * Created by stannisbaratheon on 30/05/16.
 */
package com.realdolmen.javaplatform;

import java.time.Clock;
import java.time.ZoneId;
import java.util.Date;

/**
 * Dit is het hello world programma, it includes the time
 * @author stannisbaratheon
 * @since 2016-05-31
 * @version 1.0
 */
public class HelloWorld {

    /**
     * This is the boot point of the applications
     * @param args  None
     *     */
    public static void main(String[] args){

        /*

        This displays the current date an stime

        */


        int x = 0;

        double y = 3.14;

        //BigDecimal d = BigDecimal.ZERO;

        String msg = "\"Hello World!\"";

        ZoneId zi = ZoneId.systemDefault();

        Clock c = Clock.system(zi);

        Date a = new Date();

                System.out.println("From: " + c.getZone().getId() + " and Current Time is :" + a);

        System.out.println(msg);

        int e = 5;

        int b = 7;

        int f = e++ * 2;
        int d = ++b * 2;

        System.out.println(e);
        System.out.println(e++);
        System.out.println(e);
        System.out.println("----");
        System.out.println(b);
        System.out.println(++b);
        System.out.println(b);
        System.out.println(f);
        System.out.println(d);
        System.out.println("----");


    }

}
