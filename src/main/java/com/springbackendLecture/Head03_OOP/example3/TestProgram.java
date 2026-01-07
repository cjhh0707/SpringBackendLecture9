package com.springbackendLecture.Head03_OOP.example3;

public class TestProgram {
    public static void main(String[] args) {
        //Order order = new Order();

        //Order order = new Order("1212", true);
        Order order = new Order("문자열", "최재훈");
        System.out.println(order.getOrderId());
        System.out.println(order.getIsPaid());

        order.setOrderId("123");
        order.setIsPaid(false);

        System.out.println(order.getOrderId());
        System.out.println(order.getIsPaid());
    }
}
