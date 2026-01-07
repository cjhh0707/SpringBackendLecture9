package com.springbackendLecture.Head03_OOP.example06;

public class Order {
    // 인터페이스 대신 추상 클래스 타입을 사용
    private AbstractPayment payment;

    public Order(AbstractPayment payment) {
        this.payment = payment;
    }

    public void process(double amount) {
        payment.pay(amount);
    }

    public void cancel(double amount) {
        payment.cancel(amount);
    }
}