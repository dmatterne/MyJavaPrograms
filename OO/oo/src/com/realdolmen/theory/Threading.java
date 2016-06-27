package com.realdolmen.theory;

/**
 * Created by stannisbaratheon on 20/06/16.
 */
public class Threading {
    public static void main(String[] args) {
        ThreadsTest t = new ThreadsTest();

        t.start();

        while(true) {
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();

            }
            System.out.println("Main Thread");
        }

    }
}
