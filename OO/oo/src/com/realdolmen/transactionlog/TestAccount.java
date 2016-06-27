package com.realdolmen.transactionlog;

import java.util.ArrayList;

/**
 * Created by stannisbaratheon on 08/06/16.
 */
public class TestAccount {

    public static void main(String[] args) {

        ArrayList<Double> transaction = new ArrayList<>();
        ArrayList<Double> initAcc = new ArrayList<>() ;

        initAcc.add(30.6);

        transaction.add(0.0);
        transaction.add(1.0);
        transaction.add(2.0);
        transaction.add(3.0);
        transaction.add(4.0);

        Account a = new Account(initAcc);
        a.addTransactions(transaction);

        a.printTransactionDetails();


    }
}
