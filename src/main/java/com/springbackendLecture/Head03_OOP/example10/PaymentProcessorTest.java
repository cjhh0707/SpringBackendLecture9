package com.springbackendLecture.Head03_OOP.example10;

public class PaymentProcessorTest {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        Payment[] payments = new Payment[]{
                new AccountTransferPayment(),
                new MobilePayment(),
                new CreditCardPayment()
        };
        double[] paymentAmounts = new double[]{
                500, 2000, 1050
        };
        int index = 0;
        for (Payment payment : payments) {
            paymentProcessor.pay(payment, paymentAmounts[index++]);
        }
    }
}
