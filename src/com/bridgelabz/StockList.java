package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

public class StockList {
    private static List<StockPortfolio> stocks = new ArrayList<>();
    private static double totalValue;

    public static List<StockPortfolio> getStocks() {
        return stocks;
    }

    public static void setStocks(List<StockPortfolio> stocks) {
        StockList.stocks = stocks;
    }

    public static double getTotalValue() {
        return totalValue;
    }

    public static void setTotalValue(double totalValue) {
        StockList.totalValue = totalValue;
    }
}
