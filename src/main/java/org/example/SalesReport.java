package org.example;

import java.util.List;

public class SalesReport {
    private List<Order> orders;
    private double totalSales;

    public SalesReport(List<Order> orders, double totalSales) {
        this.orders = orders;
        this.totalSales = totalSales;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public double getTotalSales() {
        return totalSales;
    }
}
