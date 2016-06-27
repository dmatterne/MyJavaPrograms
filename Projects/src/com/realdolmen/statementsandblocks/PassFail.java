package com.realdolmen.statementsandblocks;

/**
 * Created by stannisbaratheon on 01/06/16.
 */
public class PassFail {
    public static void main(String[] args) {
        int mark = 20;

        boolean checkPassFail;

        System.out.println(CheckPassFail(mark) ? "PASS" : "FAIL");

    }

    static boolean CheckPassFail(int mark) {
        return mark >= 50 ? true : false;
    }
}
