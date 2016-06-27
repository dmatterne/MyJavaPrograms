package com.realdolmen.theory;

import java.time.*;
import java.util.Date;

/**
 * Created by stannisbaratheon on 14/06/16.
 */
public class DateTimeAPI {
    public static void main(String[] args) {

//        Date d = new Date();
//
//        d.setHours(12);
//
//        System.out.println(d);


        LocalDate d = LocalDate.now();
        LocalTime t = LocalTime.now();
        LocalDateTime dt = LocalDateTime.now();
        ZonedDateTime zdt = ZonedDateTime.now();


        System.out.println(d);
        System.out.println(t);
        System.out.println(dt);
        System.out.println(zdt);

        System.out.println(zdt.getDayOfMonth() + " " + zdt.getMonth() + " " + zdt.getYear());

        Instant from = Instant.from(zdt);
        System.out.println(from);

        Duration e = Duration.between(from,Instant.now());

        System.out.println(e);

        ZonedDateTime zdt2 = ZonedDateTime.parse("1983-07-15T17:00:00+02:00");

        Instant from2 = Instant.from(zdt2);
        System.out.println(from2);

        Duration f = Duration.between(from2,Instant.now());

        System.out.println(f);

        LocalDate x = LocalDate.of(1983,7,15);
        LocalDate y = LocalDate.of(2016,6,14);

        Period g = Period.between(x,y);

        System.out.println(g);





    }
}
