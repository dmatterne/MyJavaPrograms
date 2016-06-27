package com.realdolmen.datetheorytask;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

/**
 * Created by stannisbaratheon on 15/06/16.
 */
public class Task2 {
    public static void main(String[] args) {


        long p = daysUntilNextBirthday();

        System.out.println(p);


    }

    private static long daysUntilNextBirthday() {
        LocalDate now = LocalDate.now();
        LocalDate birthDate = LocalDate.of(1985, Month.DECEMBER, 17);


//        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        LocalDate birthd = LocalDate.from(f.parse("17/12/1985"));


        LocalDate nextBirthday = birthDate.with(ChronoField.YEAR,now.getYear());

        if (nextBirthday.isBefore(now)) {
            nextBirthday.plus(1, ChronoUnit.YEARS);
        }

        //System.out.println(nextBirthday);


        return ChronoUnit.DAYS.between(now,nextBirthday);
    }
}
