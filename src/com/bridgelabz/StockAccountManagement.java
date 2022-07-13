package com.bridgelabz;

public class StockAccountManagement {
    public static void main(String[] args){
        int choice = 0;
        System.out.println("Welcome to stock management program");

        StockManager stockManager = new StockManager();
        Account account = new Account();
        do{
            System.out.println("Select the operation from below : " + "\n1.Add Stock" + "\n2.print stock report"+ "\n3.credit Amount" + "\n4.Debit Amount "+ "\n5.Exit From ");
            choice = Input.getInt();

            switch (choice){
                case 1:
                    stockManager.addStocks();
                    break;
                case 2:
                    stockManager.printStockDetails();
                    break;
                case 3:
                    account.creditAmount();
                    break;
                case 4:
                    account.debitAmount();
                case 5:
                    System.out.println("Bye....");
                    break;
                default:
                    System.out.println("Enter Valid operation");
            }
        }while (choice != 5);
    }

}
