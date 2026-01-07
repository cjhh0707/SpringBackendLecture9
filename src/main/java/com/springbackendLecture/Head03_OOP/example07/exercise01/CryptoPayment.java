package com.springbackendLecture.Head03_OOP.example07.exercise01;

public class CryptoPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("가상화폐: " + amount + "원 결제 처리.");
    }
}
