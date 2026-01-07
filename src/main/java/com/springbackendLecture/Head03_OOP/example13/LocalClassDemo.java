package com.springbackendLecture.Head03_OOP.example13;

public class LocalClassDemo {
    public void executeTask() {
        final int taskId = 999;

        //메소드 내부에 클래스 정의
        class LocalWorker {
            public void run() {
                System.out.println("LocalWorker started with taskId = " + taskId);
            }
        }
        LocalWorker worker = new LocalWorker();
        worker.run();
    }

    public static void main(String[] args) {
        LocalClassDemo demo = new LocalClassDemo();
        demo.executeTask();
    }
}
