package com.realdolmen.statementsandblocks;

/**
 * Created by stannisbaratheon on 01/06/16.
 */
public class ProductPrice {
    public static void main(String[] args) {
        int price = 35;
        int quantity = 5;
        int taxRate= 21;

        double taxPrc =  ((double) taxRate / 100 ) + 1;

        double total = (double) ((price * quantity) * taxPrc);

        System.out.println(price + " " + quantity + " " + taxRate + " " +total);
    }
}
