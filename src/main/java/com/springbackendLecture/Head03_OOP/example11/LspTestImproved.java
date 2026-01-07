package com.springbackendLecture.Head03_OOP.example11;

public class LspTestImproved {
    public static void main(String[] args) {
        Shape rect = new Rectangle(5, 10);
        System.out.println("Rectangle area: " + rect.getArea());

        Shape square = new Square(5);
        System.out.println("Square area: " + square.getArea());
    }
}
