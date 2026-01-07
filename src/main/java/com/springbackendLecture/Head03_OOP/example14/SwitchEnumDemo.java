package com.springbackendLecture.Head03_OOP.example14;

public class SwitchEnumDemo {
    public static void main(String[] args) {
        PaymentMethod method = PaymentMethod.CREDIT_CARD;
        switch (method) {
            case CREDIT_CARD:
                System.out.println("결제방법1: " + method.getDisplayName());
                break;
            case ACCOUNT_TRANSFER:
                System.out.println("결제방법2: " + method.getDisplayName());
                break;
            case MOBILE_PAYMENT:
                System.out.println("결제방법3: " + method.getDisplayName());
                break;

        }
    }
}
