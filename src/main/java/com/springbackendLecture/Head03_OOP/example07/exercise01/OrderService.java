package com.springbackendLecture.Head03_OOP.example07.exercise01;

public class OrderService {
    public void processPayment(Payment paymentMethod, double amount) {
        paymentMethod.pay(amount);
    }
}
