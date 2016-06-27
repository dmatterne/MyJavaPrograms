package com.realdolmen.statementsandblocks;

import java.util.Scanner;

/**
 * Created by stannisbaratheon on 01/06/16.
 */
public class SalaryCalculator {

    public static void main(String[] args) {

        startUp();




    }

    static void startUp () {

        String employeename = readString("Please Enter the name of the employee:");
        int numberOfHours = readInt("Please Enter the number of hours worked :");
        double rates = readDouble("Please Enter his/hers hourly rates :");
        double salary = 0;

        if (numberOfHours <= 40) {
            salary = numberOfHours * rates;
        } else salary = (40 * rates) + ((numberOfHours - 40) * (rates * 1.5));

        System.out.println("Employee with name " + employeename + "has a gross pay of " + salary);

        if (employeename.equals("exit")) {
            System.out.println("Exiting App");
            exitApp();
        } else startUp();
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
        System.exit(0);
    }
}
