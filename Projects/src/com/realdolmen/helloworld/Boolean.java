package com.realdolmen.helloworld;

/**
 * Created by stannisbaratheon on 02/06/16.
 */
public class Boolean {

    public static void main(String[] args) {
        startProgram();
    }

    static void startProgram() {
        int prime = UsefullMethods.readInt("Please enter a number to be verified :");
        if (prime == -1) {
            System.out.println("Exit Program;");
            System.exit(0);
        } else {
            System.out.println(isPrime(prime));
            startProgram();
        }

    }

    static boolean isPrime(int n) {
        boolean bl = true;
        int mod = 0;
        for (int i = 2; i < 9; i++) {
            if (i != n) {
                mod = n % i;
                //System.out.println(mod);
                if (mod == 0) {
                    bl = false;
                }
            }
        }

        return bl;
    }

}
