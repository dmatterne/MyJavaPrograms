package com.realdolmen.statementsandblocks;

import java.util.Scanner;

/**
 * Created by stannisbaratheon on 01/06/16.
 */
public class StringManipulator {
    public static void main(String[] args) {
        System.out.print("Please enter first and lastname: ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        String firstName = name.substring(0,name.indexOf(" "));
        String lastName = name.substring(name.indexOf(" ") +1);

        System.out.println("Correct name: " +firstName + " " + lastName.toUpperCase());
    }
}
