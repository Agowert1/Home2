package com.example;

public class Main {
    public static void main(String[] args) {
        int[] sales = {100, 200, 150, 300, 250};
        SalesManager manager = new SalesManager(sales);
        int maxSale = manager.max();
        System.out.println("Max sale: " + maxSale);
    }
}
