package com.springbackendLecture.Head03_OOP.example07.exercise01;

public class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("신용카드: " + amount + "원 결제 처리.");
    }
}
