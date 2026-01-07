package com.springbackendLecture.Head03_OOP.example06;

public class Topic03ExampleMain {
    public static void main(String[] args) {
        // 1. 신용카드 결제 테스트
        System.out.println("--- 신용카드 ---");
        Order o1 = new Order(new CreditCardPayment());
        o1.process(50000);
        o1.cancel(50000); // 취소 기능도 테스트

        // 2. 계좌이체 테스트
        System.out.println("\n--- 계좌이체 ---");
        Order o2 = new Order(new AccountTransferPayment());
        o2.process(30000);
        o2.cancel(30000); // 취소 기능도 테스트

        // 3. 가상화폐 테스트
        System.out.println("\n--- 가상화폐 ---");
        Order o3 = new Order(new CryptoPayment());
        o3.process(50000);
        o3.cancel(50000);
    }
}