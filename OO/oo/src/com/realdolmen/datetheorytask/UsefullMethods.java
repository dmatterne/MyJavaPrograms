package com.realdolmen.datetheorytask;

import java.util.Scanner;

/**
 * Created by stannisbaratheon on 02/06/16.
 */
public class UsefullMethods {

    public static void main(String[] args) {

    }

    public static void printLine(String message) {
        System.out.println(message);
    }

    public static String readString(String message) {
        System.out.print(message);
        Scanner scan = new Scanner(System.in);
        return scan.next();
    }

    public static int readInt(String message) {
        System.out.print(message);
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    public static double readDouble(String message) {
        System.out.print(message);
        Scanner scan = new Scanner(System.in);
        return scan.nextDouble();
    }

    public static void exitApp() {
        System.out.println("Cancelled by user");
        System.exit(0);
    }
}
