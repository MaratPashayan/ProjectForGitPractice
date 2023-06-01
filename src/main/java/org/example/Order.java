package org.example;

public class Order {
    private final int id;
    private String number;
    private String customerName;
    private String status;
    private boolean cancelled;

    public Order(int id, String number, String customerName, String status, boolean cancelled) {
        this.id = id;
        this.number = number;
        this.customerName = customerName;
        this.status = status;
        this.cancelled = cancelled;
    }

    public int getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getStatus() {
        return status;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }
}
