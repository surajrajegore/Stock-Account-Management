package com.bridgelabz;

public class StockAccountManagement {
    public static void main(String[] args) {
        int choice = 0;
        System.out.println("Welcome to stock management program");

        StockManager stockManager = new StockManager();
        do {
            System.out.println("Select the option from below : " + "\n1.Buy Shares" + "\n2.Sell Shares" + "\n3.Credit Amount" + "\n4.Debit Amount\n" + "5.Print Account Balance\n" + "6.Print Portfolio details\n" + "\n7.Exit program");
            choice = Input.getInt();
            double amount= 0;
            String symbol;

            switch (choice) {
                case 1:
                    System.out.println("Enter which Stock you want to buy : ");
                    symbol = Input.getString();
                    System.out.println("Enter how much you would like to spend on Share : ");
                    amount = Input.getDouble();
                    stockManager.buyShare(amount, symbol);
                    break;
                case 2:
                    System.out.println("Enter which Stock you want to sell : ");
                    symbol = Input.getString();
                    System.out.println("Enter how much you would like to spend on Share : ");
                    double numberOfShares = Input.getDouble();
                    stockManager.buyShare(amount, symbol);
                    break;
                case 3:
                    System.out.println("Enter the amount to deposit in yout account : ");
                    amount = Input.getDouble();
                    Account.creditAmount(amount);
                    break;
                case 4:
                    Account.debitAmount(amount);
                    break;
                case 5:
                    stockManager.valueOf();
                    break;
                case 6:
                    stockManager.printStockDetails();
                    break;
                case 7:
                    System.out.println("Bye....");
                    break;
                default:
                    System.out.println("Enter Valid operation");
            }
        } while (choice != 7);
    }

}
