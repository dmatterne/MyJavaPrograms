package com.realdolmen.lotto;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by stannisbaratheon on 10/06/16.
 */
public class Lotto {

    private int[] numbers;
    private static final int MAX_AMOUNT = 42;

    public Lotto() {


        numbers = new int[6];

        this.generateNumbers();

        Arrays.sort(numbers);
    }

    private void generateNumbers(){

        int i = 0;

        for (i=0;i<numbers.length; i++) {
            while (checkAndStoreNumber(i)) {


            };




        }
    }


//    private void generateNumbers2(){
//        for(int i=0; i <numbers.length;i++) {
//            int candidate = generateRandomNumber(MAX_AMOUNT);
//            while (isDup(candidate,numbers[i])) {
//                candidate = generateRandomNumber(MAX_AMOUNT);
//            }
//
//        }
//    }

//    public static boolean  isDup(int value, int[] previous) {
//        for (int entry : previous) {
//            if (entry == value) {
//                return true;
//            } else {
//                return false;
//            }
//        }
//    }



    public boolean checkAndStoreNumber(int pos) {

        boolean a = false;
        int x = generateRandomNumber(42);

        for (int i = 0; i < pos;i++)  {
            if(numbers[i] == x) {
                a = true;
                          }

        }

        if (!a) {
            this.numbers[pos] = x;
        }

        return a;
    }

    public static int generateRandomNumber(int upperbound) {
        // return (int) (Math.random() * (42 - 1)) + 1;
        return new Random().nextInt(upperbound) +1;
    }


    public String getNumbers() {

        String listNumbers= "";

        for (int number: this.numbers ) {
            listNumbers += number + " \t";
        }


        return listNumbers;
    }



}

