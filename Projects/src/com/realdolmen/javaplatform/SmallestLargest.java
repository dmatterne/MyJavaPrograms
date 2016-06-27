package com.realdolmen.javaplatform;

import java.util.Scanner;

/**
 * Created by stannisbaratheon on 31/05/16.
 */
public class SmallestLargest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        int a = num;
        int b = num2;
        int c = num3;
//        int biggestNumber = 0;

        double sum = a + b + c;

        int maxNr = Math.max(Math.max(a,b),Math.max(b,c));
        int minNr= Math.max(Math.min(a,b),Math.min(b,c));
        float avgNr= (float) sum / 3;
        int prod = a * b * c;


//        if (a >= b) {
//            if (a >= c) {
//                biggestNumber = a;
//            } else {
//                biggestNumber = c;
//            }
//        } else {
//            if (b >= c) {
//                biggestNumber = b;
//            } else {
//                biggestNumber = c;
//            }
//        }

        Integer j = new Integer(5);

        System.out.println("The sum of the numbers is " + sum);
        //System.out.println("The Biggest Number is " + biggestNumber );
        System.out.println("The Biggest Number is " + maxNr );
        System.out.println("The Smallest Number is " + minNr );
        System.out.println("The Average is " + avgNr );
        System.out.println("The Product is " + prod );




    }
}
