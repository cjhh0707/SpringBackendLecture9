package com.springbackendLecture.Head03_OOP.example13;

public class AnonymousClassDemo {
    public static void main(String[] args) {
        AbstractTask customTask = new AbstractTask() {
            @Override
            public void execute() {
                System.out.println("Task execute");
            }

            @Override
            public void start() {
                System.out.println("Task start1");
            }
        };
        customTask.execute();
        customTask.start();
    }
}
