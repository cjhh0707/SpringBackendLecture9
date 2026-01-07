package com.springbackendLecture.Head03_OOP.example13;

public abstract class AbstractTask {
    public abstract void execute();
    public void start() {
        System.out.println("Task start");
    }
}
