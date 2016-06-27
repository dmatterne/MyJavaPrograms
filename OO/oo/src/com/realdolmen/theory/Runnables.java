package com.realdolmen.theory;

/**
 * Created by stannisbaratheon on 20/06/16.
 */
public class Runnables {

    public static void main(String[] args) {
        MyTask task = new MyTask();
        Thread r = new Thread(task);

        r.start();
    }

}


class MyTask implements Runnable{
    @Override
    public void run() {

    }
}