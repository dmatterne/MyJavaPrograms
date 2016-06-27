package com.realdolmen.loopsandbranches;

/**
 * Created by stannisbaratheon on 02/06/16.
 */
public class CalculatePI {
    public static void main(String[] args) {
        startProgram();
    }


    static void startProgram() {

        double n = UsefullMethods.readDouble("Please enter the value n: ");
        double pi = 0;
        double sum = 1;
        boolean sign = true;
        int i = 1;
        int r = 0;


        while (i <= n) {

            r = (i * 2) +1;

            if (sign) {
                sum = sum - (double) 1/r;
                sign = false;
            } else {
                sum = sum + (double) 1/r;
                sign = true;
            }

            //UsefullMethods.printLine(""+i);
            i++;

        }

        pi = 4 * sum;

        UsefullMethods.printLine("Pi =" + pi);



    }
}
