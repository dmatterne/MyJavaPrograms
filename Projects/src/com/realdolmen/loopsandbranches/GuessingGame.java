package com.realdolmen.loopsandbranches;

import java.util.Scanner;

/**
 * Created by stannisbaratheon on 02/06/16.
 */
public class GuessingGame {
    public static void main(String[] args) {

        startProgram();

    }


    static void startProgram(){
        int maxNumber = readInt("Please enter the maximum number: ");
        int minNumber = readInt("Please enter the minimum number: ");

        double a = Math.random();

        int r = (int) (Math.random() * (maxNumber - minNumber)) + minNumber;

        int i = 0;

        while (i < 3) {
            int numberOne = readInt("Please guess the correct Number: ");

            if (numberOne == r) {
                printLine("Congratulations, you guessed it!!!");
                i = 3;

            } else if (i == 2) {
                printLine("GAME OVER !!!!!");

            };

            i++;
        }
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
