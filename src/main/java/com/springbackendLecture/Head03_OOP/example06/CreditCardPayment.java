package com.springbackendLecture.Head03_OOP.example06;

public class CreditCardPayment extends AbstractPayment {

    @Override
    public void pay(double amount) {
        System.out.println("신용카드로 " + amount + "원 결제 완료.");
    }

    @Override
    public void cancel(double amount) {
        System.out.println("신용카드 결제 취소: " + amount + "원 환불.");
    }
}