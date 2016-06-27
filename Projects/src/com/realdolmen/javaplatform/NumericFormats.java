package com.realdolmen.javaplatform;

/**
 * Created by stannisbaratheon on 31/05/16.
 */
public class NumericFormats {
    public static void main(String[] args) {
        int x = 0x67; // hexadecimal
        int y = 0144; // octal
        Long z = 3467L; // Long
        int u = 0b01001111; // binary
        float v = 3.14F; //Float

        System.out.println(u);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(v);

        int i = 5;
        int j = 2;
        int k = i/j;
        Long l = Long.valueOf(i/j);

        Float m = 5F;
        Long n = 2L;
        Float o = m / n;


        System.out.println(k);
        System.out.println(l);
        System.out.println(o);

        int p = 5;
        int q = 2 ;
        float r = (float) p/q;


        System.out.println(r);
    }
}
