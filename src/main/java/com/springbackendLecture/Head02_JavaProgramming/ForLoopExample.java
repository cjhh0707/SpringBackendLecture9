package com.springbackendLecture.Head02_JavaProgramming;

public class ForLoopExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        int [] score = {90, 85, 78};
        for (int s : score) {
            System.out.println("점수: " + s);
        }
    }
}
