package com.realdolmen.craps;

import java.util.Random;

/**
 * Created by stannisbaratheon on 10/06/16.
 */
public class Craps {

    public static void main(String[] args) {

        boolean isFinished = false;
        int w = 0;
        while(!isFinished) {

            int x = generateRandomNumber(6);
            int y = generateRandomNumber(6);
            int z = x + y;


            if ((z == 2) || (z == 3) || (z == 12) || (z== 7 && w != 0)) {
                System.out.println("You Lose :( z: " + z + " x:" + x + " y:" + y + " w:" + w);
                isFinished = true;
            } else if ((z== 7 && w == 0) || z == 11 || z == w) {
                System.out.println("You Win!!!!! z: " + z + " x:" + x + " y:" + y + " w:" + w);
                isFinished = true;
            } else if (w == 0) {
                w = z;
            }



        }

    }


    public static int generateRandomNumber(int upperbound) {
        // return (int) (Math.random() * (6 - 1)) + 1;
        return new Random().nextInt(upperbound) +1;
    }
}
