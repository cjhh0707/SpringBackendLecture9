package com.springbackendLecture.Head02_JavaProgramming;

public class TernaryExample {
    public static void main(String[] args) {
        int score = 85;
        String result = (score >= 90) ? "A학점" : "B학점";
        System.out.println("성적: " + result);
    }
}
