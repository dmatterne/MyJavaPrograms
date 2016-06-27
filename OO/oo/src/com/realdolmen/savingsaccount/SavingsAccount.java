package com.realdolmen.savingsaccount;

/**
 * Created by stannisbaratheon on 02/06/16.
 */
public class SavingsAccount {



    private static double annualInterestRate = 0.22;
    private double savingsBalance;

    public SavingsAccount (double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }


    public void calculateMonthlyInterest() {

        double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
        System.out.println(monthlyInterest);
        savingsBalance += monthlyInterest;

    }

    public static void modifyInterestRate (double annualInterestRate) {
        SavingsAccount.annualInterestRate = annualInterestRate;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        SavingsAccount.annualInterestRate = annualInterestRate;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

}
