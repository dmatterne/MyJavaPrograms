package com.realdolmen.statementsandblocks;

//import com.realdolmen.statementsandblocks.UsefullMethods;

/**
 * Created by stannisbaratheon on 01/06/16.
 */
public class HarmonicSum {
    public static void main(String[] args) {
        startProgram();
    }

    static void startProgram() {
        int i = 2;
        int j = 4999;
        double sum = 1;
        double sum2 = 1/5000;

        while (i <= 5000) {
            sum = sum + (double) 1/i;
            //UsefullMethods.printLine(""+i);
            i++;

        }

        while (j > 1) {
            sum2 = sum2+ (double) 1/j;
            //UsefullMethods.printLine(""+i);
            j--;

        }

        sum2 = sum2 + 1;

        UsefullMethods.printLine(""+sum);
        UsefullMethods.printLine(""+sum2);
    }
}
