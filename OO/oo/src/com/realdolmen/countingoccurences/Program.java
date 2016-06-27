package com.realdolmen.countingoccurences;

import java.util.*;

/**
 * Created by stannisbaratheon on 14/06/16.
 */
public class Program {

    public static void main(String[] args) {

        boolean isLast = false;
        TreeMap<Integer, Integer> listnrs = new TreeMap<>();
        //int maxValue;
        //List<Integer> l = new Integer

        while (!isLast) {

            Integer number = (Integer) UsefullMethods.readInt("Please enter a number (0 to stop): ");

            if (number == 0) {

                isLast = true;

            } else {


                if (listnrs.containsKey(number)) {

                    listnrs.put(number, listnrs.get(number) + 1);


                } else {

                    listnrs.put(number, 1);

                }


            }


        }


        for (Map.Entry<Integer, Integer> entry : listnrs.entrySet()) {

            System.out.println("The number " + entry.getKey() + " occurs " + entry.getValue() + " times");

        }


    }
}
