package com.realdolmen.loopsandbranches;



/**
 * Created by stannisbaratheon on 02/06/16.
 */
public class TaxCalculator {
    public static void main(String[] args) {
        startProgram();
    }

    static void startProgram() {
        double grossIncome = UsefullMethods.readDouble("Please enter your gross income :");

        double socSecValue = grossIncome * 13.07 / 100;
        double difference = grossIncome - socSecValue;
        //double taxableIncome = 0;
        double taxation = 0;
        double netIncome = 0;
        double leftover = 0;

        UsefullMethods.printLine("The social security value of this income is :" + socSecValue);
        UsefullMethods.printLine("The difference is :" + difference);


        if (isBetween(difference,0,8680)) {
            taxation = difference * 25 / 100;
        } else if (isBetween(difference,8681,12360)) {
            taxation = difference * 30 / 100;
        } else if (isBetween(difference,12361,20600)) {
            taxation = difference * 40 / 100;
        } else if (isBetween(difference,20601,37750)) {
            taxation = difference * 45 / 100;
        } else {
            taxation = difference * 50 / 100;
        }

        UsefullMethods.printLine("The taxation is :" + taxation);

        netIncome = difference - taxation;

        UsefullMethods.printLine("The net income is :" + netIncome);



    }

     static boolean isBetween(double x, int lower, int upper) {
        return lower <= x && x <= upper;
    }
}
