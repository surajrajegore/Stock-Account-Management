package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

public class StockManager implements StockAccountService {

    public double valueOf() {
        System.out.println("Your account Balance is :" + Account.getAccountBalance());
        return Account.getAccountBalance();
    }

    public StockPortfolio findStock(String name) {
        List<StockPortfolio> temp = StockList.getStocks();

        for (StockPortfolio stock : temp) {
            if (stock.getStockName().equals(name)) {
                return stock;
            }
        }
        return null;
    }

    public StockPortfolio createStock(String name) {
        List<StockPortfolio> temp = StockList.getStocks();
        System.out.println("Enter share value: ");
        double priceOfShare = Input.getDouble();

        StockPortfolio stock = new StockPortfolio();
        stock.setStockName(name);
        stock.setNumberOfShares(0);
        stock.setSharePrice(priceOfShare);
        temp.add(stock);

        StockList.setStocks(temp);
        return stock;
    }

    public void buyShare(double amount, String symbol) {
        if (amount > Account.getAccountBalance()) {
            System.out.println("Insufficient account balance please recharge your account.....");
            return;
        }
        StockPortfolio portfolio = findStock(symbol);
        if (portfolio == null) {
            portfolio = createStock(symbol);
        }
        double numofShares = (amount / portfolio.getSharePrice());
        double debitValue = numofShares * portfolio.getSharePrice();

        Account.debitAmount(debitValue);

        portfolio.setNumberOfShares(numofShares + portfolio.getNumberOfShares());
        portfolio.setTotalSharePrice(portfolio.getNumberOfShares() * portfolio.getSharePrice());

    }

    public void sellShare(double amount, String symbol) {
        StockPortfolio portfolio = findStock(symbol);
        if (portfolio == null) {
            System.out.println("stock is not available please try again....");
            return;
        }
        double numofShares = (amount / portfolio.getSharePrice());
        if (numofShares > portfolio.getNumberOfShares()) {
            numofShares = portfolio.getNumberOfShares();
        }
        portfolio.setNumberOfShares(portfolio.getNumberOfShares() - numofShares);
        double stockValue = portfolio.getNumberOfShares() * portfolio.getSharePrice();
        portfolio.setTotalSharePrice(stockValue);

        double creditValue = portfolio.getSharePrice() * numofShares;
        Account.creditAmount(creditValue);
    }


    public void printStockDetails() {
        List<StockPortfolio> stockList = StockList.getStocks();
        for (StockPortfolio stock : stockList) {
            System.out.println(stock);
        }
        System.out.println("total value of stock is:" + StockList.getTotalValue());
    }
}
