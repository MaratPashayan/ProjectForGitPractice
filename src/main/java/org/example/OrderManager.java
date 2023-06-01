package org.example;

import java.util.ArrayList;
import java.util.List;

public class OrderManager {
    private List<Order> orders;

    public OrderManager() {
        orders = new ArrayList<>();
    }

    public List<Order> getOrderList() {
        return orders;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public List<Order> searchOrders(String searchQuery) {
        List<Order> foundOrders = new ArrayList<>();
        for (Order order : orders) {
            if (order.getNumber().contains(searchQuery) || order.getCustomerName().contains(searchQuery)) {
                foundOrders.add(order);
            }
        }
        return foundOrders;
    }

    public Order getOrderById(int orderId) {
        for (Order order : orders) {
            if (order.getId() == orderId) {
                return order;
            }
        }
        return null;
    }
    public List<Order> getOrdersByPage(int pageNumber, int pageSize) {
        int startIndex = (pageNumber - 1) * pageSize;
        int endIndex = Math.min(startIndex + pageSize, orders.size());
        return orders.subList(startIndex, endIndex);
    }
    public void updateOrderStatus(int orderId, String status) {
        Order order = getOrderById(orderId);
        if (order != null) {
            order.setStatus(status);
        }
    }
    public void cancelOrder(int orderId) {
        Order order = getOrderById(orderId);
        if (order != null) {
            order.setCancelled(true);
        }
    }
}
