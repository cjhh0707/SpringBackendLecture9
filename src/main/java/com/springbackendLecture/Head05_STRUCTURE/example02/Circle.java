package com.springbackendLecture.Head05_STRUCTURE.example02;

public class Circle implements Shape {
    private double radius;
    public Circle(double radius) { this.radius = radius; }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
