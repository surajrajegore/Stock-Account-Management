package com.bridgelabz;

public class Account {
    double accountBalance = 0;

    void checkAccountBalance() {
        System.out.println("Account balance is: " + accountBalance);
    }

    void creditAmount() {
        System.out.println("Enter amount you would deposit");
        double amount = Input.getDouble();
        accountBalance = accountBalance + amount;
        System.out.println(amount + "you have credited and your account balance is: " + amount);
    }

    void debitAmount() {
        System.out.println("Enter the amount you would like to withdraw : ");
        double amount = Input.getDouble();
        if (amount < accountBalance) {
            accountBalance = accountBalance - amount;
            System.out.println(amount + " debited and remaining banalce is " + accountBalance);
        } else {
            System.out.println("Insufficient amount, Kindly credit the amount");
        }
    }
}
