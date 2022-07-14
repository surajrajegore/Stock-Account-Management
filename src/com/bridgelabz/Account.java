package com.bridgelabz;

public class Account {
    static double accountBalance = 0;

    public static double getAccountBalance() {
        return accountBalance;
    }

    public static void setAccountBalance(double accountBalance) {
        Account.accountBalance = accountBalance;
    }

    void checkAccountBalance() {
        System.out.println("Account balance is: " + accountBalance);
    }

    static void creditAmount(double amount) {
        accountBalance = accountBalance + amount;
        System.out.println(amount + "you have credited and your account balance is: " + amount);
    }

    static void debitAmount(double amount) {
        System.out.println("Enter the amount you would like to withdraw : ");
        amount = Input.getDouble();
        if (amount < accountBalance) {
            accountBalance = accountBalance - amount;
            System.out.println(amount + " debited and remaining banalce is " + accountBalance);
        } else {
            System.out.println("Insufficient amount, Kindly credit the amount");
        }
    }
}
