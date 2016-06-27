package com.realdolmen.theory;

/**
 * Created by stannisbaratheon on 20/06/16.
 */
public class ThreadsTest extends Thread {

    private int count = 0;

    public void run() {
        System.out.println("This runs from a different thread");

        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread sais hi" + count++);
        }
    }
}
