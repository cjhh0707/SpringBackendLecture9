package com.springbackendLecture.Head03_OOP.example3;

public class Order {
    private String orderId;
    private boolean isPaid;
    private String name;

    public Order() {
        this.orderId = "NONE";
        this.isPaid = false;
    }

    public Order(String orderId, String name) {
        this.orderId = orderId;
        this.name = name;
    }

     public String getOrderId() {
        return this.orderId;
     }
     public boolean getIsPaid() {
        return this.isPaid;
     }
     public void setOrderId(String orderId) {
        this.orderId = orderId;
     }
     public void setIsPaid(boolean isPaid) {
        this.isPaid = isPaid;
     }
}
