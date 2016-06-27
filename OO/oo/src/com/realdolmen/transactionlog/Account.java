package com.realdolmen.transactionlog;

import java.util.ArrayList;

/**
 * Created by stannisbaratheon on 08/06/16.
 */
public class Account {

    private ArrayList<Double> entries = new ArrayList<>();
    private Double total;


    public Account(ArrayList<Double> entries) {

        addEntry(entries);

    }

    public void addTransactions(ArrayList<Double> entries) {
        addEntry(entries);

    }

    private void addEntry(ArrayList<Double> entries) {
        for (int i =0; i < entries.size(); i++) {
            this.entries.add(entries.get(i));
        }
    }

    public double total() {

        total = new Double(0.0);

        for (int i =0; i < entries.size(); i++) {
            total += entries.get(i);
        }




        return total;

    }

    public void printTransactionDetails() {

        for (int i =0; i < entries.size(); i++) {
            System.out.println("Entry " + i + " with value :" + entries.get(i));

        }

        System.out.println("The total is :" + this.total());
    }
}
