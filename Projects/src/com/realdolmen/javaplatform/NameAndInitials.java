package com.realdolmen.javaplatform;

import java.util.Scanner;

/**
 * Created by stannisbaratheon on 01/06/16.
 */
public class NameAndInitials {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your Firstname: ");
        String firstName = scan.nextLine();
        System.out.print("Please enter your Middlename: ");
        String middleName = scan.nextLine();
        System.out.print("Please enter your Lastname: ");
        String lastName  = scan.nextLine();

        char initialF = firstName.charAt(0);
        char initialM = middleName.charAt(0);
        char initialL = lastName.charAt(0);

        System.out.println("The initials are : " + initialF + initialM + initialL);
    }
}
