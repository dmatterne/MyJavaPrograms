package com.realdolmen.savingsaccount;

/**
 * Created by stannisbaratheon on 02/06/16.
 */
public class Banking {

    public static void main(String[] args) {

        SavingsAccount saver1 = new SavingsAccount(UsefullMethods.readDouble("Please enter the first salary: "));
        SavingsAccount saver2 = new SavingsAccount(UsefullMethods.readDouble("Please enter the second salary: "));

        SavingsAccount.setAnnualInterestRate(UsefullMethods.readDouble("Please enter the updated interest rate: "));

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        UsefullMethods.printLine("The montly savings including interest for saver1 is :" + (saver1.getSavingsBalance()
                )
        );
        UsefullMethods.printLine("The montly savings including interest for saver2 is :" + (saver2.getSavingsBalance()
                )
        );

        

    }
}
