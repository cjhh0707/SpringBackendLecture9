package com.springbackendLecture.Head03_OOP.example14;

public class EnumSwitchTest {
    public enum OrderStatus {
        ORDERED, READY, DELIVERED
    }

    public static void printStatus(OrderStatus status) {
        switch (status) {
            case ORDERED:
                System.out.println("주문");
                break;
            case READY:
                System.out.println("준비");
                break;
            case DELIVERED:
                System.out.println("배송");
                break;
        }
    }

    public static void main(String[] args) {
        printStatus(OrderStatus.READY);
    }
}
