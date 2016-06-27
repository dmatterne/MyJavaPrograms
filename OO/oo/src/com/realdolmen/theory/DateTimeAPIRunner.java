package com.realdolmen.theory;

import sun.util.locale.provider.DateFormatProviderImpl;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;

/**
 * Created by stannisbaratheon on 14/06/16.
 */
public class DateTimeAPIRunner {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();

        LocalDate then = now.with(ChronoField.DAY_OF_WEEK,7);

        System.out.println(then);


        // LocalDate ldt = LocalDate.of()

        LocalDate date = LocalDate.from(LocalDate.now());
        System.out.println(date);

        LocalDate a = LocalDate.of(2016, Month.JANUARY,1);
        LocalDate b = LocalDate.of(2017, Month.JANUARY,1);

        Period p = Period.between(a,b);

        System.out.println(p.normalized());
        System.out.println(a);


        DateTimeFormatter df = DateTimeFormatter.ofPattern("DD/MM/YYYY");

        //df.FORMAT(DATE) + df.PARSE (String)

        String s = df.format(a);

        System.out.println(s);
//
        DateTimeFormatter f = DateTimeFormatter.ofPattern(("dd/MM/yyyy"));

        String y = "15/07/1983";

        LocalDate d = LocalDate.from(f.parse(y));
        System.out.println(d.getDayOfWeek());

        d = d.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));



        //d = d.plus(7, ChronoUnit.DAYS);
        System.out.println(d);


    }

}
