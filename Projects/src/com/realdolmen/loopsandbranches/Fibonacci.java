package com.realdolmen.loopsandbranches;

//import com.realdolmen.loopsandbranches.UsefullMethods;

/**
 * Created by stannisbaratheon on 02/06/16.
 */
public class Fibonacci {

    public static void main(String[] args) {

        UsefullMethods.printLine("The first 20 Fibonacci numbers are: ");

        int valueOne = 0;
        int valueTwo = 1;
        int sum = 0;


        for (int i=0; i < 20; i++) {
            if (i==0) {
                sum = valueTwo;

            } else {
                sum = valueOne + valueTwo;
                valueOne = valueTwo;
                valueTwo = sum;
            }

            UsefullMethods.printWord(sum + " ");
        }

    }



}
