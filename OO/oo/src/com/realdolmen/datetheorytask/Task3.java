package com.realdolmen.datetheorytask;

import javax.jws.soap.SOAPBinding;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

/**
 * Created by stannisbaratheon on 15/06/16.
 */
public class Task3 {
    public static void main(String[] args) {



        int selectedMonth = UsefullMethods.readInt("Please enter the number value of the month you wish to print: ");

        LocalDate startDate = LocalDate.of(2016, selectedMonth , 1);
        printMonth(startDate, selectedMonth);

    }

    private static void printMonth(LocalDate startDate, int selectedMonth) {
        Month m = Month.of(selectedMonth);

        System.out.println(m + " " + startDate.getYear());

        for (DayOfWeek s: DayOfWeek.values()) {
            System.out.print(s.getDisplayName(TextStyle.SHORT, Locale.ENGLISH) + "\t");
        }
        System.out.println();

        printFiller(startDate);

        while(startDate.getMonth() == m) {


            System.out.print(startDate.getDayOfMonth() + " \t");

            if (startDate.getDayOfWeek()  == DayOfWeek.SUNDAY) {
                System.out.println();
            }

            startDate = startDate.plus(1, ChronoUnit.DAYS);



        }
    }

    private static void printFiller(LocalDate startDate) {
        for (int i = 0 ; i < startDate.getDayOfWeek().getValue() - 1; i++) {
                System.out.print(" \t");
            }
    }
}
