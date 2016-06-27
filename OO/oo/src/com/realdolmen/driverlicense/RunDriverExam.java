package com.realdolmen.driverlicense;

import com.realdolmen.countingoccurences.*;

import java.util.TreeMap;

/**
 * Created by stannisbaratheon on 14/06/16.
 */
public class RunDriverExam {

    public static void main(String[] args) {

        TreeMap<Integer,String> answers = new TreeMap<>();

        for(int i = 1; i<=20;i++) {
            answers.put((Integer) i, UsefullMethods.readString("Please enter the answer for question :" + i + ":" ));
        }

    }

}
