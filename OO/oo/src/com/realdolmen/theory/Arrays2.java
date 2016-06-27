package com.realdolmen.theory;

/**
 * Created by stannisbaratheon on 10/06/16.
 */
public class Arrays2 {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5, 6, 7, 8};

        for (int i = 0; i < a.length; i++) {
            //System.out.println(a[i]);
        }


        int[] b = new int[10000];

        for (int i = 0; i < b.length; i++) {
            b[i] = (i + 1) * 7;
            //System.out.println(b[i]);
        }


        double[] c = new double[100];

        for (int i = 0; i < c.length; i++) {
            c[i] = 1.0 / (i + 1) * 7;
            //System.out.println(c[i]);
        }


//        String[] d = new String[10];
//
//        for (int i = 0; i < args.length; i++) {
//            System.out.println(args[i]);
//        }

        //args can be found in java -help

        if (args.length > 0 && args[0].equals("-l")) {
            System.out.println("LIST VERBOSE");
        }


        int[][] v2 = {
                {1, 2, 3},
                {1, 2, 3},
                {1, 2, 3},

        };


        for (int[] u : v2) {
            for (int a2 : u) {
                System.out.print(a2 + " \t");
            }
            System.out.println("");
        }


    }


}
