package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

public class StockManager {
    Input input = new Input();

    public void addStocks() {
        double sumofAllStocks = 0;
        double stockPrice = 0;
        System.out.println("Enter Number of stocks You want to add");
        int numberOfStocks = Input.getInt();

        List<StockPortfolio> tempStock = StockList.getStocks();
        for (int i = 0; i < numberOfStocks; i++) {
            StockPortfolio stockPortfolio = new StockPortfolio();

            System.out.println("Enter name of stock");
            stockPortfolio.setStockName(Input.getString());

            System.out.println("Enter How many Shares You want to buy");
            stockPortfolio.setNumberOfShares(Input.getDouble());

            System.out.println("Enter the price of per share");
            stockPortfolio.setSharePrice(Input.getDouble());

            stockPrice = stockPortfolio.getNumberOfShares() * stockPortfolio.getSharePrice();
            stockPortfolio.setTotalSharePrice(stockPrice);

            tempStock.add(stockPortfolio);
            StockList.setStocks(tempStock);

            sumofAllStocks  = sumofAllStocks + stockPrice;

        }
        StockList.setTotalValue(sumofAllStocks);

    }
    public void printStockDetails(){
        List<StockPortfolio> stockList = StockList.getStocks();
        for (StockPortfolio stock :stockList){
            System.out.println(stock);
        }
        System.out.println("total value of stock is:"+StockList.getTotalValue());
    }
}
