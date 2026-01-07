package com.springbackendLecture.Head03_OOP.example14;

public class PaymentMethodDemo {
    public static void main(String[] args) {
        for (PaymentMethod paymentMethod : PaymentMethod.values()) {
            System.out.println(paymentMethod.name() + " => " + paymentMethod.getDisplayName());
        }
    }
}
