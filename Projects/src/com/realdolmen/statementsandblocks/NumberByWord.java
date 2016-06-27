package com.realdolmen.statementsandblocks;

/**
 * Created by stannisbaratheon on 01/06/16.
 */
public class NumberByWord {

    public static void main(String[] args) {
        int number = 5;

        System.out.println("Printed number in word: " + PrintNumberInWord(number));


    }

    static String PrintNumberInWord (int number) {

        String words = "";

        switch (number) {

            case 1 :
                words = "ONE";
                break;
            case 2 :
                words = "TWO";
                break;
            case 3 :
                words = "THREE";
                break;
            case 4 :
                words = "FOUR";
                break;
            case 5 :
                words = "FIVE";
                break;
            case 6 :
                words = "SIX";
                break;
            case 7 :
                words = "SEVEN";
                break;
            case 8 :
                words = "EIGHT";
                break;
            case 9 :
                words = "NINE";
                break;
            default :
                words = "OTHER";
                break;

        }

        return words;
    }

}

