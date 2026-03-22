package com.springbackendLecture.Head05_STRUCTURE.example02;

public class ShapeExtendExample {
    public static void main(String[] args) {
        ShapeContainer<Circle> container = new ShapeContainer<>();
        container.add(new Circle(2.0));
        container.add(new Circle(3.0));
        System.out.println(container.totalArea());
    }
}
