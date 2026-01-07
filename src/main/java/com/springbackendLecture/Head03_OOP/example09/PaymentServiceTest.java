package com.springbackendLecture.Head03_OOP.example09;

public class PaymentServiceTest {
    public static void main(String[] args) {
        UserAccount account = new UserAccount("01");
        PaymentService paymentService = new PaymentService();

        account.deposit(10000);
        System.out.println("입금완료. 잔액: " + account.getBalance());

        try {
            account.deposit(-5000);
        } catch (IllegalArgumentException e) {
            System.out.println("에러(음수): " + e.getMessage());
        }

        try {
            paymentService.processPayment(account, -500);
        } catch (IllegalArgumentException e) {
            System.out.println("에러(음수출금): " + e.getMessage());
        }

        try {
            paymentService.processPayment(account, 50000);
        } catch (IllegalStateException e) {
            System.out.println("잔액부족: " + e.getMessage());
        }

        paymentService.processPayment(account, 3000);
        paymentService.processRefund(account, 1000);

    }
}
