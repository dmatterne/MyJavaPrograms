package com.realdolmen.datetheorytask;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

/**
 * Created by stannisbaratheon on 15/06/16.
 */
public class Task1 {

    public static void main(String[] args) {

        LocalDate startDate = LocalDate.of(2000,Month.JANUARY,1);

        LocalDate then = startDate.with(ChronoField.DAY_OF_WEEK,5);

        LocalDate endDate = LocalDate.of(2999,Month.DECEMBER,31);


        if (then.isBefore(startDate) ) {
            then = then.plus(7, ChronoUnit.DAYS);
        }

        System.out.println(then);

        while (then.isBefore(endDate)) {
            if (then.getDayOfMonth() == 13) {
                System.out.println(then);
            }

            then = then.plus(7, ChronoUnit.DAYS);

        }

//        //Period.between
//
//        LocalDate d1From = LocalDate.parse("2000-01-01T00:00:00+02:00");
//        LocalDate d1To = LocalDate.parse("2999-12-31T24:00:00+02:00");
//
//
//
//        while (d1From.isBefore(d1To)) {
//
//
//        }

    }
}
