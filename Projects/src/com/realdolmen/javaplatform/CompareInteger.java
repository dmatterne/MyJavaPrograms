package com.realdolmen.javaplatform;

import java.util.Scanner;

/**
 * Created by stannisbaratheon on 31/05/16.
 */
public class CompareInteger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int num2 = scan.nextInt();

        if (num == num2) {
            System.out.println("Both Numbers are equal with value " + num);
        } else if (num >= num2) {
            System.out.println(num + " is bigger");
        } else {
            System.out.println(num2 + " is bigger");
        }


    }  
}
