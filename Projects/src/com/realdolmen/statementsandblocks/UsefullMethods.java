package com.realdolmen.statementsandblocks;

import java.util.Scanner;

/**
 * Created by stannisbaratheon on 02/06/16.
 */
public class UsefullMethods {

    public static void main(String[] args) {

    }

    static void printLine(String message) {
        System.out.println(message);
    }

    static void printWord(String message) {
        System.out.print(message);
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
