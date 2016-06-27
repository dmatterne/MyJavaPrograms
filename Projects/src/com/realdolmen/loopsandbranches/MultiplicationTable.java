package com.realdolmen.loopsandbranches;

/**
 * Created by stannisbaratheon on 02/06/16.
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        startProgram();
    }

    static void startProgram() {

        int limit = 10;
        int multiplication = 0;

        for (int i = 1; i <= limit; i++) {
            UsefullMethods.printWord(i+"\t|\t");
            for (int j=1; j<= limit; j++) {
                multiplication = i * j;
                UsefullMethods.printWord(multiplication + "\t");
            }
            UsefullMethods.printLine(" | ");
        }

    }
}
