package com.realdolmen.javaplatform;

import java.util.Scanner;

/**
 * Created by stannisbaratheon on 01/06/16.
 */
public class CookieCalories {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the number of cookies you ate: ");
        int cookies = scan.nextInt();

        int calPerCookie = 300 / (40 / 10);

        int calIntake = cookies * calPerCookie;

        System.out.println("The number of calories eaten is :"  + calIntake);


    }
}
