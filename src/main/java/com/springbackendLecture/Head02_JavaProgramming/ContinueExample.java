package com.springbackendLecture.Head02_JavaProgramming;

public class ContinueExample {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) continue; //짝수일때는 컨티뉴로 다시 for 문으로 올라감
            System.out.println(i);
        }
    }
}
