package com.bridgelabz;

public interface StockAccountService {

    double valueOf();

    void buyShare(double amount, String name);

    void sellShare(double amount, String name);

    void printStockDetails();
}
