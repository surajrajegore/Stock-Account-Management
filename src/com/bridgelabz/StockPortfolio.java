package com.bridgelabz;

public class StockPortfolio {
    private String stockName;
    private double numberOfShares;
    private double sharePrice;
    private double totalSharePrice;

    public double getTotalSharePrice() {
        return totalSharePrice;
    }

    public void setTotalSharePrice(double totalSharePrice) {
        this.totalSharePrice = totalSharePrice;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public double getNumberOfShares() {
        return numberOfShares;
    }

    public void setNumberOfShares(double numberOfShares) {
        this.numberOfShares = numberOfShares;
    }

    public double getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(double sharePrice) {
        this.sharePrice = sharePrice;
    }

    @Override
    public String toString() {
        return "StockPortfolio{" +
                "stockName='" + stockName + '\'' +
                ", numberOfShares=" + numberOfShares +
                ", sharePrice=" + sharePrice +
                ", totalSharePrice=" + totalSharePrice +
                '}';
    }
}
