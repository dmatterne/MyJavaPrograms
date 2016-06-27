package com.realdolmen.loopsandbranches;

import java.util.Scanner;

/**
 * Created by stannisbaratheon on 01/06/16.
 */
public class GradeStatistics {
    public static void main(String[] args) {

        startProgram();

    }

    static void startProgram () {
        int numberOfStudents = readInt("Enter the number of students: ");

        int i = 1;
        int value = 0;
        int minValue = 0;
        int maxValue = 0;
        int sumAverage = 0;

        while(i <= numberOfStudents) {
            value = readInt("Enter the grade for student " + i + ": ");

            if (("" + value).equals("-1")) {
                exitApp();
            }

            if (i == 1) {
                minValue = value;
                maxValue = value;
                sumAverage = value;
            } else {
                sumAverage = sumAverage + value;
                if (value > maxValue) {
                    maxValue = value;
                }
                if (value < minValue) {
                    minValue = value;
                }
            }

            i++;

        }


        printLine("The average is " + (sumAverage / numberOfStudents));
        printLine("The minimum is " + minValue);
        printLine("The maximum is " + maxValue);

        startProgram();

    }

    static void printLine(String message) {
        System.out.println(message);
    }

    static String readString(String message) {
        System.out.print(message);
        Scanner scan = new Scanner(System.in);
        return scan.next();
    }

    static int readInt(String message) {
        System.out.print(message);
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    static double readDouble(String message) {
        System.out.print(message);
        Scanner scan = new Scanner(System.in);
        return scan.nextDouble();
    }

    static void exitApp() {
        System.out.println("Cancelled by user");
        System.exit(0);
    }

}
